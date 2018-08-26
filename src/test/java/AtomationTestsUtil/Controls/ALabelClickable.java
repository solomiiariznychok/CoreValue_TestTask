package AtomationTestsUtil.Controls;

abstract class ALabelClickable<TComponent> extends ALabel<TComponent> implements ILabelClickable {

    protected ALabelClickable() {
    }

    public boolean isClickable() {
        return ControlSearch.get().isClickableWebElement(getControlLocation());
    }

    public void click() {
        if (isClickable()) {
            getControlWrapper().click();
        }
    }
}
