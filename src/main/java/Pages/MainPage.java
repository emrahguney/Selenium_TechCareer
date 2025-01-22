package Pages;

import Base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class MainPage extends BaseTest {

    @Step("Kullanıcının başarılı girişi kontrol edilir")
    public MainPage accountSuccessfullControl()
    {

        Assert.assertTrue(driver.findElement(By.linkText("Edit Account")).isDisplayed());
        return this;
    }

    @Step("Iphone ürününün arama işlemi yapılır")
    public MainPage searchProduct(String text)
    {
        driver.findElement(By.xpath("(//input[@name='search'])[1]")).sendKeys(text);
        driver.findElement(By.cssSelector("div[class=search-button] [class='type-text']")).click();
        return this;
    }







    @Step("Filtreleme işlemi yapılır")
    public MainPage clickFilter(){

        driver.findElement(By.id("mz-filter-0")).click();

        return this;
    }

    @Step("Stokta olan ürünlerin seçilmesi")
    public MainPage clickInStock(){

        driver.findElement(By.cssSelector("label[for='mz-fss-0--1']")).click();
        Wait(2);
        return this;
    }

    @Step("İlk ürüne tıklanılır")
    public MainPage clickFirstItem()
    {

        driver.findElement(By.xpath("(//div[@class='caption'])[1]")).click();

        return this;

    }

    @Step("Ürün sepete eklenir")
    public MainPage clickAddToCart()
    {
        driver.findElement(By.cssSelector("[data-id='216842'] button")).click();

        screenshot();
        return this;
    }


}
