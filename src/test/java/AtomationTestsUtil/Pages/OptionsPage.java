package AtomationTestsUtil.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static AtomationTestsUtil.ApplicationUtil.Application.getDriver;

public class OptionsPage extends IAIndividualsPage {

    @FindBy(css = "a[data-utag-name='mortgage_loan']")
    private WebElement MortagageLink;

    public OptionsPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public WebElement getMortagageLink() {
        return this.MortagageLink;
    }

    public MortgageProductsPage clickMortagageLink(){
        getMortagageLink().click();
        return new MortgageProductsPage();
    }
}
