package components;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class Text {
    private final Page page;

    public Text(Page page) {
        this.page = page;
    }

    public Locator getElementByText(String text, boolean exactMatch) {
        return page.getByText(text, new Page.GetByTextOptions().setExact(exactMatch));
    }
}
