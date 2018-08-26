package AtomationTestsUtil.Controls;

abstract class ALabel<TComponent> extends AComponent<TComponent> implements ILabel {

    protected ALabel() {
    }

    public String getText() {
        return getControlWrapper().getText();
    }

}
