package dev.rodni.ru.githubsearch.data.searchservice;

import java.util.List;

import javax.inject.Inject;

import dev.rodni.ru.githubsearch.data.reposmodel.Repo;
import io.reactivex.Maybe;

public class SearchService implements SearchSource {

    private static SearchService instanceSearchService;

    @Inject
    public SearchService() {
    }

    public static SearchService getInstanceSearchService(){
        if (instanceSearchService == null) {
            instanceSearchService = new SearchService();
        }
        return instanceSearchService;
    }

    @Override
    public Maybe<List<Repo>> getReposList() {
        return null;
    }
}
