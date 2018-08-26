package AtomationTestsUtil.Controls;

public final class Button extends AButton<IButton> {

    // implements constructor
    private Button() {
    }

    // implements static factory

    public static ABaseComponent<IButton> get() {
        Button instance = new Button();
        instance.setTComponent(instance);
        return instance;
    }

    @Override
    public void setFocus() {

    }
}
