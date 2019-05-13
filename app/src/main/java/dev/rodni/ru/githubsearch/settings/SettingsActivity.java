package dev.rodni.ru.githubsearch.settings;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {
    private FragmentManager manager;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        manager = getSupportFragmentManager();
    }
}
