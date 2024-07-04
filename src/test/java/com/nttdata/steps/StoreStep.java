package com.nttdata.steps;

import com.nttdata.page.StorePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class StoreStep {
    WebDriver driver;
    StorePage page;

    public StoreStep(WebDriver driver){
        this.driver = driver;
        page = new StorePage(driver);
    }

    public void navegarA(String url){
        driver.get(url);
    }

    public void clickBotonLogin() {
        page.clickEnBotonLogin();
    }

    public void ingresarCredenciales(String arg0, String arg1) {
        page.ingresarUsuario(arg0);
        page.ingresarClave(arg1);
    }
    public void validarTituloLogin(String arg0) {
        Assertions.assertEquals(arg0, page.getTituloLogin());
    }


    public void clickBotonIniciarSesion(String texto) {
        Assertions.assertEquals(texto, page.getTituloIniciarSesion());
        page.clickEnElBotonIniciarSesion();
    }

    public void validarNombreUsuarioLogeado(String texto) {
        Assertions.assertEquals(texto, page.getNombreUsuarioLogeado());
    }

    public void clickCategoriaClothes() {
        page.clickEnCategoriaClothes();
    }

    public void clickSubcategoriaMen() {
        page.clickEnSubcategoriaMen();
    }

    public void agregarUnidadesPrimerProductoAlCarrito(int cantidad) {
        page.clickEnLaImagenDelPrimerProducto();
        page.clickEnElBotonFlechaArriba();
    }

    public void clicEnElBotonAnadirCarrito() {
        page.clickEnElBotonAnadirCarrito();
    }

    public void validarEnElPopUpElProductoAgregado(String texto) {
        Assertions.assertEquals(texto, page.getTituloProductoAgregado());
    }

    public void validarEnElPopupQueElMontoTotalSeaCalculadoCorrectamente() {
        page.validarEnElPopupQueElMontoTotalSeaCalculadoCorrectamente();
    }

    public void finalizarCompra() {
        page.clicEnElBotonFinalizarCompra();
    }

    public void validarTituloDelCarritoCompras(String texto) {
        Assertions.assertEquals(texto, page.getTituloCarritoCompras());
    }

    public void validarCalculoPrecioEnElCarrito() {
        page.validarElCalculoDePrecioEnElCarrito();
        page.clicBotonFinalizarCompra();
    }
}
