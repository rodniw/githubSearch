package dev.rodni.ru.githubsearch.authtorization;

import dev.rodni.ru.githubsearch.utils.BaseSchedulerProvider;
import io.reactivex.disposables.CompositeDisposable;

public class AuthPresenter implements AuthContract.Presenter{

    private AuthContract.View view;
    private AuthSource authSource;
    private BaseSchedulerProvider schedulerProvider;
    private CompositeDisposable compositeDisposable;

    public AuthPresenter(AuthContract.View view,
                         AuthSource authSource,
                         BaseSchedulerProvider schedulerProvider
                         ) {
        this.view = view;
    }

    @Override
    public void onStopAuthButtonClick() {

    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unsubscribe() {

    }
}
