import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class LoginPage extends BasePage {
    public WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, 10);
    }

    @FindBy(css = ".skip-account span.label")
    private WebElement accountButton;

    @FindBy(linkText = "Log In")
    private WebElement logInButton;

    @FindBy(id = "email")
    private WebElement logInEmailAdress;

    @FindBy(id = "pass")
    private WebElement logInPassword;




    public void clickAccountButton() {
        accountButton.click();
    }

    public void clickLogInButton(){
        logInButton.click();
    }
    public void setEmailAdress(){
        logInEmailAdress.sendKeys("a@a.com");
    }
    public void setPassword(){
        logInPassword.sendKeys("12345");
    }
}


