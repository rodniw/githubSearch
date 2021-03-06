package dev.rodni.ru.githubsearch.search;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import dev.rodni.ru.githubsearch.R;
import dev.rodni.ru.githubsearch.utils.ActivityUtils;

public class SearchActivity extends AppCompatActivity {

    private FragmentManager manager;

    public static final String SEARCH_FRAGMENT = "SEARCH_FRAGMENT";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        manager = getSupportFragmentManager();

        createFragment();
    }

    protected void createFragment() {
        SearchFragment fragment =  (SearchFragment) manager.findFragmentByTag(SEARCH_FRAGMENT);

        if (fragment == null){
            fragment = SearchFragment.getInstance();
        }

        ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                fragment,
                R.id.fragment_search,
                SEARCH_FRAGMENT
        );
    }
}
