package tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import core.BaseTest;
import org.testng.Assert;
import pages.CatalogPage;

public class CatalogPageTest extends BaseTest {

    @Test(description = "Открытие страницы каталога авторизованным пользователем")
    @Description("Проверка, что страница каталога открывается у уже авторизованного пользователя")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Каталог")
    @Story("Открытие каталога")
    public void catalogPageShouldOpen() {

        CatalogPage catalogPage = new CatalogPage();
        catalogPage.open();
        Assert.assertTrue(catalogPage.isPageOpened(), "Каталог не открылся");
    }
}