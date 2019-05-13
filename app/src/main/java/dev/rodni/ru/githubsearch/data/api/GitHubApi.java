package dev.rodni.ru.githubsearch.data.api;

import dev.rodni.ru.githubsearch.data.authmodel.AccessToken;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface GitHubApi {

    @Headers("Accept: application/json")
    @POST("login/oauth/access_token")
    @FormUrlEncoded
    Call<AccessToken> getAccessToken(
            @Field("client_id") String cliendId,
            @Field("client_secret") String cliendSecret,
            @Field("code") String code
            );
}
