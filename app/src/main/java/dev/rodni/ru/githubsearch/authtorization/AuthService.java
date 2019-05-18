package dev.rodni.ru.githubsearch.authtorization;

import io.reactivex.Completable;

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

    @Override
    public Completable getUserUniqueId() {
        return null;
    }
}
