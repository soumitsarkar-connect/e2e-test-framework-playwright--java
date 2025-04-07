package utils;

import com.microsoft.playwright.*;

public class PlaywrightFactory {
    private static Playwright playwright;
    private static Browser browser;
    private static Page page;

    public static void initBrowser(String browserType) {
        playwright = Playwright.create();

        switch (browserType.toLowerCase()) {
            case "chrome":
                browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                        .setChannel("chrome")  // Uses real Chrome
                        .setHeadless(false));
                break;

            case "firefox":
                browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;

            default:
                System.out.println("Invalid browser type! Defaulting to Chromium.");
                browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        }

        BrowserContext context = browser.newContext();
        page = context.newPage();
    }

    public static Page getPage() {
        return page;
    }
    
    public static void closeBrowser() {
        if (browser != null) browser.close();
        if (playwright != null) playwright.close();
    }
}
