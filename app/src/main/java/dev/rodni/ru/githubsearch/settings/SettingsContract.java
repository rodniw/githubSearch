package dev.rodni.ru.githubsearch.settings;

import dev.rodni.ru.githubsearch.base.BasePresenter;
import dev.rodni.ru.githubsearch.base.BaseView;

public interface SettingsContract {

    interface View extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter {
        void onClickLogOut();
    }
}
