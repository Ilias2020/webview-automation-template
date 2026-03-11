package pages;

import io.qameta.allure.Step;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class CatalogPage {

    private final SelenideElement title = $x("//span[text()='Каталог']");
    private static final String PAGE_URL = "/catalog?query=&tab=all";

    @Step("Проверить, что страница каталога открыта")
    public boolean isPageOpened() {
        title.shouldBe(visible);
        return true;
    }

    @Step("Открыть страницу каталога")
    public void open() {
        Selenide.open(PAGE_URL);
    }
}
