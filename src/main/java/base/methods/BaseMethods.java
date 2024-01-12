package base.methods;

import org.testng.annotations.BeforeMethod;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseMethods {

    @BeforeMethod
    public void setUp() {
        open("https://ru.wikipedia.org/wiki");
        getWebDriver().manage().window().maximize();
    }
}
