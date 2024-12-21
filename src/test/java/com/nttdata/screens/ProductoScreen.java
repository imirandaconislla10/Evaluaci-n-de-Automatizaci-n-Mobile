package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductoScreen extends PageObject {


    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement lblProducto;


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement imgProducto;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bolt T-Shirt\"]")
    private WebElement imgProductoTShirt;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bike Light\"]")
    private WebElement imgProductoBikeLight;


    public boolean isProductoDisplayed() {

        waitFor(ExpectedConditions.visibilityOf(lblProducto));
        return lblProducto.isEnabled();
    }



    public void clickImgProducto() {
        imgProducto.click();
    }

    public void clickProductoTShirt() {
        imgProductoTShirt.click();
    }

    public void clickProductoBikeLight() {
        imgProductoBikeLight.click();
    }


}
