package dev.rodni.ru.githubsearch.search;

import java.util.ArrayList;

import dev.rodni.ru.githubsearch.base.BasePresenter;
import dev.rodni.ru.githubsearch.base.BaseView;
import dev.rodni.ru.githubsearch.data.reposmodel.Repo;

public interface SearchContract {

    interface View extends BaseView<Presenter> {
        void setReposListData(ArrayList<Repo> reposListData);

        void setNoReposListDataFound();

        void startDetailsSearchActivity();
    }

    interface Presenter extends BasePresenter {
        void onItemClick();

        void onOwnerClick();

        void onSwipeRefresh();
    }
}
