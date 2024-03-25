package steps;

import io.cucumber.java.en.Given;
import pages.PaginaPrincipal;

public class freerangeSteps {
    
    PaginaPrincipal landingPage = new PaginaPrincipal( );

    @Given("I navigate to www.freerangetesters.com")
    public void iNAvigateToFRT(){
        landingPage.navigatetoFreeRangeTester();


    }



    

    
}
