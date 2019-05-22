package dev.rodni.ru.githubsearch.auth;

import dagger.Component;
import dev.rodni.ru.githubsearch.di.component.ApplicationComponent;
import dev.rodni.ru.githubsearch.utils.FragmentScoped;

@FragmentScoped
@Component(dependencies = ApplicationComponent.class,
           modules = AuthPresenterModule.class)
public interface AuthComponent {
    void inject(AuthFragment authFragment);
}
