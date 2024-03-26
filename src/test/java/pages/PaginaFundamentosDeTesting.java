package pages;


public class PaginaFundamentosDeTesting extends BasePage {

    private String ProgrmacionparaTesterLink = "//h2[normalize-space()='Introducción al Testing de Software' and @href]";
    
    public PaginaFundamentosDeTesting() {
        super(driver);
       
    }
    public void clickProgamacionPAraTestersLink(){
        
        clickElement(ProgrmacionparaTesterLink);
    }
   
    


    
}