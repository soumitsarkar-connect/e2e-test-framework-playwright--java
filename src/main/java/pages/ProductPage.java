package pages;

import com.microsoft.playwright.Page;

public class ProductPage {
    private final Page page;

    public ProductPage(Page page) {
        this.page = page;
    }

    public void selectOptionInSortDropdown(String optionText) {
        page.locator("[data-test='product-sort-container']")
                .selectOption(optionText);
    }
}
