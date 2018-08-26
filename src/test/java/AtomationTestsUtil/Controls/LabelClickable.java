package AtomationTestsUtil.Controls;

public final class LabelClickable extends ALabelClickable<ILabelClickable> {

    // implements constructor
    private LabelClickable() {
    }

    // implements static factory

    public static ABaseComponent<ILabelClickable> get() {
        LabelClickable instance = new LabelClickable();
        instance.setTComponent(instance);
        return instance;
    }

    @Override
    public void setFocus() {

    }
}
