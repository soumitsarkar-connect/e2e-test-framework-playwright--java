package components;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class InputBox {

    private final Page page;

    public InputBox(Page page) {
        this.page = page;
    }

    public Locator getInputBoxByPlaceholder(String placeholderText) {
        return page.getByPlaceholder(placeholderText);
    }
}
