package pages;

public class PaginaPrincipal extends BasePage {

    public PaginaPrincipal() {
        //Constructor de la supeclase inacializado
        
        super(driver);
        
    }

    //Metodo patra navegas a www.freerangetester.com
    public void navigatetoFreeRangeTester(){
        
        navigateTo("https://www.freerangetesters.com");
        

    }
    
}
