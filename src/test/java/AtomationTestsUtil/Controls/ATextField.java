package AtomationTestsUtil.Controls;

abstract class ATextField<TComponent> extends AButton<TComponent>implements ITextField {

    protected ATextField() {
    }

    public void clear() {
        getControlWrapper().clear();
    }

    public void sendKeys(String text) {
        getControlWrapper().sendKeys(text);
    }

    public void sendKeysClear(String text) {
        getControlWrapper().sendKeysClear(text);
    }

}
