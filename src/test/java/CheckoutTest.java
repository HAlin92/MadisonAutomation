import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;


public class CheckoutTest extends Hooks {
    public CheckoutPage checkoutPage;
    public WebDriverWait wait;


    @Before
    public void SetupPageObject() {

        checkoutPage = new CheckoutPage(driver);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void checkout() {


        checkoutPage.addItemToCart();
        checkoutPage.cartInfo();
        checkoutPage.assertTextWhenReady(checkoutPage.guestText, "CHECKOUT AS A GUEST OR REGISTER");
        checkoutPage.clickGuest();
        checkoutPage.fillMandatoryFields();
        checkoutPage.checkoutContinueButton();
        checkoutPage.assertTextWhenReady(checkoutPage.subTitleElement, "THANK YOU FOR YOUR PURCHASE!");
    }

    @Test
    public void checkoutWithUpdatedQuantityTest() {

        checkoutPage.addItemToCart();
        //update
        checkoutPage.updateCartQuantity();
        checkoutPage.cartInfo();
        checkoutPage.assertTextWhenReady(checkoutPage.guestText, "CHECKOUT AS A GUEST OR REGISTER");
        checkoutPage.clickGuest();
        checkoutPage.fillMandatoryFields();
        checkoutPage.checkoutContinueButton();
        checkoutPage.assertTextWhenReady(checkoutPage.subTitleElement, "THANK YOU FOR YOUR PURCHASE!");

    }

    @Test
    public void checkFirstNameMandatoryFieldsTest() {
        checkoutPage.fillMandatoryFieldsExcept(checkoutPage.billingFirstName);
        checkoutPage.assertTextWhenReady(checkoutPage.requiredFirstName, "This is a required field.");
    }

    @Test
    public void checkLastNameMandatoryFieldsTest() {
        checkoutPage.fillMandatoryFieldsExcept(checkoutPage.billingLastName);
        checkoutPage.assertTextWhenReady(checkoutPage.requiredLastName, "This is a required field.");
    }

    @Test
    public void checkAdressMandatoryFieldsTest() {
        checkoutPage.fillMandatoryFieldsExcept(checkoutPage.billingStreet1);
        checkoutPage.assertTextWhenReady(checkoutPage.requiredAdress, "This is a required field.");
    }

    @Test
    public void checkEmailMandatoryFieldsTest() {
        checkoutPage.fillMandatoryFieldsExcept(checkoutPage.billingEmail);
        checkoutPage.assertTextWhenReady(checkoutPage.requiredEmail, "This is a required field.");
    }

    @Test
    public void checkCityMandatoryFieldsTest() {
        checkoutPage.fillMandatoryFieldsExcept(checkoutPage.billingCity);
        checkoutPage.assertTextWhenReady(checkoutPage.requiredCity, "This is a required field.");
    }

    @Test
    public void checkRegionMandatorySelect() {
        checkoutPage.fillMandatoryFieldsExceptSelect(checkoutPage.billingRegion);
        checkoutPage.assertTextWhenReady(checkoutPage.requiredRegion, "Please select an option.");
    }

    @Test
    public void checkPostCodeMandatoryFieldsTest() {
        checkoutPage.fillMandatoryFieldsExcept(checkoutPage.billingPostCode);
        checkoutPage.assertTextWhenReady(checkoutPage.requiredPostCode, "This is a required field.");
    }

    @Test
    public void checkTelephoneMandatoryFieldsTest() {
        checkoutPage.fillMandatoryFieldsExcept(checkoutPage.billingTelephone);
        checkoutPage.assertTextWhenReady(checkoutPage.requiredTelephone, "This is a required field.");
    }

    @Test
    public void checkRegionMandatoryFieldsTestAutomat() throws InterruptedException{
        checkoutPage.fillMandatoryFieldsExceptAutomat(checkoutPage.billingFirstName);
        checkoutPage.fillMandatoryFieldsExceptAutomat(checkoutPage.billingLastName);
        checkoutPage.fillMandatoryFieldsExceptAutomat(checkoutPage.billingStreet1);
        checkoutPage.fillMandatoryFieldsExceptAutomat(checkoutPage.billingEmail);
        checkoutPage.fillMandatoryFieldsExceptAutomat(checkoutPage.billingPostCode);
        checkoutPage.fillMandatoryFieldsExceptAutomat(checkoutPage.billingTelephone);
    }

}





