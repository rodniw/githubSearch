package dev.rodni.ru.githubsearch.search;

import dev.rodni.ru.githubsearch.utils.BaseSchedulerProvider;
import io.reactivex.disposables.CompositeDisposable;

public class SearchPresenter implements SearchContract.Presenter {

    private SearchContract.View view;
    private CompositeDisposable compositeDisposable;
    private SearchSource source;
    private BaseSchedulerProvider schedulerProvider;

    public SearchPresenter(SearchContract.View view,
                           SearchSource source,
                           BaseSchedulerProvider schedulerProvider
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
