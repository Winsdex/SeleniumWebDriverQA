package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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

    public static void closeBrowser(){
        //Cierra el browser
        driver.quit();


    }
    
    //creamos una clase privada por que no necesito compartir esta condicion solo las acciones
    private WebElement Find (String locator) {
        /*regreso mi espera que ya habia definido, hasta que se cumpla condicion 
        *la condicion seria que encuentre la presencia del xpath por el locator y asi 
        * me ahorros todos los wait   
        */
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    public void clickElement (String locator){
        /*Cuando yo lo vaya a llamar voy a llamar este find locator 
        *Por que este finda me va a espera el tiempo que yo estipule 
        */
        Find(locator).click();

    }

       public void write(String locator, String keyTosend){
        Find(locator).clear(); //Esto ace que borre en automatico el texto que se encintraba ya ahi
        Find(locator).sendKeys(keyTosend);

       } 
       public void selectFromDropdpwnByValue(String locator, String value){
            Select dropdown = new Select(Find(locator));
            //Aqui esta la parte del codigo donde nos va permitir hacer el uso del select por el valor
            dropdown.selectByValue(value);
       }

       //Difrencias importantes index es integer por que es una posicioo
       public void selectFromDropdpwnByIndex(String locator, Integer index){
        Select dropdown = new Select(Find(locator));
        //Aqui esta la parte del codigo donde nos va permitir hacer el uso del select por el index
        dropdown.selectByIndex(index);

        }

        public int dropdownSize(String locator){
            Select dropdown = new Select(Find(locator));
            List<WebElement> dropdownOptions = dropdown.getOptions();
            
            return dropdownOptions.size();


        }




}
