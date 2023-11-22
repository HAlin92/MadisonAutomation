import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.beans.IntrospectionException;

import static org.junit.Assert.assertEquals;

public class CheckoutPage extends BasePage {
    public WebDriverWait wait;

    public CheckoutPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, 10);
    }

    @FindBy(xpath = "//a[text()='Food']")
    private WebElement foodMenu;

    @FindBy(css = ".product-info button")
    private WebElement addToCart;

    @FindBy(id = "city")
    public WebElement cityCart;

    @FindBy(id = "postcode")
    private WebElement postCode;

    @FindBy(id = "region_id")
    public WebElement cartRegion;

    @FindBy(css = ".col-1 h3")
    public WebElement guestText;

    @FindBy(css = ".checkout-types.bottom button")
    public WebElement proceedToCheckout;

    @FindBy(id = "onepage-guest-register-button")
    private WebElement checkoutGuest;

    @FindBy(xpath = "//option[. = 'Alabama']")
    private WebElement optionRegion;

    @FindBy(id = "billing:firstname")
    public WebElement billingFirstName;

    @FindBy(id = "billing:middlename")
    private WebElement billingMiddleName;

    @FindBy(id = "billing:lastname")
    public WebElement billingLastName;

    @FindBy(id = "billing:company")
    private WebElement billingCompany;

    @FindBy(id = "billing:email")
    public WebElement billingEmail;

    @FindBy(id = "billing:street1")
    public WebElement billingStreet1;

    @FindBy(id = "billing:street2")
    private WebElement billingStreet2;

    @FindBy(id = "billing:city")
    public WebElement billingCity;

    @FindBy(id = "billing:region_id")
    public WebElement billingRegion;
    @FindBy(id = "billing:postcode")
    public WebElement billingPostCode;

    @FindBy(id = "billing:telephone")
    public WebElement billingTelephone;


    @FindBy(css = "#billing-buttons-container span > span")
    public WebElement billingButton;

    @FindBy(css = "#shipping-method-buttons-container span > span")
    public WebElement shipingMethodButton;

    @FindBy(css = "#payment-buttons-container span > span")
    public WebElement paymentButton;

    @FindBy(css = ".btn-checkout")
    public WebElement chekoutButton;

    @FindBy(css = ".sub-title")
    public WebElement subTitleElement;


    public void getFoodMenu() {
        foodMenu.click();
    }

    @FindBy(css = ".product-cart-actions input")
    private WebElement qtyBox;

    @FindBy(css = ".button.btn-update span")
    private WebElement updateQty;

    @FindBy(id = "advice-required-entry-billing:firstname")
    public WebElement requiredFirstName;

    @FindBy(id = "advice-required-entry-billing:lastname")
    public WebElement requiredLastName;

    @FindBy(id = "advice-required-entry-billing:street1")
    public WebElement requiredAdress;

    @FindBy(id = "advice-required-entry-billing:email")
    public WebElement requiredEmail;

    @FindBy(id = "advice-required-entry-billing:city")
    public WebElement requiredCity;

    @FindBy(id = "advice-validate-select-billing:region_id")
     public WebElement requiredRegion;
    @FindBy(id = "advice-required-entry-billing:postcode")
    public WebElement requiredPostCode;

    @FindBy(id = "advice-required-entry-billing:telephone")
    public WebElement requiredTelephone;


    public void clickAddToCart() {
        addToCart.click();
    }

    public void setCityCart() {
        cityCart.sendKeys("Alabama");
    }

    public void setPostCode() {
        postCode.sendKeys("12345");
    }

    public void selectCartRegion() {
        cartRegion.sendKeys("Alabama");
    }


    public void selectOption(WebElement element, String option) {
        Select optionSelect = new Select(element);
        optionSelect.selectByVisibleText(option);
    }

    public void clickProceedToCheckout() {
        proceedToCheckout.click();
    }

    public void clickCheckoutGuest() {
        checkoutGuest.click();
    }


    public void setBillingFirstName() {
        billingFirstName.sendKeys("Test");
    }

    public void setBillingMiddleName() {
        billingMiddleName.sendKeys("Test2");
    }

    public void setBillingLastName() {
        billingLastName.sendKeys("Test3");
    }

    public void setBillingCompany() {
        billingCompany.sendKeys("Test5");
    }

    public void setBillingEmail() {
        billingEmail.sendKeys("asdf@example.com");
    }

    public void setBillingStreet1() {
        billingStreet1.sendKeys("adresa mea");
    }

    public void setBillingStreet2() {
        billingStreet2.sendKeys("adresa mea 2");
    }

    public void setBillingCity() {
        billingCity.sendKeys("Alabama city");
    }

