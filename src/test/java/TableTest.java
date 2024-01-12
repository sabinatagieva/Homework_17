import base.driver.DriverInit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import po.Table;

public class TableTest {

    @Test
    void getTableColumns() {
        // Устанавливаем драйвер
        WebDriverManager.chromedriver().setup();

        // Инициализируем драйвер
        DriverInit.getDriver();

        // Переходим на страницу
        DriverInit.getDriver().get("https://www.w3schools.com/html/html_tables.asp");

        // Принимаем попап (если он есть)
        By acceptPopup = By.xpath("//div[@id='accept-choices']");
        if (DriverInit.getDriver().findElements(acceptPopup).size() > 0) {
            DriverInit.getDriver().findElement(acceptPopup).click();
        }

        // Используем объект Table для получения значения из таблицы
        String text = new Table(DriverInit.getDriver().findElement(By.xpath("//table[@id='customers']/tbody")))
                .getValue(3, 3);

        System.out.println(text);

        // Закрываем драйвер
        DriverInit.getDriver();
    }
}
