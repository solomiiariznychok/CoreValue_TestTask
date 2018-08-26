package AtomationTestsUtil.Controls;

abstract class AButton<TComponent> extends ALabelClickable<TComponent> implements IButton {

    protected AButton() {
    }

    public void submit(){
        getControlWrapper().submit();
    }

}
