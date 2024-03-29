package steps;

import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.*;
import pages.PaginaCursos;
import pages.PaginaPrincipal;
import pages.PaginaRegistro;
import pages.PaginaFundamentosDeTesting;

public class freerangeSteps {
    SoftAssert soft = new SoftAssert();
    
    PaginaPrincipal landingPage = new PaginaPrincipal( );
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaFundamentosDeTesting fundamentosPage = new PaginaFundamentosDeTesting();
    PaginaRegistro registros = new PaginaRegistro();


    @Given("(I|The user|The client) (navigate|navigates) to www.freerangetesters.com")
    public void iNAvigateToFRT(){
        landingPage.navigatetoFreeRangeTester();
    }

    @When("(I|The user|The client) (go|goes) to {word} using navigation bar")
    public void navigationBarUse(String section){
        
        landingPage.clickOnNavigationBar(section);

    }

    @And("(select|selects) Introducción al Testing")
    public void navigateToIntro() {
        cursosPage.clickFundamentosTestingLink();
        fundamentosPage.clickProgamacionPAraTestersLink();
 
    }
    @When("(I|The user|The client) (select|selects) Elegir Plan")
    public void selecionarElegirUnPlan(){
        landingPage.clickOnElegirUnPlan();
    }

    @Then ("(I|The user|The client) can validate the option in the steps")
    public void validateCheckoutPlans(){

        List<String> lista = registros.returnPlanDropwnValues();
        List<String> listaEsperada = Arrays.asList("Academia: $16.99 / mes • 12 productos", 
                                                 "Academia: $176 / año • 12 productos",
                                                  "Free: Gratis • 1 producto");

        Assert.assertEquals(listaEsperada, lista);
    }

    // public void Ejemplulis(){
    //     Verificar que dos valores son iguales 
    //     Assert.assertEquals(PalabaraEsperada,PalabraEncontrada) ;

        // Verifica que 2 valores no son iguales 
        //     Assert.assertNotEquals(PalabaraEsperada,PalabraEncontrada);

    //     Podemos verificar que una condicion es verdad
    //     Assert.assertTrue(PalabraEncontrada.contains(PalabaraEsperada));

    //     podemos verificar que una condicione es falsa

    // Assert.assertFalse(PalabraEncontrada.contanis(PalabaraEsperada));
        
        // Soft assertions: No Detiene la ejecucion al fallar. Idela para verificar muchas cosas pequenas a la vez
        // soft.assertEquals(PalabaraEsperada, PalabraEncontrada);
        // soft.assertTrue(PalabraEncontrada.contains(PalabaraEsperada));
        // soft.assertFalse(PalabraEncontrada.contains(PalabaraEsperada));
        // soft.assertNotEquals(PalabaraEsperada, PalabraEncontrada);
        //  soft.assertAll();
    // }

    

    
}
