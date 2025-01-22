package Base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest extends BaseLibrary{

    @BeforeMethod(description = "Web sayfası açılır.")
    public void openBrowser(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        Assert.assertEquals(driver.getCurrentUrl(),url);

    }

    @AfterMethod(description = "Tarayıcı kapatılır.")
    public void tearDown(){
        driver.quit();
    }

    public static void Wait(int sn) {
        try {
            Thread.sleep(1000*sn);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
