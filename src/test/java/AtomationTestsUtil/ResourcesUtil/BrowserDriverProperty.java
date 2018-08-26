package AtomationTestsUtil.ResourcesUtil;

import AtomationTestsUtil.customException.PropertiesLoadException;

import java.io.*;
import java.util.Properties;

public class BrowserDriverProperty {

    private final static String CHROME_DRIVER_PROPERTY_NAME = "webdriver.chrome.driver";
    private final static String FIREFOX_DRIVER_PROPERTY_NAME = "webdriver.gecko.driver";
    private final static String BROWSER_BASE_URL = "browser.base.url";

    private String baseUrl;

    public String getBaseUrl() {
        return baseUrl;
    }

    public  void loadBrowserDriverProperties() {
        Properties prop = new Properties();
        InputStream input = null;

        try {
            input = this.getClass().getClassLoader().getResourceAsStream("application.properties");
            prop.load(input);
            System.setProperty(CHROME_DRIVER_PROPERTY_NAME, prop.getProperty(CHROME_DRIVER_PROPERTY_NAME));
            System.setProperty(FIREFOX_DRIVER_PROPERTY_NAME, prop.getProperty(FIREFOX_DRIVER_PROPERTY_NAME));
            baseUrl = prop.getProperty(BROWSER_BASE_URL);

        } catch (Exception ex) {
            throw new PropertiesLoadException(ex);
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

