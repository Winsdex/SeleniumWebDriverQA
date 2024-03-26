package pages;

public class PaginaPrincipal extends BasePage {

    private String searchButton = "//a[@href='/selenium-y-cucumber-java'][normalize-space()='Ver curso']"; 

    public PaginaPrincipal() {
        //Constructor de la supeclase inacializado
        
        super(driver);
        
    }

    //Metodo patra navegas a www.freerangetester.com
    public void navigatetoFreeRangeTester(){
        
        navigateTo("https://www.freerangetesters.com");
        clickElement(searchButton);
        

    }
    
}
