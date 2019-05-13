package dev.rodni.ru.githubsearch.authtorization;

public class AuthService implements AuthSource {

    private static AuthService instanceAuthService;

    private AuthService() {
    }

    public static AuthService getInstanceAuthService(){
        if (instanceAuthService == null) {
            instanceAuthService = new AuthService();
        }
        return instanceAuthService;
    }
}
