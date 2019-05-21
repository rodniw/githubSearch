package dev.rodni.ru.githubsearch.auth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import dev.rodni.ru.githubsearch.R;
import dev.rodni.ru.githubsearch.base.BasePresenter;
import dev.rodni.ru.githubsearch.data.authservice.AuthService;
import dev.rodni.ru.githubsearch.search.SearchActivity;
import dev.rodni.ru.githubsearch.utils.SchedulerProvider;

//
//    пришлось использовать действие во вью(интент) потому что по мвп интентом нельзя пользоваться в презентере
//    ---------------------------------------------------------------------
//        !!!!попробовать переписать по комманд паттерну!!!!
//

public class AuthFragment extends Fragment implements AuthContract.View {

    private AuthContract.Presenter presenter;

    private Button logInBtn;
    private Button guestBtn;

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

    @Override
    public void onResume() {
        super.onResume();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_auth, container, false);

        logInBtn = (Button) v.findViewById(R.id.log_in_btn);
        guestBtn = (Button) v.findViewById(R.id.guest_in_btn);

        logInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleLogInBtn();
            }
        });

        guestBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleGuestBtn();
            }
        });

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
        super.onDestroy();
    }

    @Override
    public void setPresenter(BasePresenter presenter) {

    }

    @Override
    public void makeToast(String message) {

    }

    @Override
    public void handleLogInBtn() {
        Intent intent = new Intent(getActivity(), OAuthActivity.class);
        startActivity(intent);
    }

    @Override
    public void handleGuestBtn() {
        Intent intent = new Intent(getActivity(), SearchActivity.class);
        startActivity(intent);
    }
}
