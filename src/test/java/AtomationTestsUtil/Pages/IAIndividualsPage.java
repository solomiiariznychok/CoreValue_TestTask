package AtomationTestsUtil.Pages;

import AtomationTestsUtil.Controls.Button;
import AtomationTestsUtil.Controls.IButton;
import AtomationTestsUtil.Controls.ILink;
import AtomationTestsUtil.Controls.Link;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IAIndividualsPage extends TopPage {

    public class IAIndividualsPageUIMap {
        private IButton LoanTab;
        private ILink MortagageLink;

        public IAIndividualsPageUIMap() {
            this.LoanTab = Button.get().getByCssSelector("a[href*='/individuals/pret']");
            this.MortagageLink = Link.get().getByCssSelector("a[data-utag-name='mortgage_loan']");
        }
    }

    private IAIndividualsPageUIMap controls;

    public IAIndividualsPage() {

        controls = new IAIndividualsPageUIMap();
    }



    @FindBy(css = "a[href*='/individuals/pret']")
    private WebElement LoanTab;

    @FindBy(css = "a[data-utag-name='mortgage_loan']")
    private WebElement MortagageLink;

   /* public IAIndividualsPage() {
        PageFactory.initElements(driver, this);
    }

    public WebElement getLoanTab() {
        return this.LoanTab;
    }

    public void clickLoanTab() {
        getLoanTab().click();
    }

    public WebElement getMortagageLink() {
        return this.MortagageLink;
    }

    public MortgageProductsPage clickMortagageLink(){
        getMortagageLink().click();
        return new MortgageProductsPage();
    }*/

}
