import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


import static io.appium.java_client.remote.MobileCapabilityType.APP;

public class DriverFactory {
    public AndroidDriver setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability( "platformName","ANDROID");
        capabilities.setCapability(APP,"\"C:\\Users\\bormo\\Downloads\\ZOOM.apk\"");

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");
        AndroidDriver<WebElement> driver = new AndroidDriver<>(remoteUrl, capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
}


