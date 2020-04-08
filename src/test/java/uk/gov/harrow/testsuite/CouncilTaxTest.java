package uk.gov.harrow.testsuite;

import org.testng.Assert;
import org.testng.annotations.Test;
import uk.gov.harrow.pages.CouncilTaxPage;
import uk.gov.harrow.pages.HomePage;
import uk.gov.harrow.testbase.TestBase;

/**
 * Created by Pradip
 */
//council tax test class extends with test base class
public class CouncilTaxTest extends TestBase {
    //object created
    HomePage homePage = new HomePage();
    CouncilTaxPage councilTaxPage = new CouncilTaxPage();


    @Test
    public void verifyUserShouldNavigateToCouncilTaxFeature() {
        //below methods calling from pages package
        homePage.clickOnCouncilTaxFeature();

        //compare expected with actual result
        String expectedResult = "Council Tax";
        String actualResult = councilTaxPage.getCouncilTaxText();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
