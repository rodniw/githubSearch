package dev.rodni.ru.githubsearch.utils;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

//для тестов, которые требуют планировщиков
public class ImmediateSchedulerProvider implements BaseSchedulerProvider {
    @Override
    public Scheduler computation() {
        return Schedulers.trampoline();
    }

    @Override
    public Scheduler io() {
        return Schedulers.trampoline();
    }

    @Override
    public Scheduler ui() {
        return Schedulers.trampoline();
    }
}
