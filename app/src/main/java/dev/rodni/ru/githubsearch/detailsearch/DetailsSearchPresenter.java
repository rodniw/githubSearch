package dev.rodni.ru.githubsearch.detailsearch;

import dev.rodni.ru.githubsearch.utils.BaseSchedulerProvider;
import io.reactivex.disposables.CompositeDisposable;

public class DetailsSearchPresenter implements DetailsSearchContract.Presenter{

    private DetailsSearchContract.View view;
    private DetailsSearchSource detailsSearchSource;
    private BaseSchedulerProvider schedulerProvider;
    private CompositeDisposable compositeDisposable;

    public DetailsSearchPresenter(DetailsSearchContract.View view,
                         DetailsSearchSource detailsSearchSource,
                         BaseSchedulerProvider schedulerProvider
    ) {
        this.view = view;
        this.detailsSearchSource = detailsSearchSource;
    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unsubscribe() {

    }
}
