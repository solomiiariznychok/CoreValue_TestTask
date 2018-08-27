package atomationTestsUtil.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static atomationTestsUtil.applicationUtil.Application.getDriver;

public class IAIndividualsPage extends TopPage{

    @FindBy(css = "a[href*='/individuals/pret']")
    private WebElement LoanTab;

    public IAIndividualsPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public WebElement getLoanTab() {
        return this.LoanTab;
    }

    public OptionsPage clickLoanTab() {
        getLoanTab().click();
        return new OptionsPage();
    }

}
