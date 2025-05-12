package config;

public class Config {

    public static final String BROWSER_TYPE = "chrome";

    //if true, cookies and storage are cleared after each test
    public static final boolean CLEAR_COOKIES_AND_LOCAL_STORAGE = true;

    //if true, browser is quit after each test
    public static final boolean QUIT_BROWSER = true;

    public static class PageURLs {
        public static final String HOME_URL = "https://magisteria.ru";
    }

    public static class CreditsInfo {
        public static final String MAIL = "elenansalnikova@yandex.ru";
        public static final String PASSWORD = "zhoparu";
    }
}
