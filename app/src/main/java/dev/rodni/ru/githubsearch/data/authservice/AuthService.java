package dev.rodni.ru.githubsearch.data.authservice;

public class AuthService implements AuthSource {

    private static AuthService instanceAuthService;

    private AuthService() {

    }

    public static AuthService getInstanceAuthService() {
        if (instanceAuthService == null) {
            instanceAuthService = new AuthService();
        }

        return instanceAuthService;
    }
}
