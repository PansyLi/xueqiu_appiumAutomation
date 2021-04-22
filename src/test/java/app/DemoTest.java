package app;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DemoTest {
    private static AppiumDriver driver;
    private WebDriverWait wait;
    @BeforeAll
    public static void setUp(){
        try{
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.DEVICE_NAME,"android");
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"emulator-5554");
            caps.setCapability(MobileCapabilityType.APPLICATION_NAME,"emulator-5554");
            caps.setCapability("appPackage","com.xueqiu.android");
            caps.setCapability("appActivity","view.WelcomeActivityAlias");

            driver = new AndroidDriver<>(new URL("http://127.0.0.1:8200/wd/hub"),caps);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
    }
    @Test
    void Test(){

    }

}
