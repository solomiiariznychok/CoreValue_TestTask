package AtomationTestsUtil.Controls;

public final class TextField extends ATextField<ITextField> {
    private TextField() {
    }


    public static ABaseComponent<ITextField> get() {
        TextField instance = new TextField();
        instance.setTComponent(instance);
        return instance;
    }

    @Override
    public void setFocus() {

    }
}
