package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage { 

  /*
   * Declaracion de una variable static driver de tipo Webdriver
   * Esta variable va a ser compartida por todas las instancias de BasePae
   * y subclases
   */
    
    protected static WebDriver driver;
        /*
         * Declaracion de una variable de instancia wait de tipo Webdriver 
         * 
         * Se inicializa inmediatamente con una instancia de WebdriverWait utilizando
         * elementos web
         * 
         * WebdriverWait se usa para poner esperas explicitas en los elementos web
         * 
         */
   
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));


    /*
     * 
     * Configuro el Webdriver para chrome usandon WebdriverManager
     * WebdriverMAnager va a estar descargando y configurando automaticamente
     * el driver del navegador
     * 
     */

    static {
        WebDriverManager.chromedriver().setup();

        /*
         * 
         * Imnicializamos la variable static driver en una instancia de ChromoDriver
         * 
         */
        driver = new ChromeDriver();
        
    }
    /*
     * 
     * Este es el constructor de BasePage que acepta un objeto Webdriver como argumento
     * 
     */

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
    }

    //Metodo static para navegar a una URL

    public static void navigateTo(String url){
        
        driver.get(url);

    }

}
