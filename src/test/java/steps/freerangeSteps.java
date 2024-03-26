package steps;

import io.cucumber.java.en.*;
import pages.PaginaPrincipal;

public class freerangeSteps {
    
    PaginaPrincipal landingPage = new PaginaPrincipal( );

    @Given("I navigate to www.freerangetesters.com")
    public void iNAvigateToFRT(){
        landingPage.navigatetoFreeRangeTester();
    }

    @When ("I go to {word} using navigation bar")
    public void navigationBarUse(String section){
        
        landingPage.clickOnNavigationBar(section);

    }



    

    
}
