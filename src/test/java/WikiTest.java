import base.methods.BaseMethods;
import org.testng.annotations.Test;
import po.ArticlePage;
import po.SearchPage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WikiTest extends BaseMethods {
    @Test
    void ShouldBeOpenedArticle() {

        new SearchPage()
                .searchUbisoftArticle("Ubisoft")
                .clickEnter()
                .clickOnUbisoftArticle();
        assertThat(new ArticlePage().getHeadingOfArticle()).as("The text must be Ubisoft")
                .isEqualTo("Ubisoft");
    }

}
