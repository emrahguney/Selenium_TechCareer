package Pages;

import Base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginPage extends BaseTest {


    @Step("Kullanici My Account butonuna tiklar.")
    public LoginPage clickMyAccountButton(){
        driver.findElement(By.cssSelector("i[class='icon fas fa-user']")).click();
        return this;
    }

    @Step("Kullanici Register butonuna tiklar.")
    public LoginPage clickRegisterButton(){
        driver.findElement(By.linkText("Register")).click();
        return this;
    }

    @Step("Kullanıcı giriş yapmak için kayıtlı email adresini girer.")
    public LoginPage fillEmail(String text)
    {
        driver.findElement(By.id("input-email")).sendKeys(text);

        return this;
    }

    @Step("Kullanıcı giriş yapmak için password unu girer.")
    public LoginPage fillPassword(String text)
    {
        driver.findElement(By.id("input-password")).sendKeys(text);

        return this;
    }

    @Step("Kullanıcı giriş yapmak için login butonuna tıklar.")
    public LoginPage clickLoginButton()
    {
        driver.findElement(By.cssSelector("[value='Login']")).click();
        return this;
    }



    @Step("Kullanıcının başarısız girişi kontrol edilir.")

    public LoginPage accountUnSuccessfullControl(String text)
    {

        String value = driver.findElement(By.cssSelector("div[class='alert alert-danger alert-dismissible']")).getText();
        Assert.assertTrue(value.contains(text));
        return this;
    }
}
