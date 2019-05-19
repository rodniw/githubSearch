package dev.rodni.ru.githubsearch.search;

import dagger.Module;
import dagger.Provides;

@Module
public class SearchPresenterModule {

    private final SearchContract.View view;

    public SearchPresenterModule(SearchContract.View view) {
        this.view = view;
    }

    @Provides
    SearchContract.View provideSearchView() {
        return view;
    }
}
