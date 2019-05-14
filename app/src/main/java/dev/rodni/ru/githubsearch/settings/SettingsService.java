package dev.rodni.ru.githubsearch.settings;

public class SettingsService implements SettingsSource {

    private static SettingsService instanceSettingsService;

    private SettingsService() {
    }

    public static SettingsService getInstanceSearchService(){
        if (instanceSettingsService == null) {
            instanceSettingsService = new SettingsService();
        }
        return instanceSettingsService;
    }
}
