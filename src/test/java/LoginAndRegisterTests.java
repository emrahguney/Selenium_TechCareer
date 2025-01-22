import Base.BaseTest;
import Pages.LoginPage;
import Pages.MainPage;
import Pages.RegisterPage;
import org.testng.annotations.Test;

public class LoginAndRegisterTests extends BaseTest {


    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    MainPage mainPage = new MainPage();

    @Test(description = "Basarili bir şekilde kayıt olma.")
    public void registerSuccesfullControl(){

        loginPage.clickMyAccountButton().clickRegisterButton();
       registerPage.fillFirstName(firstName)
               .fillLastName(lastName)
               .fillEmailRegister(email)
               .fillTelephone(telephone)
                .fillPasswordRegister(password)
               .fillPasswordConfirm(confirmPassword)
                .clickPrivacyPolicy()
               .clickContinueButton();

        registerPage.registerControl("Your Account Has Been Created!");


        screenshot();

    }

    @Test(description = "Basarisiz bir sekilde kayıt olma")//,dependsOnMethods = "registerSuccesfullControl")
    public void registerUnSuccesfullControl(){

        loginPage.clickMyAccountButton().clickRegisterButton();
        registerPage.fillFirstName(firstName)
                .fillLastName(lastName)
                .fillTelephone(telephone)
                .fillPasswordRegister(password)
                .fillPasswordConfirm(confirmPassword)
                .clickPrivacyPolicy()
                .clickContinueButton();

        registerPage.registerEmailErrorControlMessage("E-Mail Address does not appear to be valid!");

        screenshot();

    }

    @Test(description = "Başarılı bir şekilde login olma",dependsOnMethods = "registerUnSuccesfullControl")
    public void loginSuccesfullControl(){

        loginPage.clickMyAccountButton().fillEmail(email).fillPassword(password).clickLoginButton();

        mainPage.accountSuccessfullControl();

        screenshot();

    }

    @Test(description = "Başarısız bir şekilde login olma",dependsOnMethods = "loginSuccesfullControl")
    public void loginUnSuccesfullControl(){

        loginPage.clickMyAccountButton().fillEmail(email).fillPassword("112345").clickLoginButton();

        loginPage.accountUnSuccessfullControl("Warning: No match for E-Mail Address and/or Password.");

        screenshot();

    }

}
