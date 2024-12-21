package com.nttdata.steps;

import com.nttdata.screens.AddProductScreen;
import com.nttdata.screens.CarritoScreen;
import com.nttdata.screens.ProductoScreen;
import org.junit.Assert;

public class CarritoSteps {
    ProductoScreen productoScreen;
    AddProductScreen addProductScreen;
    CarritoScreen carritoScreen;

    public void productos() {
        productoScreen.isProductoDisplayed();
        productoScreen.clickImgProducto();
        productoScreen.clickProductoTShirt();
        productoScreen.clickProductoBikeLight();
       addProductScreen.clickProducto();
       carritoScreen.isProductoDisplayed();
    }

    public void productsSuccess() {
        Assert.assertTrue("No se puede mostrar el titulo producto", productoScreen.isProductoDisplayed());
    }
}
