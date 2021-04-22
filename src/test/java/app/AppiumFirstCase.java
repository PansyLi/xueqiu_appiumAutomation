package app;
import java.io.File;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * @Program: xueqiu_uiAutomationTest
 * @Description: first appium case
 * @Author: Pansy
 * @Create: 2021-04-22
 */
public class AppiumFirstCase {
    @BeforeAll
    void setup() throws MalformedURLException {
        File app  = new File("The absolute or relative path to an *.apk file");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        capabilities.setCapability(AndroidMobileCapabilityType.DONT_STOP_APP_ON_RESET, true);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.tencent.wework");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,".launch.LaunchSplashActivity");

//you are free to set additional capabilities
        AppiumDriver<MobileElement> driver = new AppiumDriver<>(
                new URL("http://127.0.0.1:8200/wd/hub"),//if it needs to use locally started server
//then the target_ip is 127.0.0.1 or 0.0.0.0
//the default port is 4723
                capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@text='通讯录']")).click();
    }

}