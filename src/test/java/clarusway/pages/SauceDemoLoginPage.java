package clarusway.pages;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SauceDemoLoginPage {

        //Page class i initilaize etmeka adına kullanılır
    public SauceDemoLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //@FindBy anotasyonu elementleri locate derken kullandıgımız ve initElements methodu ile elementlerin ublunmasını saglayan bir anotasyondur

    @FindBy(id="user-name")
    public WebElement txtUsername;
    @FindBy(id="password")
    public WebElement txtPassword;
    @FindBy(xpath = "//*[@id='login-button']")
    public WebElement btnLogin;


    //ornek olması acısından @findAll anotation kullanımı. Page classtan bagımsız


    @FindAll(
            {
                    @FindBy(id="user-name"),
                    @FindBy(id="password"),
                    @FindBy(xpath = "//*[@id='login-button']")
            }
    )
    public List<WebElement>inputElements;


 }
