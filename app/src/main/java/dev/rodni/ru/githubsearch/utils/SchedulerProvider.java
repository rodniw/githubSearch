package dev.rodni.ru.githubsearch.utils;


import javax.inject.Inject;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

//Для использования во время девайс тестов и продакшена
public class SchedulerProvider implements BaseSchedulerProvider {

    private static SchedulerProvider instanceSschedulerProvider;

    @Inject
    public SchedulerProvider() {

    }

    public static SchedulerProvider getInstanceSchedulerProvider() {
        if (instanceSschedulerProvider == null) {
            instanceSschedulerProvider = new SchedulerProvider();
        }

        return instanceSschedulerProvider;
    }

    @Override
    public Scheduler computation() {
        return Schedulers.computation();
    }

    @Override
    public Scheduler io() {
        return Schedulers.io();
    }

    @Override
    public Scheduler ui() {
        return AndroidSchedulers.mainThread();
    }
}
