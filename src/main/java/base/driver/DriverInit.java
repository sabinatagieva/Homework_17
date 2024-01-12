package base.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInit {
    private static volatile WebDriver driver = null;

    private DriverInit() {}

    public static WebDriver getDriver() {
        if (driver == null) {
            synchronized (DriverInit.class) {
                if (driver == null) {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                }
            }
        }
        return driver;
    }
}
