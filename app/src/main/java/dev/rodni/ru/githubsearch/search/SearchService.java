package dev.rodni.ru.githubsearch.search;

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
}
