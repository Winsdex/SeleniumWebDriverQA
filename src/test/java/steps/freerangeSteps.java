package steps;

import io.cucumber.java.en.*;
import pages.PaginaCursos;
import pages.PaginaPrincipal;
import pages.PaginaFundamentosDeTesting;

public class freerangeSteps {
    
    PaginaPrincipal landingPage = new PaginaPrincipal( );
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaFundamentosDeTesting fundamentosPage = new PaginaFundamentosDeTesting();


    @Given("I navigate to www.freerangetesters.com")
    public void iNAvigateToFRT(){
        landingPage.navigatetoFreeRangeTester();
    }

    // @When("I go to {word} using navigation bar")
    // public void navigationBarUse(String section){
        
    //     landingPage.clickOnNavigationBar(section);

    // }

    // @And("select Introducción al Testing")
    // public void navigateToIntro() {
    //     cursosPage.clickFundamentosTestingLink();
    //     fundamentosPage.clickProgamacionPAraTestersLink();
 
    // }
    @When("I select Elegir Plan")
    public void selecionarElegirUnPlan(){
        landingPage.clickOnElegirUnPlan();
    }


    

    
}
