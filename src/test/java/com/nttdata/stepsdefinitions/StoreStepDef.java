package com.nttdata.stepsdefinitions;

import com.nttdata.steps.StoreStep;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StoreStepDef {

    private StoreStep storeStep;
    private WebDriver driver;
    private Scenario scenario;

    @Before(order = 0)
    public void setUp(){
        //Se ejecutará Automáticamente
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Before(order = 1)
    public void setScenario(Scenario scenario){
        this.scenario = scenario;
    }

    @After
    public void quitDriver(){
        driver.quit();
    }

    @Given("estoy en la página de la tienda")
    public void estoyEnLaPáginaDeLaTienda() throws InterruptedException {
        storeStep = new StoreStep(driver);
        storeStep.navegarA("https://qalab.bensg.com/store/pe/");
        screenShot();
    }

    @And("hago clic en el botón de Login")
    public void hagoClicEnElBotónDeLogin() {
        storeStep.clickBotonLogin();
        screenShot();
    }

    @Then("valido el titulo la ventana de login sea {string}")
    public void validoElTituloLaVentanaDeLoginSea(String arg0) {
        storeStep.validarTituloLogin(arg0);
        screenShot();
    }

    @And("me logueo con mi usuario {string} y clave {string}")
    public void meLogueoConMiUsuarioYClave(String arg0, String arg1) {
        storeStep.ingresarCredenciales(arg0, arg1);
        screenShot();
    }

    @And("hago clic en el botón {string} para iniciar sesión")
    public void hagoClicEnElBotónParaIniciarSesión(String texto) {
        storeStep.clickBotonIniciarSesion(texto);
        screenShot();
    }

    @Then("valido el nombre del usuario logeado {string}")
    public void validoElNombreDelUsuarioLogeado(String texto) {
        storeStep.validarNombreUsuarioLogeado(texto);
        screenShot();
    }

    @When("navego a la categoría {string}")
    public void navegoALaCategoría(String arg0) {
        storeStep.clickCategoriaClothes();
        screenShot();
    }

    @And("selecciono la subcategoría {string}")
    public void seleccionoLaSubcategoría(String arg0) {
        storeStep.clickSubcategoriaMen();
        screenShot();
    }

    @And("agrego {int} unidades del primer producto al carrito")
    public void agregoUnidadesDelPrimerProductoAlCarrito(int cantidad) {
        storeStep.agregarUnidadesPrimerProductoAlCarrito(cantidad);
        screenShot();
    }

    @And("hago clic en el boton Añadir al carrito")
    public void hagoClicEnElBotonAñadirAlCarrito() {
        storeStep.clicEnElBotonAnadirCarrito();
        screenShot();
    }

    @Then("valido en el popup la confirmación del producto agregado sea {string}")
    public void validoEnElPopupLaConfirmaciónDelProductoAgregadoSea(String texto) {
        storeStep.validarEnElPopUpElProductoAgregado(texto);
        screenShot();
    }

    @And("valido en el popup que el monto total sea calculado correctamente")
    public void validoEnElPopupQueElMontoTotalSeaCalculadoCorrectamente() {
        storeStep.validarEnElPopupQueElMontoTotalSeaCalculadoCorrectamente();
        screenShot();
    }

    @When("finalizo la compra")
    public void finalizoLaCompra() {
        storeStep.finalizarCompra();
        screenShot();
    }


    @Then("valido el titulo de la pagina del carrito sea {string}")
    public void validoElTituloDeLaPaginaDelCarritoSea(String texto) {
        storeStep.validarTituloDelCarritoCompras(texto);
    }

    @And("Y vuelvo a validar el calculo de precios en el carrito")
    public void yVuelvoAValidarElCalculoDePreciosEnElCarrito() {
        storeStep.validarCalculoPrecioEnElCarrito();
    }

    public void screenShot(){
        byte[] evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia, "image/png", "evidencias");
    }

}
