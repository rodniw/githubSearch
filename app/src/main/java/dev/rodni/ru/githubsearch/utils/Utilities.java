package dev.rodni.ru.githubsearch.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Utilities {
    private static final String clientId = "c80a9ec788e74df70a28";
    private static final String clientSecret = "9c818130b3f604b954d29fd774f76f22f9b7972e";
    private static final String redirectUri = "searchgithub://callback";
    private static final String baseUrl = "https://github.com";
    private static int index = 0;

    public static String getClientId() {
        return clientId;
    }

    public static String getClientSecret() {
        return clientSecret;
    }

    public static String getRedirectUri() {
        return redirectUri;
    }

    public static String getBaseUrl() {
        return baseUrl;
    }

    public static int getIndex() {
        return index;
    }

    public static void setIndex(int index) {
        Utilities.index = index;
    }

    public static String toString(Throwable th) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        th.printStackTrace(pw);
        return sw.toString();
    }
}
