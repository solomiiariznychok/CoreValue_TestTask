package AtomationTestsUtil.Controls;

public interface ITextField extends IButton {

    void clear();

    void sendKeys(String text);
    
    void sendKeysClear(String text);

}
