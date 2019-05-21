package dev.rodni.ru.githubsearch.auth;

import dev.rodni.ru.githubsearch.base.BasePresenter;
import dev.rodni.ru.githubsearch.base.BaseView;

public interface AuthContract {

    interface View extends BaseView<BasePresenter> {

        void handleLogInBtn();

        void handleGuestBtn();

    }

    interface Presenter extends BasePresenter {

        //void onAuthGitHub(String code);

        //void onCancelAuthButtonClick();
    }
}
