package components;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class NavMenu {
    private final Page page;

    public NavMenu(Page page) {
        this.page = page;
    }

    public Locator getByNavMenu(String navMenu, boolean b) {
        return page.locator("nav")
                .getByRole(AriaRole.LINK, new Locator.GetByRoleOptions()
                        .setName(navMenu)
                        .setExact(true));
    }

}



