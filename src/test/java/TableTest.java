import io.github.bonigarcia.wdm.WebDriverManager;
import po.Table;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static base.driver.DriverInit.getDriver;

public class TableTest {
    private final By table = By.xpath("//table[@id='customers']/tbody");
    private final By acceptPopup = By.xpath("//div[@id='accept-choices']");

    public String tableValue(int rowIndex, int columnIndex) {
        WebElement elementTable = getDriver().findElement(table);
        return new Table(elementTable).getValue(rowIndex,columnIndex);
    }
    @Test
    void getTableColumns() {
        getDriver().get("https://www.w3schools.com/html/html_tables.asp");
        getDriver().findElement(acceptPopup).click();
        String text = new TableTest().tableValue(3,3);
        System.out.println(text);
    }
}
