package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CarritoScreen extends PageObject {
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement lblCart;

    public boolean isProductoDisplayed() {

        waitFor(ExpectedConditions.visibilityOf(lblCart));
        return lblCart.isEnabled();
    }
}
