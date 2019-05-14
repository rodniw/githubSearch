package dev.rodni.ru.githubsearch.authtorization;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import dev.rodni.ru.githubsearch.R;
import dev.rodni.ru.githubsearch.base.BaseActivity;

public class AuthActivity extends BaseActivity {

    public static final String AUTH_FRAGMENT = "AUTH_FRAGMENT";

    //private FragmentManager manager;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setUpAuthFragment();
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_auth;
    }

    @Override
    protected void setUpAuthFragment() {
        FragmentManager manager = this.getSupportFragmentManager();

        AuthFragment fragment = (AuthFragment) manager.findFragmentByTag(AUTH_FRAGMENT);

        if (fragment == null) {
            fragment = AuthFragment.getInstance();
        }

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.auth_fragment, fragment, AUTH_FRAGMENT)
                .commit();
    }
}
