package dev.rodni.ru.githubsearch.auth;

import dev.rodni.ru.githubsearch.data.authservice.AuthSource;
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
    public void subscribe() {

    }

    @Override
    public void unsubscribe() {

    }
}
