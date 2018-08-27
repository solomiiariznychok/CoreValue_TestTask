package AtomationTestsUtil.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static AtomationTestsUtil.ApplicationUtil.Application.getDriver;

public class TopPage {

    private final String LANGUAGE_LABEL = "FR";

    @FindBy(id = "header")
    private WebElement headerElement;

    @FindBy(id = "topLangMenuItem")
    private WebElement languageLabel;

    public TopPage() {
        PageFactory.initElements(getDriver(), this);

    }

    public WebElement getHeaderElement() {
        return this.headerElement;
    }

    public WebElement getLanguageLabel() {
        return this.languageLabel;
    }

    public void getLanguageLabelClick() {
        getLanguageLabel().click();
    }

    public String getLanguageLabelName() {

        return getLanguageLabel().getText();
    }

    public IAIndividualsPage verifyLabelLanguage() {

        if (getLanguageLabelName() != "LANGUAGE_LABEL") {
            getLanguageLabelClick();

        }
        return new IAIndividualsPage();
    }

}
