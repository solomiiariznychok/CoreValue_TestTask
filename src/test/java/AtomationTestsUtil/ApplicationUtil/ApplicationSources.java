package AtomationTestsUtil.ApplicationUtil;

public class ApplicationSources {
        private String baseUrl;
        private long implicitTimeOut;
        private BrowserName browserName;

        public ApplicationSources() {
            this.baseUrl = new String();
            this.implicitTimeOut = 30;
        }

        public static ApplicationSources get() {
            return new ApplicationSources();
        }

        public ApplicationSources setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public ApplicationSources setImplicitTimeOut(long implicitTimeOut) {
            this.implicitTimeOut = implicitTimeOut;
            return this;
        }

        public ApplicationSources setBrowserName(BrowserName browserName) {
            this.browserName = browserName;
            return this;
        }

        public String getBaseUrl() {
            return baseUrl;
        }

        public long getImplicitTimeOut() {
            return implicitTimeOut;
        }

        public BrowserName getBrowserName() {
            return browserName;
        }
    }

