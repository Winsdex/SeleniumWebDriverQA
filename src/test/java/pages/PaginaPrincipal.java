package pages;

public class PaginaPrincipal extends BasePage {

    private String sectionLink = "//a[normalize-space()='%s' and @href]";
    private String elegirUnPlan = "//a[normalize-space()='Elegir Plan' and @href]";
    
    public PaginaPrincipal() {
        //Constructor de la supeclase inacializado
        
        super(driver);
         
    }

    //Metodo patra navegas a www.freerangetester.com
    public void navigatetoFreeRangeTester(){
        
        navigateTo("https://www.freerangetesters.com/");
    
    }
    
    public void clickOnNavigationBar(String section){
        //reemplazar el marcador de posicion en sectionlink con el nombre
        String xpathSection = String.format(sectionLink, section);

        clickElement(xpathSection);


    }
    public void clickOnElegirUnPlan(){
        clickElement(elegirUnPlan);
    }

}