//    public void selectBillingRegion() {
//
//        selectRegionElement.click();
//        optionRegion.click();
//    }


    public void setBillingPostCode() {
        billingPostCode.sendKeys("12345");
    }

    public void setBillingTelephone() {
        billingTelephone.sendKeys("0777777777");
    }

    public void clickBillingButton() {
        billingButton.click();
    }

    public void clickShipingMethodButton() {
        shipingMethodButton.click();
    }

    public void clickPaymentButton() {
        paymentButton.click();
    }

    public void clickCheckoutButton() {
        chekoutButton.click();
    }

    public void subTitleElement() {
        subTitleElement.click();
    }

    public void addItemToCart() {
        getFoodMenu();
        clickAddToCart();
    }

    public void setQtyBox() {
        qtyBox.clear();
        qtyBox.sendKeys("3");


    }

    public void updateQuantity() {
        updateQty.click();
    }

    public void cartInfo() {
        setCityCart();
        setPostCode();
        selectCartRegion();
        selectOption(cartRegion, "Alabama");
        clickProceedToCheckout();


    }

    public void updateCartQuantity() {
        setQtyBox();
        updateQuantity();
    }

    public void clickGuest() {
        clickCheckoutGuest();
    }

    public void fillMandatoryFields() {
        setBillingFirstName();
        setBillingMiddleName();
        setBillingLastName();
        setBillingCompany();
        setBillingEmail();
        setBillingStreet1();
        setBillingStreet2();
        setBillingCity();
        selectOption(billingRegion, "Alabama");
        setBillingPostCode();
        setBillingTelephone();


    }

    public void checkoutContinueButton() {
        clickWhenReady(billingButton);
        clickWhenReady(shipingMethodButton);
        clickWhenReady(paymentButton);
        clickWhenReady(chekoutButton);
        clickWhenReady(subTitleElement);
    }

    public void clickWhenReady(WebElement locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }

    public void assertTextWhenReady(WebElement locator, String expectedText) {
        wait.until(ExpectedConditions.visibilityOf(locator));
        try {
            wait.until(ExpectedConditions.textToBePresentInElement(locator, expectedText));
        } catch (Exception e) {
            System.out.println("Element or text not visible or incorrect!");
        }
        assertEquals(expectedText, locator.getText());
    }


    public void fillMandatoryFieldsExcept(WebElement fieldToSkip) {
        addItemToCart();
        cartInfo();
        clickGuest();
        fillMandatoryFields();
        fieldToSkip.clear();
        billingButton.click();

    }

    public void fillMandatoryFieldsExceptSelect(WebElement fieldToSkip) {
        addItemToCart();
        cartInfo();
        clickGuest();
        fillMandatoryFields();
        selectOption(fieldToSkip, "Please select region, state or province");
        billingButton.click();

    }
    public void fillMandatoryFieldsExceptAutomat(WebElement fieldToSkip) throws InterruptedException {
        addItemToCart();
        cartInfo();
        clickGuest();
        fillMandatoryFields();
        fieldToSkip.clear();
        billingButton.click();
        WebElement target =fieldToSkip.findElement(By.xpath(".//following-sibling::div"));
        assertTextWhenReady(target, "This is a required field.");
    }
//    public void checkIfCheckoutSelectIsMandatory(WebElement locator) throws InterruptedException {
//        addItemToCart();
//        cartInfo();
//        clickBtnRegister();
//        fillMandatoryFields();
//        locator.findElement(By.xpath(".//option")).click();
//        clickWhenReady(billingButton);
//        WebElement target = locator.findElement(By.xpath(".//following-sibling::div"));
//        assertWhenReady(target, "Please select an option.");
//    }


}

