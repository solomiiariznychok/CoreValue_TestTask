package AtomationTestsUtil.Pages;

import AtomationTestsUtil.Controls.ILabel;
import AtomationTestsUtil.Controls.Label;

public abstract class TopPage {

    private class TopPageUIMap {

        private ILabel homePageHeader;

        public TopPageUIMap() {
            this.homePageHeader = Label.get().getById("headre");
        }
    }

    private TopPageUIMap controls;

    public TopPage() {
        this.controls = new TopPageUIMap();
    }


    public ILabel getHeaderLabel() {
        return this.controls.homePageHeader;
    }

}