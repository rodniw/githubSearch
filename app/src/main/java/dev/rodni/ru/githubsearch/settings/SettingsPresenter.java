package dev.rodni.ru.githubsearch.settings;

import dev.rodni.ru.githubsearch.utils.BaseSchedulerProvider;
import io.reactivex.disposables.CompositeDisposable;

public class SettingsPresenter implements SettingsContract.Presenter {

    private SettingsContract.View view;
    private CompositeDisposable compositeDisposable;
    private SettingsSource source;
    private BaseSchedulerProvider schedulerProvider;

    public SettingsPresenter(SettingsContract.View view,
                           SettingsSource source,
                           BaseSchedulerProvider schedulerProvider
    ) {
        this.view = view;
        this.source = source;
        this.schedulerProvider = schedulerProvider;
    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unsubscribe() {

    }

    @Override
    public void onClickLogOut() {

    }
}
