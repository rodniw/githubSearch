package dev.rodni.ru.githubsearch.search;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import dev.rodni.ru.githubsearch.R;
import dev.rodni.ru.githubsearch.base.BaseActivity;

public class SearchActivity extends BaseActivity {

    public static final String SEARCH_FRAGMENT = "SEARCH_FRAGMENT";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setUpFragment();
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_search;
    }

    @Override
    protected void setUpFragment() {
        FragmentManager manager = this.getSupportFragmentManager();

        SearchFragment fragment = (SearchFragment) manager.findFragmentByTag(SEARCH_FRAGMENT);

        if (fragment == null) {
            fragment = SearchFragment.getInstance();
        }

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.search_fragment, fragment, SEARCH_FRAGMENT)
                .commit();
    }
}
