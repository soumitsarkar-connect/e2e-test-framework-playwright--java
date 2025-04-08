package components;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class Link {
    private final Page page;

    public Link(Page page) {
        this.page = page;
    }

    public Locator getByLink(String linkText, boolean exactMatch) {
        return page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(linkText).setExact(exactMatch));
    }
}
