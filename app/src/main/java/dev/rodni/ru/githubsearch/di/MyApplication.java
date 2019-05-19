package dev.rodni.ru.githubsearch.di;

import android.app.Application;

public class MyApplication extends Application {
    private static ApplicationComponent applicationComponent;

    public static ApplicationComponent getApplicationComponent() { return applicationComponent; }

    @Override
    public void onCreate() {
        super.onCreate();

        initializeInjector();
    }

    private void initializeInjector() {
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }
}
