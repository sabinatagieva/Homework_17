package po;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class Table {
    WebElement elementTable;

    public Table(WebElement elementTable) {
        this.elementTable = elementTable;
    }

    public List<WebElement> getRows() {
        return elementTable
                .findElements(By.xpath(".//table[@id='customers']/tbody/tr"));
    }
    List<List<WebElement>> getRowsAndColumns() {
        List<WebElement> rows = getRows();
        List<List<WebElement>> rowsAndColumns = new ArrayList<>();
        for(WebElement row:rows) {
            List<WebElement> rowWithColumn = row.findElements(By.xpath(".//table[@id='customers']/tbody/tr/td"));
            rowsAndColumns.add(rowWithColumn);
        }
        return rowsAndColumns;
    }
    public String getValue(int numberRow, int numberColumn) {
        List<List<WebElement>> rowsWithColumns = getRowsAndColumns();
        System.out.println(rowsWithColumns);
        return rowsWithColumns.get(numberRow -1).get(numberColumn -1).getText();
    }

//    public List<Map<String,WebElement>> getRowsAndColumnsByHeading() {
//        List<List<WebElement>> rowsWithColumns= getRowsAndColumns();
//        List <Map<String, WebElement>> rowsAndColumnsByHeading = new ArrayList<>();
//        Map<String, WebElement> rowByHeading;
//        List<WebElement> headingColumns = getHeading();
//        for (List<WebELement> row : rowsWithColumns) {
//            rowByHeading = new HashMap<>();
//            for (int i = 0; 1 < headingColumns.size() -1; i++) {
//                String heading = headingColumns. get (i).getText();
//                WebELement cell = row.get(i);
//                rowByHeading.put(heading,cell);
//            }
//                rowsAndColumnsByHeading.add(rowByHeading);
//    }
//            return rowsAndColumnsByHeading;
//}
}