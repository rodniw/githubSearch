package dev.rodni.ru.githubsearch.search;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import javax.inject.Inject;

import dev.rodni.ru.githubsearch.R;
import dev.rodni.ru.githubsearch.data.reposmodel.Repo;
import dev.rodni.ru.githubsearch.detailsearch.DetailsSearchActivity;
import dev.rodni.ru.githubsearch.di.MyApplication;

public class SearchFragment extends Fragment implements SearchContract.View{

    @Inject SearchPresenter presenter;

    public SearchFragment() { }

    public static SearchFragment getInstance(){
        return new SearchFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //для ориентации
        setRetainInstance(true);

        DaggerSearchComponent.builder()
                .searchPresenterModule(new SearchPresenterModule(this))
                .applicationComponent(
                        ((MyApplication) getActivity().getApplication())
                                .getApplicationComponent()
                )
                .build()
                .inject(this);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_search, container, false);

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onDestroy() {
        presenter.unsubscribe();
        super.onDestroy();
    }

    @Override
    public void setPresenter(SearchContract.Presenter presenter) {

    }

    @Override
    public void makeToast(String message) {

    }

    @Override
    public void setReposListData(ArrayList<Repo> reposListData) {

    }

    @Override
    public void setNoReposListDataFound() {

    }

    @Override
    public void startDetailsSearchActivity() {

        Intent intent = new Intent(getActivity(), DetailsSearchActivity.class);
        startActivity(intent);
    }
}
