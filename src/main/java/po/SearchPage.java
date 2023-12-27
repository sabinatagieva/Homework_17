package po;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

public class SearchPage {

    public SelenideElement searchInput() {
        return $(".vector-search-box-input");
    }
    public SelenideElement article() {
        return $x("//div[@class='mw-search-result-heading']/a[@data-prefixedtext='Ubisoft']");
    }
    public SearchPage searchUbisoftArticle(String text) {
        searchInput().sendKeys(text);
        return page(SearchPage.class);
    }
    public SearchPage clickEnter() {
        searchInput().sendKeys(Keys.ENTER);
        return page(SearchPage.class);
    }
    public SearchPage clickOnUbisoftArticle() {
        article().click();
        return page(SearchPage.class);
    }
}
