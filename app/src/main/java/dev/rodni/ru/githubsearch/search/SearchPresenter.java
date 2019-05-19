package dev.rodni.ru.githubsearch.search;

import javax.inject.Inject;

import dev.rodni.ru.githubsearch.utils.SchedulerProvider;
import io.reactivex.disposables.CompositeDisposable;

public class SearchPresenter implements SearchContract.Presenter {

    private SearchContract.View view;
    private CompositeDisposable compositeDisposable;
    private SearchService source;
    private SchedulerProvider schedulerProvider;

    @Inject
    public SearchPresenter(SearchContract.View view,
                           SearchService source,
                           SchedulerProvider schedulerProvider
                           ) {
        this.view = view;
        this.source = source;
        this.schedulerProvider = schedulerProvider;
    }

    @Override
    public void onItemClick() {

    }

    @Override
    public void onOwnerClick() {

    }

    @Override
    public void onSwipeRefresh() {

    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unsubscribe() {

    }
}
