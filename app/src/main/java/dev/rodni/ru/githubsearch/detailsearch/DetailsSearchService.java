package dev.rodni.ru.githubsearch.detailsearch;

public class DetailsSearchService implements DetailsSearchSource {

    private static DetailsSearchService instanceDetailsSearchService;

    private DetailsSearchService() {
    }

    public static DetailsSearchService getInstanceDetailsSearchService(){
        if (instanceDetailsSearchService == null) {
            instanceDetailsSearchService = new DetailsSearchService();
        }
        return instanceDetailsSearchService;
    }
}
