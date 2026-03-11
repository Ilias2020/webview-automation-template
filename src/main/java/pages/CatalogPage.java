package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class CatalogPage {

    private final SelenideElement title = $x("//span[text()='Каталог']");

    public boolean isPageOpened() {
        title.shouldBe(visible);
        return true;
    }
}
