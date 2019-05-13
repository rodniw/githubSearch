package dev.rodni.ru.githubsearch.base;

public interface BaseView<T> {
    void  setPresenter(T presenter);

    void makeToast(String message);
}
