package dev.rodni.ru.githubsearch.search;

import dagger.Component;
import dev.rodni.ru.githubsearch.di.ApplicationComponent;
import dev.rodni.ru.githubsearch.utils.FragmentScoped;

@FragmentScoped
@Component(dependencies = ApplicationComponent.class,
           modules = SearchPresenterModule.class)
public interface SearchComponent {
    void inject(SearchFragment searchFragment);
}
