package dev.rodni.ru.githubsearch.utils;

import io.reactivex.Scheduler;

public interface BaseSchedulerProvider {

    Scheduler computation();

    Scheduler io();

    Scheduler ui();
}
