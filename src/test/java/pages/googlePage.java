package pages;

public class googlePage extends BasePage{

    public String botounSearsh= "//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']";

    public googlePage(){
        super(driver);
    }

    public void navigateTogoogle(){
        navigateTo("https://www.google.com");

    }
    public void clickGoogleSearsh(){
        clickElement(botounSearsh);

    }



    
}
