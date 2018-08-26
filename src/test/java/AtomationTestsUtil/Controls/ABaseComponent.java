package AtomationTestsUtil.Controls;


public abstract class ABaseComponent<TComponent> {
    private ControlLocation controlLocation;
    private ControlWrapper controlWrapper;
    private TComponent tComponent;

    protected ABaseComponent() {

    }

    public TComponent getById(String id) {
        return get(ControlLocation.getById(id));
    }

    public TComponent getByName(String name) {
        return get(ControlLocation.getByName(name));
    }

    public TComponent getByXpath(String xpath) {
        return get(ControlLocation.getByXPath(xpath));
    }

    public TComponent getByPartialLinkText(String partialLinkText) {
        return get(ControlLocation.getByPartialLinkText(partialLinkText));
    }

    public TComponent getByCssSelector(String cssSelector) {
        return get(ControlLocation.getByCssSelector(cssSelector));
    }

    public TComponent getByTagName(String tagName) {
        return get(ControlLocation.getByTagName(tagName));
    }

    TComponent getByControl(ControlWrapper controlWrapper, ControlLocation controlLocation) {
        this.controlLocation = controlLocation;
        this.controlWrapper = controlWrapper;
        return tComponent;
    }

    TComponent get(ControlLocation controlLocation) {
        this.controlLocation = controlLocation;
        this.controlWrapper = ControlWrapper.getVisibleWebElement(controlLocation);
        return tComponent;
    }
    
    public TComponent getPresentById(String id) {
        return getPresent(ControlLocation.getById(id));
    }

    public TComponent getPresentByName(String name) {
        return getPresent(ControlLocation.getByName(name));
    }
    
    public TComponent getPresentByXpath(String xpath) {
        return getPresent(ControlLocation.getByXPath(xpath));
    }
    
    public TComponent getPresentByCssSelector(String cssSelector) {
        return getPresent(ControlLocation.getByCssSelector(cssSelector));
    }

    private TComponent getPresent(ControlLocation controlLocation) {
        this.controlLocation = controlLocation;
        this.controlWrapper = ControlWrapper.getPresentWebElement(controlLocation);
        return tComponent;
    }

    ControlWrapper getControlWrapper() {
        return this.controlWrapper;
    }

    ControlLocation getControlLocation() {
        return this.controlLocation;
    }

    protected void setTComponent(TComponent tComponent) {
        this.tComponent = tComponent;
    }
}
