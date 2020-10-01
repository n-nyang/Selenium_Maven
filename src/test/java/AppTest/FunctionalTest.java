package AppTest;

import SeleniumSetup.DriverSetup;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class FunctionalTest extends DriverSetup {

    @Test
    public void enterTextOnSearchTextbox ()
    {
        driver.findElement(By.className("gLFyf")).sendKeys("THis is a test");
        driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);
    }

}
