package atomationTestsUtil.customException;

import atomationTestsUtil.testReport.Log4jWrapper;

public class PropertiesLoadException extends RuntimeException {
    private static final String PROPERTIES_EXCEPTION = "Properties from application.properties don't found";

    public PropertiesLoadException(String message) {
        super(message);
        performLogging(message);
    }

    public PropertiesLoadException(String message, Throwable e) {
        super(message, e);
        performLogging(message + e.getMessage());
        performLogging(message + e.getMessage());
    }

    public PropertiesLoadException(Throwable e) {
        super(PROPERTIES_EXCEPTION, e);
    }

    private void performLogging(String message) {
        Log4jWrapper.get().error(PROPERTIES_EXCEPTION + message);
    }

}

