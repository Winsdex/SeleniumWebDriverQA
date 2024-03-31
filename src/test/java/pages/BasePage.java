package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage { 
    
        private static Actions action;
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

          //Funcion para escribIr en una caja de texto 
       public void write(String locator, String keyTosend){
        Find(locator).clear(); //Esto ace que borre en automatico el texto que se encintraba ya ahi
        Find(locator).sendKeys(keyTosend);

       } 

       //Funcion que seleccna un valor de un dropdowm por su nombre o valor 
       public void selectFromDropdpwnByValue(String locator, String value){
            Select dropdown = new Select(Find(locator));
            //Aqui esta la parte del codigo donde nos va permitir hacer el uso del select por el valor
            dropdown.selectByValue(value);
       }

       //Difrencias importantes index es integer por que es una posicion
       public void selectFromDropdpwnByIndex(String locator, Integer index){
        Select dropdown = new Select(Find(locator));
        //Aqui esta la parte del codigo donde nos va permitir hacer el uso del select por el index
        dropdown.selectByIndex(index);

        }
        public void selectAllFromDropDown(String locator){
            Select dropdown = new Select(Find(locator));
            dropdown.getAllSelectedOptions();

        }


        //Funcion para seleccionar y encontrar los valores de un drop
        public int dropdownSize(String locator){
            Select dropdown = new Select(Find(locator));
            List<WebElement> dropdownOptions = dropdown.getOptions();
            
            return dropdownOptions.size();


        }
        
        //Funcion para encontrar los valores de un dropdown
        public List<String> getDropdownValues(String locator){
            Select dropdown = new Select(Find(locator));
            List<WebElement> dropdownOpstions = dropdown.getOptions();
            List<String> values = new ArrayList<>();

            for(WebElement option : dropdownOpstions){
                values.add(option.getText());
            }
            return values;

        }
        
        //Funcion para pasar el mouse arriba de un elemento 
        public void hoverOverElement(String locator){
            action.moveToElement(Find(locator));


        }

        //Funcion que hace doble click 
        public void doubleClickElement(String locator){
            action.doubleClick(Find(locator));
        }

        //Funcion  que hace click drecho 
        public void rightClickElement(String locator){
            action.contextClick(Find(locator));

        }
      //Funcion para guardarlos valores de una tabla
        public String getValueFromTable(String locator, int row, int column){
            String cellValue = locator+"/table/tbody/tr["+row+"]/td"+column+"]";
            
            return Find(cellValue).getText();
        }

        //Funcion para poner un valor en un tabla
        public void setValueFromTable(String locator, int row, int column, String  valueToSend){
            String cellValue = locator+"/table/tbody/tr["+row+"]/td"+column+"]";

            Find(cellValue).sendKeys(valueToSend);
            
        }

        //Funcion paa no tener problemas con los popup
        public void switchToiFrame(int iFrameIndex){
            driver.switchTo().frame(iFrameIndex);
        }

        public void switchToPArentFrame(){
            driver.switchTo().parentFrame();
        }

        //Funcion que desase la aleta
        public void dismissAlert(){
            driver.switchTo().alert().dismiss();

        }

}
