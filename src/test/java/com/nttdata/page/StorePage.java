package com.nttdata.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StorePage {
    private WebDriver driver;
    private By botonLoginCliente = By.xpath("//div[@class=\"user-info\"]/a[1]");
    private By primerElementoInput = By.xpath("//header[@class=\"page-header\"]/h1[1]");
    private By segundoElementoInput = By.xpath("//*[@id=\"wrapper\"]/div/nav/ol/li[2]/span");
    private By usuarioInput = By.xpath("//input[@id='field-email']");
    private By contrasenaInput = By.xpath("//input[@id='field-password']");
    private By botonIniciarSesion = By.xpath("//button[@id='submit-login']");
    private By tituloUsuarioLogueado = By.xpath("//span[contains(text(),'Jamil Flores')]");
    private By cerraSesionInput = By.xpath("//a[@class='logout hidden-sm-down']");
    private By categoriaClothes = By.xpath("//*[@id=\"category-3\"]/a");
    private By subcategoriaMen = By.xpath("//*[@id=\"left-column\"]/div[1]/ul/li[2]/ul/li[1]/a");
    private By imagenPrimerProducto = By.xpath("//a[@class=\"thumbnail product-thumbnail\"]");
    private By botonFlechaArriba = By.xpath("//i[@class='material-icons touchspin-up']");
    private By botonAnadirAlCarrito = By.xpath("//button[@class='btn btn-primary add-to-cart']");
    private By tituloProductoAgregado = By.xpath("//h4[@id='myModalLabel']");
    private By tituloProductoAgregadoAlCarrito = By.xpath("//div[@class=\"cart-content\"]/p[1]");
    private By precioXUnidad = By.xpath("//p[@class='product-price']");
    private By cantidad = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[1]/div/div[2]/span[3]/strong");
    private By precioTotal = By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/p[4]/span[2]");
    private By botonFinalizarCompra = By.xpath("//div[@class=\"cart-content-btn\"]/a[1]");
    private By tituloCarritoCompras = By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[1]/h1");
    private By precioXUnidadCarrito = By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[2]/ul/li/div/div[2]/div[2]/div[2]/span");
    private By precioTotalCarrito = By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[2]/ul/li/div/div[3]/div/div[2]/div/div[2]/span/strong");
    private By totalFactura = By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[1]/div[2]/div[2]/span[2]");
    private By botonfinalizarCompra = By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a");
    private WebDriverWait wait;

    public StorePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickEnBotonLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(botonLoginCliente));
        WebElement botonLogin = driver.findElement(botonLoginCliente);
        botonLogin.click();
    }

    public void ingresarUsuario(String arg0) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(usuarioInput));
        WebElement usuario = driver.findElement(usuarioInput);
        usuario.sendKeys(arg0);
    }

    public void ingresarClave(String arg1) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(contrasenaInput));
        WebElement contrasena = driver.findElement(contrasenaInput);
        contrasena.sendKeys(arg1);
    }

    public void clickEnElBotonIniciarSesion() {
        wait.until(ExpectedConditions.elementToBeClickable(botonIniciarSesion));
        WebElement botonBusqueda = driver.findElement(botonIniciarSesion);
        botonBusqueda.click();
    }

    public void clickEnCategoriaClothes() {
        wait.until(ExpectedConditions.elementToBeClickable(categoriaClothes));
        WebElement botonBusqueda = driver.findElement(categoriaClothes);
        botonBusqueda.click();
    }

    public void clickEnSubcategoriaMen() {
        wait.until(ExpectedConditions.elementToBeClickable(subcategoriaMen));
        WebElement botonBusqueda = driver.findElement(subcategoriaMen);
        botonBusqueda.click();
    }

    public void clickEnLaImagenDelPrimerProducto() {
        wait.until(ExpectedConditions.elementToBeClickable(imagenPrimerProducto));
        WebElement primerProducto = driver.findElement(imagenPrimerProducto);
        primerProducto.click();
    }

    public void clickEnElBotonFlechaArriba() {
        wait.until(ExpectedConditions.elementToBeClickable(botonFlechaArriba));
        WebElement botonEnFlechaArriba = driver.findElement(botonFlechaArriba);
        botonEnFlechaArriba.click();
    }


    public void clickEnElBotonAnadirCarrito() {
        wait.until(ExpectedConditions.elementToBeClickable(botonAnadirAlCarrito));
        WebElement botonAnadirCarrito = driver.findElement(botonAnadirAlCarrito);
        botonAnadirCarrito.click();
    }

    public void clicEnElBotonFinalizarCompra() {
        wait.until(ExpectedConditions.elementToBeClickable(botonFinalizarCompra));
        WebElement botonAnadirCarrito = driver.findElement(botonFinalizarCompra);
        botonAnadirCarrito.click();
    }

    public void clicBotonFinalizarCompra() {
        wait.until(ExpectedConditions.elementToBeClickable(botonfinalizarCompra));
        WebElement botonFinalizarCompra = driver.findElement(botonfinalizarCompra);
        botonFinalizarCompra.click();
    }

    public String getTituloLogin() {
        WebElement tituloElemento;
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(primerElementoInput));
            tituloElemento = driver.findElement(primerElementoInput);
        } catch (Exception e) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(segundoElementoInput));
            tituloElemento = driver.findElement(segundoElementoInput);
        }
        return tituloElemento.getText();
    }

    public String getTituloIniciarSesion() {
        WebElement tituloElemento;
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(botonIniciarSesion));
            tituloElemento = driver.findElement(botonIniciarSesion);
        } catch (Exception e) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(botonIniciarSesion));
            tituloElemento = driver.findElement(botonIniciarSesion);
        }
        return tituloElemento.getText();
    }

    public String getNombreUsuarioLogeado() {
        WebElement tituloElemento;
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(tituloUsuarioLogueado));
            tituloElemento = driver.findElement(tituloUsuarioLogueado);
        } catch (Exception e) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(cerraSesionInput));
            tituloElemento = driver.findElement(cerraSesionInput);
        }
        return tituloElemento.getText();
    }

    public String getTituloCarritoCompras() {
        WebElement tituloCarrito;
        wait.until(ExpectedConditions.visibilityOfElementLocated(tituloCarritoCompras));
        tituloCarrito = driver.findElement(tituloCarritoCompras);

        return tituloCarrito.getText();
    }

    public String getTituloProductoAgregado() {
        WebElement tituloElemento;
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(tituloProductoAgregado));
            tituloElemento = driver.findElement(tituloProductoAgregado);
        } catch (Exception e) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(tituloProductoAgregadoAlCarrito));
            tituloElemento = driver.findElement(tituloProductoAgregadoAlCarrito);
        }
        String text = tituloElemento.getText().replace("", "").trim();
        return text;
    }


    public void validarEnElPopupQueElMontoTotalSeaCalculadoCorrectamente() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(precioXUnidad));
        wait.until(ExpectedConditions.visibilityOfElementLocated(cantidad));
        wait.until(ExpectedConditions.visibilityOfElementLocated(precioTotal));

        WebElement precio, cantidadElement, precioTotalElement;

        precio = driver.findElement(precioXUnidad);
        cantidadElement = driver.findElement(cantidad);
        precioTotalElement = driver.findElement(precioTotal);

        String precioUnitarioStr = precio.getText();
        String cantidadStr = cantidadElement.getText();
        String montoTotalStr = precioTotalElement.getText();

        double precioUnitario = extraerNumero(precioUnitarioStr);
        int cantidad = Integer.parseInt(cantidadStr.trim());
        double precioTotal = extraerNumero(montoTotalStr);

        double montoTotalEsperado = precioUnitario * cantidad;

        if (Math.abs(montoTotalEsperado - precioTotal) < 0.001) {
            System.out.println("El monto total es calculado correctamente.");
        } else {
            System.out.println("El monto total no es calculado correctamente.");
            System.out.println("Monto esperado: " + montoTotalEsperado);
            System.out.println("Monto mostrado: " + precioTotal);
        }

    }

    public void validarElCalculoDePrecioEnElCarrito() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(precioXUnidadCarrito));
        wait.until(ExpectedConditions.visibilityOfElementLocated(precioTotalCarrito));
        wait.until(ExpectedConditions.visibilityOfElementLocated(totalFactura));
        WebElement precio, precioTotalElement;

        precio = driver.findElement(precioTotalCarrito);
        precioTotalElement = driver.findElement(totalFactura);

        String precioCarrito = precio.getText();
        String montoTotalStr = precioTotalElement.getText();


        double precioTotal = extraerNumero(precioCarrito);
        double precioTotalFactura = extraerNumero(montoTotalStr);

        if (precioTotal == precioTotalFactura) {
            System.out.println("El monto total es calculado correctamente.");
        } else {
            System.out.println("El monto total no es calculado correctamente.");
            System.out.println("Monto mostrado: " + precioTotal);
        }

    }

    private static double extraerNumero(String texto) {
        String numeroTexto = texto.replaceAll("[^0-9.]", "");
        return Double.parseDouble(numeroTexto);
    }

}
