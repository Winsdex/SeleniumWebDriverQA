package pages;

public class PaginaPrincipal extends BasePage {

    private String sectionLink = "//a[@class='sc-bkzXAi jsTIvP sc-dIUfKc sc-gVgoeb inQYZS iIIIdF'][normalize-space()='%s']";
    private String elegirUnPlan = "//a[normalize-space()='Elegir Plan' and @href]";
    private String botonCastroso = "//button[@class='sc-eFtZDC jkBUwB']";
    
    public PaginaPrincipal() {
        //Constructor de la supeclase inacializado
        
        super(driver);
         
    }



    //Metodo patra navegas a www.freerangetester.com
    public void navigatetoFreeRangeTester(){
        
        navigateTo("https://www.freerangetesters.com/");
    
    }

    //presionar al boton castroso 
    public void clickBotonInicio(){
        clickElement(botonCastroso);
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
