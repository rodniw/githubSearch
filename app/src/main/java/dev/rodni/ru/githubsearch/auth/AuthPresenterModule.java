package dev.rodni.ru.githubsearch.auth;

import dagger.Module;
import dagger.Provides;
import dev.rodni.ru.githubsearch.utils.FragmentScoped;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@FragmentScoped
@Module
public class AuthPresenterModule {

    @Provides
    public Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .baseUrl("https://github.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //Retrofit retrofit = builder.build();
    }
}
