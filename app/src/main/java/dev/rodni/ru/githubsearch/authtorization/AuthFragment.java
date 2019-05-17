package dev.rodni.ru.githubsearch.authtorization;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dev.rodni.ru.githubsearch.R;
import dev.rodni.ru.githubsearch.base.BasePresenter;
import dev.rodni.ru.githubsearch.utils.BaseSchedulerProvider;
import dev.rodni.ru.githubsearch.utils.SchedulerProvider;

public class AuthFragment extends Fragment implements AuthContract.View {

    private AuthContract.Presenter presenter;

    public AuthFragment() { }

    public static AuthFragment getInstance(){
        return new AuthFragment();
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

        View v = inflater.inflate(R.layout.fragment_auth, container, false);

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (presenter == null) {
            presenter = new AuthPresenter(this,
                    AuthService.getInstanceAuthService(),
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
    public void setPresenter(BasePresenter presenter) {

    }

    @Override
    public void makeToast(String message) {

    }
}
