import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class HelloWorldTest {
    private static AppiumDriver driver;
    private WebDriverWait wait;
    @BeforeAll
    public static void setUp(){
        try{
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","android");
        caps.setCapability("udid","emulator-5554");
        caps.setCapability("deviceName","emulator-5554");
        caps.setCapability("appPackage","com.xueqiu.android");
        caps.setCapability("appActivity","view.WelcomeActivityAlias");

        driver = new AndroidDriver<>(new URL(" http://localhost:4723/wd/hub/"),caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
    }
    @Test
    public void helloWorldTest(){
        //定义首页搜索框
        driver.findElement(By.id("com.xueqiu.android:id/tv_search")).click();
        driver.findElement(By.id("com.xueqiu.android:id/search_input_text")).sendKeys("alibaba");
        //定义搜索页搜索框

    }
}
