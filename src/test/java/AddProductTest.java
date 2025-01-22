import Base.BaseTest;
import Pages.MainPage;
import org.testng.annotations.Test;

public class AddProductTest extends BaseTest {

LoginAndRegisterTests loginTests = new LoginAndRegisterTests();
MainPage mainPage   = new MainPage();


    @Test(description = "Sepete Ürün Ekleme")
    public void AddProductToBasketAndBuy2() {


        loginTests.loginSuccesfullControl();
        mainPage.searchProduct("iphone")
                .clickFilter()
                .clickInStock()
                .clickFirstItem()
                .clickAddToCart()


        ;


    }
}
