package Pages;

import Base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage extends BaseTest {

    @Step("Kullanıcı first name alanını doldurur")
    public RegisterPage fillFirstName(String text)
    {
        driver.findElement(By.id("input-firstname")).sendKeys(text);

        return this;
    }

    @Step("Kullanıcı last name alanını doldurur")
    public RegisterPage fillLastName(String text)
    {
        driver.findElement(By.id("input-lastname")).sendKeys(text);

        return this;
    }

    @Step("Kullanıcı email alanını doldurur")
    public RegisterPage fillEmailRegister(String text)
    {
        driver.findElement(By.id("input-email")).sendKeys(text);

        return this;
    }

    @Step("Kullanıcı telephone alanını doldurur")
    public RegisterPage fillTelephone(String text)
    {
        driver.findElement(By.id("input-telephone")).sendKeys(text);

        return this;
    }

    @Step("Kullanıcı password alanını doldurur")
    public RegisterPage fillPasswordRegister(String text)
    {
        driver.findElement(By.id("input-password")).sendKeys(text);

        return this;
    }

    @Step("Kullanıcı confirm password alanını doldurur")
    public RegisterPage fillPasswordConfirm(String text)
    {
        driver.findElement(By.id("input-confirm")).sendKeys(text);

        return this;
    }

    @Step("Kullanıcı privacy policy alanındaki kutucuğu işaretler")
    public RegisterPage clickPrivacyPolicy()
    {
        driver.findElement(By.xpath("(//label[@class='custom-control-label'])[3]")).click();

        return this;
    }

    @Step("Kullanıcı continue butonuna tıklar")
    public RegisterPage clickContinueButton()
    {
        driver.findElement(By.cssSelector("input[value='Continue']")).click();

        return this;
    }

    @Step("Kullanıcının başarılı register işlemi kontrol edilir")
    public RegisterPage registerControl(String text)
    {
        String value = driver.findElement(By.cssSelector("h1[class='page-title my-3']")).getText();



        Assert.assertTrue(text.contains(value));

        return this;
    }

    @Step("Kullanıcının başarısız register işlemi kontrol edilir")
    public RegisterPage registerEmailErrorControlMessage(String text)
    {
        String value = driver.findElement(By.cssSelector("[class=text-danger]")).getText();



        Assert.assertTrue(text.contains(value));

        return this;
    }
}
