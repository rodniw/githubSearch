package dev.rodni.ru.githubsearch.auth;

import dagger.Module;
import dagger.Provides;

@Module
public class AuthPresenterModule {

    private final AuthContract.View view;

    public AuthPresenterModule(AuthContract.View view) {
        this.view = view;
    }

    @Provides
    AuthContract.View provideAuthView() {
        return view;
    }
}
