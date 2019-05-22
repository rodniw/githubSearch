package dev.rodni.ru.githubsearch.auth;

import javax.inject.Inject;

import dev.rodni.ru.githubsearch.data.authservice.AuthService;
import dev.rodni.ru.githubsearch.utils.SchedulerProvider;
import io.reactivex.disposables.CompositeDisposable;

public class AuthPresenter implements AuthContract.Presenter{

    private AuthContract.View view;
    private AuthService authSource;
    private SchedulerProvider schedulerProvider;
    private CompositeDisposable compositeDisposable;

    @Inject
    public AuthPresenter(AuthContract.View view,
                         AuthService authSource,
                         SchedulerProvider schedulerProvider
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
