package AtomationTestsUtil.Controls;

abstract class AComponent<TComponent> extends ABaseComponent<TComponent> implements IComponent {

    protected AComponent() {
	}

	public String getAttribute(String attribute) {
		return getControlWrapper().getAttribute(attribute);
	}

	public String getAttributeName() {
		return getControlWrapper().getAttributeName();
	}

	public String getContent() {
		return getControlWrapper().getContent();
	}

	public String getTagName() {
		return getControlWrapper().getTagName();
	}

	public boolean isDisplayed() {
		return getControlWrapper().isDisplayed();
	}

	public boolean isEnabled() {
		return getControlWrapper().isEnabled();
	}

	public boolean isSelected() {
		return getControlWrapper().isSelected();
	}

	public boolean isInvisible() {
        return ControlSearch.get().isInvisibleWebElement(getControlLocation());
    }

	public boolean isInvisibleWithText(String text) {
        return ControlSearch.get().isInvisibleWebElementWithText(getControlLocation(), text);
    }

}
