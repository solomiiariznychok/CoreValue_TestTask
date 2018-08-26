package AtomationTestsUtil.Controls;

public final class Label extends ALabel<ILabel> {

    private Label() {
    }

    public static ABaseComponent<ILabel> get() {
        Label instance = new Label();
        instance.setTComponent(instance);
        return instance;
    }
}
