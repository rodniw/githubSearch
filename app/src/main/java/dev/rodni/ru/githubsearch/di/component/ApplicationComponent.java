package dev.rodni.ru.githubsearch.di.component;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import dev.rodni.ru.githubsearch.di.module.ApplicationModule;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    Context context();
}
