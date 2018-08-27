package AtomationTestsUtil.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static AtomationTestsUtil.ApplicationUtil.Application.getDriver;

public class MortgageProductsPage extends TopPage{

    @FindBy(id = "bta-lien-renouveler-pret-hypothecaire-d6b1e12a-fc9f-43d0-80ad-4bef401c93ce")
    WebElement calculatePaymentsButton;

    /*@FindBy(xpath = "//a[contains(@id,'bta-lien-renouveler-pret-hypothecaire')]")
    WebElement calculatePaymentsButton;*/

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
