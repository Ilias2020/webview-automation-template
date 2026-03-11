package components;

import com.codeborne.selenide.SelenideElement;

public class ProductCard {

    private final SelenideElement root;

    public ProductCard(SelenideElement root) {
        this.root = root;
    }

}