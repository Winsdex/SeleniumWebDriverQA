package pages;

public class googlePage extends BasePage{

    public String botounSearsh= "//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']";
    public String textBox = "//textarea[@id='APjFqb']";
    public String guacamata = "//h3[normalize-space()='La Guacamaya']";
    public String dropPrincipal ="//span[@class='mobile_menu_bar mobile_menu_bar_toggle']";

    public googlePage(){
        super(driver);
    }

    public void navigateTogoogle(){
        navigateTo("https://www.google.com");

    }
    public void writeTextBox(){
        write(textBox, "guacamayas");

    }   
    public void clikGuacamya(){
        clickElement(guacamata);
    }


    public void clickGoogleSearsh(){
        clickElement(botounSearsh);

    }


    
}
