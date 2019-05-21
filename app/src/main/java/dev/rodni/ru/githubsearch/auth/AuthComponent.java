package dev.rodni.ru.githubsearch.auth;

import dagger.Component;
import retrofit2.Retrofit;

@Component(modules = AuthPresenterModule.class)
public interface AuthComponent {

    Retrofit getRetrofit();
}
