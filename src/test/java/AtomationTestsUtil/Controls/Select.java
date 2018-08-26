package AtomationTestsUtil.Controls;

public final class Select extends ASelect<ISelect> {

	private Select() {
	}

	public static ABaseComponent<ISelect> get() {
		Select instance = new Select();
		instance.setTComponent(instance);
		return instance;
	}

	@Override
	public void setFocus() {

	}
}
