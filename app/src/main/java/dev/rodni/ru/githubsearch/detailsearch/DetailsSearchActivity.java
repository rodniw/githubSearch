package dev.rodni.ru.githubsearch.detailsearch;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import dev.rodni.ru.githubsearch.R;
import dev.rodni.ru.githubsearch.base.BaseActivity;

public class DetailsSearchActivity extends BaseActivity {

    public static final String DETAILS_SEARCH_FRAGMENT = "DETAILS_SEARCH_FRAGMENT";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int getContentView() {
        return 0;
    }

    @Override
    protected void setUpAuthFragment() {
        FragmentManager manager = this.getSupportFragmentManager();

        DetailsSearchFragment fragment = (DetailsSearchFragment) manager.findFragmentByTag(DETAILS_SEARCH_FRAGMENT);

        if (fragment == null) {
            fragment = DetailsSearchFragment.getInstance();
        }

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.details_search_fragment, fragment, DETAILS_SEARCH_FRAGMENT)
                .commit();
    }
}
