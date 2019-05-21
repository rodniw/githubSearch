package dev.rodni.ru.githubsearch.auth;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import dev.rodni.ru.githubsearch.R;
import dev.rodni.ru.githubsearch.utils.ActivityUtils;

public class AuthActivity extends AppCompatActivity {

    private FragmentManager manager;

    public static final String AUTH_FRAGMENT = "AUTH_FRAGMENT";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        manager = getSupportFragmentManager();

        createFragment();
    }

    protected void createFragment() {
        AuthFragment fragment =  (AuthFragment) manager.findFragmentByTag(AUTH_FRAGMENT);

        if (fragment == null){
            fragment = AuthFragment.getInstance();
        }

        ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                fragment,
                R.id.fragment_auth,
                AUTH_FRAGMENT
        );
    }
}
