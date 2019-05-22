package dev.rodni.ru.githubsearch.data.authservice;

import javax.inject.Inject;

public class AuthService implements AuthSource {

    private static AuthService instanceAuthService;

    @Inject
    public AuthService() {

    }

    public static AuthService getInstanceAuthService() {
        if (instanceAuthService == null) {
            instanceAuthService = new AuthService();
        }

        return instanceAuthService;
    }
}
