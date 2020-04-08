package uk.gov.harrow.testsuite;


import org.testng.Assert;
import org.testng.annotations.Test;
import uk.gov.harrow.pages.HomePage;
import uk.gov.harrow.pages.LoginPage;
import uk.gov.harrow.testbase.TestBase;

/**
 * Created by Pradip
 */
//login test class extends with test base class
public class LoginTest extends TestBase {
    //object created
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();


    @Test
    public void verifyUserShouldNotNavigateToLoginPage() {
        //below methods calling from pages package
        homePage.clickOnLoginLink();

        //compare expected with actual result
        String expectedResult = "Log in";
        String actualResult = loginPage.loginWelcomeText();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
