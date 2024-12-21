package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CarritoSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class StoreStepdefs {


    @Steps
    CarritoSteps carritoSteps;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicaciónDeSauceLabs() {
    }

    @And("valido que carguen correctamente los productos en la galería")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGalería() {
        carritoSteps.productos();
    }

    @When("agrego {string} unidad\\(s) del producto {string}")
    public void agregoUnidadSDelProducto(String Producto, String unidades) {
        carritoSteps.productsSuccess();

    }

    @Then("valido que el carrito de compras se actualice correctamente con <UNIDADES> unidad\\(s)")
    public void validoQueElCarritoDeComprasSeActualiceCorrectamenteConUNIDADESUnidadS() {



    }
}
