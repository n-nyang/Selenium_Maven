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

    @Test
    public void signInToGamil()
    {
        driver.findElement(By.className("gb_ke")).click();
        driver.findElement(By.className("whsOnd")).sendKeys("nyang@gmail.com");
        driver.findElement(By.className("VfPpkd-RLmnJb")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
