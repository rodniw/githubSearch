package dev.rodni.ru.githubsearch.detailsearch;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dev.rodni.ru.githubsearch.R;
import dev.rodni.ru.githubsearch.utils.SchedulerProvider;

public class DetailsSearchFragment extends Fragment implements DetailsSearchContract.View {

    private DetailsSearchContract.Presenter presenter;

    public DetailsSearchFragment() { }

    public static DetailsSearchFragment getInstance(){
        return new DetailsSearchFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //для ориентации
        setRetainInstance(true);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_details_search, container, false);

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (presenter == null) {
            presenter = new DetailsSearchPresenter(this,
                    DetailsSearchService.getInstanceDetailsSearchService(),
                    SchedulerProvider.getInstanceSchedulerProvider());
        }

        presenter.subscribe();
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
    public void setPresenter(DetailsSearchContract.Presenter presenter) {

    }

    @Override
    public void makeToast(String message) {

    }
}
