package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class CartPage {
    private final Page page;

    public CartPage(Page page) {
        this.page = page;
    }

    public Locator getAddToCartLocator(String linkText) {
        Locator productLocator = page.locator(".inventory_item_description")
                .filter(new Locator.FilterOptions().setHasText(linkText));
        return productLocator.getByRole(AriaRole.BUTTON,
                new Locator.GetByRoleOptions().setName("Add to cart"));
    }

    public Locator getByCartIconNumber(String number, boolean exactMatch) {
        return page.locator(".shopping_cart_link")
                .getByText(number, new Locator.GetByTextOptions().setExact(exactMatch));
    }

    public Locator getByCartIconLink() {
        return page.locator(".shopping_cart_link");
    }
}

