package AtomationTestsUtil.Pages;

import AtomationTestsUtil.Controls.Button;
import AtomationTestsUtil.Controls.IButton;

public class MortgageProductsPage extends TopPage{

    private class MortgageProductsPageUIMap {

        public IButton calculatePaymentsButton;

        public MortgageProductsPageUIMap() {
            this.calculatePaymentsButton = Button.get().getByXpath("//a[text()='Calculate your payments']");
        }
    }
        private MortgageProductsPageUIMap controls;

        public MortgageProductsPage(){
            controls = new MortgageProductsPageUIMap();
        }

    public IButton getCalculatePaymentsButton() {
            return this.controls.calculatePaymentsButton; }

    public MortgagePaymentCalculatorPage clickCalculatePaymentsButton() {
            getCalculatePaymentsButton().click();
        return new MortgagePaymentCalculatorPage();}
    }