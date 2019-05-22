package dev.rodni.ru.githubsearch.auth;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import dev.rodni.ru.githubsearch.BuildConfig;
import dev.rodni.ru.githubsearch.data.authmodel.AccessToken;
import dev.rodni.ru.githubsearch.data.authservice.GitHubApi;
import dev.rodni.ru.githubsearch.data.authservice.ServiceGenerator;
import dev.rodni.ru.githubsearch.search.SearchActivity;
import dev.rodni.ru.githubsearch.utils.Utilities;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class OAuthActivity extends AppCompatActivity {

    ProgressBar mProgressBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Utilities.getIndex() == 0) {
            Utilities.setIndex(1);

            Intent intent = new Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://github.com/login/oauth/authorize" + "?client_id=" + Utilities.getClientId()
                            + "&scope=repo&redirect_uri=" + Utilities.getRedirectUri()));
            // This flag is set to prevent the browser with the login form from showing in the history stack
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);

            startActivity(intent);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (Utilities.getIndex() == 1) {
            Uri uri = getIntent().getData();
            if (uri != null && uri.toString().startsWith(Utilities.getRedirectUri())) {
                String code = uri.getQueryParameter("code");
                if (code != null) {
                    // TODO We can probably do something with this code! Show the user that we are logging them in
                    mProgressBar.setVisibility(View.VISIBLE);

                    final SharedPreferences prefs = this.getSharedPreferences(
                            BuildConfig.APPLICATION_ID, Context.MODE_PRIVATE);

                    GitHubApi client = ServiceGenerator.createService(GitHubApi.class);
                    Call<AccessToken> call = client.getNewAccessToken(code, Utilities.getClientId(),
                            Utilities.getClientSecret());
                            //, Utilities.getRedirectUri(),
                            //"authorization_code");

                    call.enqueue(new Callback<AccessToken>() {
                        @Override
                        public void onResponse(Call<AccessToken> call, Response<AccessToken> response) {
                            int statusCode = response.code();
                            if (statusCode == 200) {
                                AccessToken token = response.body();
                                prefs.edit().putBoolean("oauth.loggedin", true).apply();
                                prefs.edit().putString("oauth.accesstoken", token.getAccessToken()).apply();
                                prefs.edit().putString("oauth.refreshtoken", token.getRefreshToken()).apply();
                                //prefs.edit().putString("oauth.tokentype", token.getTokenType()).apply();

                                // TODO Show the user they are logged in

                                Toast.makeText(OAuthActivity.this, token.getAccessToken(), Toast.LENGTH_SHORT).show();

                                Intent intent = new Intent(OAuthActivity.this, SearchActivity.class);
                                startActivity(intent);
                                finish();
                            } else {
                                // TODO Handle errors on a failed response
                                Toast.makeText(OAuthActivity.this, "somethings wrong", Toast.LENGTH_SHORT).show();
                            }
                        }

                        @Override
                        public void onFailure(Call<AccessToken> call, Throwable t) {
                            // TODO Handle failure
                            Toast.makeText(OAuthActivity.this, Utilities.toString(t), Toast.LENGTH_SHORT).show();
                        }
                    });
                } else {
                    // TODO Handle a missing code in the redirect URI
                    Toast.makeText(OAuthActivity.this, "code == null", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}
