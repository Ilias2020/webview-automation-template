package tests;


import com.codeborne.selenide.Selenide;
import core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CatalogPage;


import static com.codeborne.selenide.Selenide.sleep;

public class CatalogPageTest extends BaseTest {

    @Test
    public void catalogPageShouldOpen() {

        CatalogPage catalogPage = new CatalogPage();
        catalogPage.open();
        Assert.assertTrue(catalogPage.isPageOpened(), "Каталог не открылся");
    }
}