package AtomationTestsUtil.Controls;

abstract class ALink<TComponent> extends ALabelClickable<TComponent> implements ILink {

    protected ALink() {
    }

    public String getUrl() {
        return getControlWrapper().getUrl();
    }

}
