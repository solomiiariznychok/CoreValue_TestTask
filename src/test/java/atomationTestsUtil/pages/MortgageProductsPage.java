package atomationTestsUtil.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static atomationTestsUtil.applicationUtil.Application.getDriver;

public class MortgageProductsPage extends OptionsPage {

    @FindBy(css = "a[href*='/transfer-mortgage']")
    WebElement calculatePaymentsButton;

    public MortgageProductsPage() {
        PageFactory.initElements(getDriver(), this);

    }

    public WebElement getCalculatePaymentsButton() {
        return this.calculatePaymentsButton;
    }

    public MortgagePaymentCalculatorPage clickCalculatePaymentButton() {
        getCalculatePaymentsButton().click();
        return new MortgagePaymentCalculatorPage();
    }
}
