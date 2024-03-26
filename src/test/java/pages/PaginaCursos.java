package pages;

public class PaginaCursos extends BasePage {

    private String fundamentosTestingLink = "//h2[normalize-space()='De 0 a Tester Profesional' and @href]";

    
    public PaginaCursos(){
        super(driver);
    }
    public void clickFundamentosTestingLink() {
        clickElement(fundamentosTestingLink);

    }
    
}
