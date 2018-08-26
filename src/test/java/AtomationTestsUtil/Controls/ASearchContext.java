package AtomationTestsUtil.Controls;

import org.openqa.selenium.WebElement;

import java.util.List;

abstract class ASearchContext {
	
	abstract WebElement getVisibleWebElement(ControlLocation controlLocation);

	abstract List<WebElement> getVisibleWebElements(ControlLocation controlLocation);

	abstract WebElement getPresentWebElement(ControlLocation controlLocation);

	abstract boolean isClickableWebElement(ControlLocation controlLocation);

	abstract boolean isInvisibleWebElement(ControlLocation controlLocation);

	abstract boolean isInvisibleWebElementWithText(ControlLocation controlLocation, String text);

	abstract boolean isStatelessOfWebElement(ControlWrapper controlWrapper);

	abstract boolean isVisibleTitle(String partialTitle);

}
