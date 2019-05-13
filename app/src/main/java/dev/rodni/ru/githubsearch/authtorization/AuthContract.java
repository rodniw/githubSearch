package dev.rodni.ru.githubsearch.authtorization;

import dev.rodni.ru.githubsearch.base.BasePresenter;
import dev.rodni.ru.githubsearch.base.BaseView;

public interface AuthContract {

    interface View extends BaseView<BasePresenter> {

    }

    interface Presenter extends BasePresenter {
        void onStopAuthButtonClick();
    }
}
