package AtomationTestsUtil.Controls;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CaptureScreenImage {
    private final String TIME_TEMPLATE = "yyyy_MM_dd HH-mm-ss";
    private final String FILE_SUFFIX = " CaptureScreenImage.png";
    private final String DEFAULT_DIRECTORY = "./test-output";
    private final String MAVEN_DIRECTORY = "surefire.reports.directory";
    private final String SLASH = "/";
    private final String FAILED_TO_CREATE = "Failed to create screenshot: %s";
    private static volatile CaptureScreenImage instance = null;

	private CaptureScreenImage() {
	}

	public static CaptureScreenImage get() {
		if (instance == null) {
			synchronized (CaptureScreenImage.class) {
				if (instance == null) {
					instance = new CaptureScreenImage();
				}
			}
		}
		return instance;
	}

	private String getCurrentTime() {
		return new SimpleDateFormat(TIME_TEMPLATE).format(new Date());
	}

//	private String getOutputDirectory() {
//		return DEFAULT_DIRECTORY + SLASH;
//	}

    private String getOutputDirectory() {
        String outputDirectory = System.getProperty(MAVEN_DIRECTORY);
        if ((outputDirectory == null) || (outputDirectory.isEmpty())) {
            outputDirectory = DEFAULT_DIRECTORY;
        }
        return outputDirectory + SLASH;
    }

	private String getAbsolutePathFileName() {
		return getOutputDirectory() + getCurrentTime() + FILE_SUFFIX;
	}

	/**
	 * @return Absolute path of filename.
	 */


}
