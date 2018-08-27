package AtomationTestsUtil.ApplicationUtil;

import java.util.concurrent.TimeUnit;

import AtomationTestsUtil.Pages.IAIndividualsPage;
import AtomationTestsUtil.Pages.TopPage;
import AtomationTestsUtil.ResourcesUtil.BrowserDriverProperty;
import AtomationTestsUtil.customException.DriverLoadException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Application {

    private ApplicationSources applicationSources;
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    private BrowserName browserName;

    public Application(BrowserName browserName) {
        this.browserName = browserName;
        BrowserDriverProperty browserDriverProperty = new BrowserDriverProperty();
        browserDriverProperty.loadBrowserDriverProperties();
        this.applicationSources = ApplicationSources.get().setBaseUrl(browserDriverProperty.getBaseUrl()).setImplicitTimeOut(30).setBrowserName(browserName);
        System.out.println("\t*** Application Sources ***");
        System.out.println("\t" + applicationSources.getBaseUrl());
        System.out.println("\t" + applicationSources.getBrowserName());
    }

    private  WebDriver initDriver(){
        if (driver != null) {
            throw new DriverLoadException("Driver didn't load or already initialized");
        }
        switch (browserName) {
            case Chrome:
                initChromeBrowser();

                break;
            case Firefox:
                initFireFoxBrowser();

            default:
        }

        driver.manage().timeouts()
                .implicitlyWait(applicationSources.getImplicitTimeOut(), TimeUnit.SECONDS);
        return driver;

    }

    private  void initFireFoxBrowser() {
       // new BrowserDriverProperty().loadBrowserDriverProperties();
            driver = new FirefoxDriver();
    }

    private  void initChromeBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);

    }

    public TopPage loadPage() {
        initDriver();
        driver.get(applicationSources.getBaseUrl());
        return new IAIndividualsPage();
    }

    public void quit() {
        if (driver != null) {
            driver.quit();
        }
    }

    public void close() {
        if (driver != null) {
            driver.close();
        }
    }

    public static void  windowScrollToWebElement(WebElement element) {
        ((JavascriptExecutor)
                driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}

