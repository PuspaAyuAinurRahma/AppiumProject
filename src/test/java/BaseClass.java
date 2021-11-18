import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.URL;

public class BaseClass {
    protected static AppiumDriver<MobileElement> driver;

    @BeforeTest
    public void setup() {
        try {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
            cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
            cap.setCapability("appPackage", "com.dencreak.dlcalculator");
            cap.setCapability("appActivity", "com.dencreak.dlcalculator.DLCalculatorActivity");

            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AppiumDriver<MobileElement>(url, cap);
        }catch(Exception exp){
            System.out.println("Cause is : "+exp.getCause());
            System.out.println("Message is : "+exp.getMessage());
            exp.printStackTrace();
        }

    }

    @AfterTest
    public void teardown() {
        driver.terminateApp("com.dencreak.dlcalculator");
    }

}
