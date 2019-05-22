package dev.rodni.ru.githubsearch.di;

import android.app.Application;

import dev.rodni.ru.githubsearch.di.component.ApplicationComponent;
import dev.rodni.ru.githubsearch.di.module.ApplicationModule;

public class MyApplication extends Application {
    private static ApplicationComponent applicationComponent;

    public static ApplicationComponent getApplicationComponent() { return applicationComponent; }

    @Override
    public void onCreate() {
        super.onCreate();

        initializeInjector();
    }

    private void initializeInjector() {

        ApplicationModule applicationModule = new ApplicationModule(
                getApplicationContext()
        );

        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(applicationModule)
                .build();
    }
}
