package dev.rodni.ru.githubsearch.search;

public class SearchPresenter implements SearchContract.Presenter {

    private SearchContract.View view;

    public SearchPresenter(SearchContract.View view) {
        this.view = view;
    }

    @Override
    public void onItemClick() {

    }

    @Override
    public void onOwnerClick() {

    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unsubscribe() {

    }
}
