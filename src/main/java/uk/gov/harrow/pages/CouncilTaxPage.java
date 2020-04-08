package uk.gov.harrow.pages;

import org.openqa.selenium.By;
import uk.gov.harrow.utility.Utility;

/**
 * Created by Pradip
 */
//council tax page class extends utility class to use properties of utility class
public class CouncilTaxPage extends Utility {
    //locators for each elements on home page
    By councilTaxText = By.className("page-heading");

    //below return type method to compare expected and actual result
    public String getCouncilTaxText() {
        return getTextFromElement(councilTaxText);
    }


}
