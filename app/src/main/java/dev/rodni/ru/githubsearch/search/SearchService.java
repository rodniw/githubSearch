package dev.rodni.ru.githubsearch.search;

import java.util.List;

import dev.rodni.ru.githubsearch.data.reposmodel.Repo;
import io.reactivex.Maybe;

public class SearchService implements SearchSource {

    private static SearchService instanceSearchService;

    private SearchService() {
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
