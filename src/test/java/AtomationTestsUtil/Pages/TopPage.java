package AtomationTestsUtil.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static AtomationTestsUtil.ApplicationUtil.Application.getDriver;

public class TopPage {

    @FindBy(id = "header")
    private WebElement headerElement;

        public TopPage() {
            PageFactory.initElements(getDriver(), this);

        }

        public WebElement getHeaderElement(){
            return this.headerElement;
        }

    }
