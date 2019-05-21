package dev.rodni.ru.githubsearch.settings;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import dev.rodni.ru.githubsearch.R;
import dev.rodni.ru.githubsearch.base.BaseActivity;

public class SettingsActivity extends BaseActivity {

    public static final String SETTINGS_FRAGMENT = "SETTINGS_FRAGMENT";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setUpFragment();
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_settings;
    }

    @Override
    protected void setUpFragment() {
        FragmentManager manager = this.getSupportFragmentManager();

        SettingsFragment fragment = (SettingsFragment) manager.findFragmentByTag(SETTINGS_FRAGMENT);

        if (fragment == null) {
            fragment = SettingsFragment.getInstance();
        }

        FragmentTransaction transaction = manager.beginTransaction();
        //transaction.replace(R.id.search_fragment, fragment, SETTINGS_FRAGMENT)
        //        .commit();
    }
}
