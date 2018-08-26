package AtomationTestsUtil.customException;

import AtomationTestsUtil.TestReport.Log4jWrapper;

public class DriverLoadException extends RuntimeException{
    private static final String DRIVER_EXCEPTION = "Driver didn't load or already initialized";

    public DriverLoadException(String message) {
        super(message);
        performLogging(message);
    }

    public DriverLoadException(String message, Throwable e) {
        super(message, e);
        performLogging(message + e.getMessage());
        performLogging(message + e.getMessage());
    }

    public DriverLoadException(Throwable e) {
        super(DRIVER_EXCEPTION, e);
    }

    private void performLogging(String message) {
        Log4jWrapper.get().error(DRIVER_EXCEPTION + message);
    }

}

