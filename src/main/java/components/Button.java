package components;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class Button {
    private final Page page;

    public Button(Page page) {
        this.page = page;
    }

    public Locator getByLabel(String label, boolean exactMatch) {
        return page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(label).setExact(exactMatch));
    }
}
