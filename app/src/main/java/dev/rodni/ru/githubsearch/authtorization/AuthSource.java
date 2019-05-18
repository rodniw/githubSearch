package dev.rodni.ru.githubsearch.authtorization;

import io.reactivex.Completable;

//класс описывает взаимодействия между ауфпрезентер и ауфсервис
public interface AuthSource {
    Completable getUserUniqueId();
}
