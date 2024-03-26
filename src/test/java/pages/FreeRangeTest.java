package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreeRangeTest {
    public WebDriver driver;
    @BeforeMethod
    public void setUp(){
        //Inicializo WebDriver para chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    @Test
    public void NavegamosFreeRangeTesters() {
        //abre la pagina 
        driver.get("https://www.freerangetesters.com/");
        
    }
    @AfterMethod
    public void tearDown() {
        //Responsable de cerrar el navegador al final 
        if (driver != null) {
            driver.quit();
            
        }
    }

    

}
