package dev.rodni.ru.githubsearch.search;

import java.util.List;

import dev.rodni.ru.githubsearch.data.reposmodel.Repo;
import io.reactivex.Maybe;

public interface SearchSource {
    Maybe<List<Repo>> getReposList();
}
