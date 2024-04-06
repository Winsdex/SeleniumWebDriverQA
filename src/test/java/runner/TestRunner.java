package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources\\features\\FreeRangeNavegacion.feature", //Directorio de archivos . feature
                glue = "steps", // PAquete donde tyenemos nuestras clases definiendo los steps escritos en el feature file
               //plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","json:target/cucumber-rports.json"},
                plugin = { "pretty", "html:target/cucumber-reports" } ,
                tags = "@Google")

public class TestRunner {
    @AfterClass public static void cleanDriver(){
       BasePage.closeBrowser();
    }
    
}
