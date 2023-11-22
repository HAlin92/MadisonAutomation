import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginTest extends Hooks {
    public LoginPage loginPage;
    public WebDriverWait wait;


    @Before
    public void SetupPageObject() {

        loginPage = new LoginPage(driver);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void loginText() {
        loginPage.clickAccountButton();
        loginPage.clickLogInButton();
        loginPage.setEmailAdress();
        loginPage.setPassword();

    }

}

