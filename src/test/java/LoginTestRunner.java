import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestRunner extends Setup {
    LoginPage loginPage;
    @Test(priority = 0)
    public void doLogin(){

        loginPage = new LoginPage(driver);

        loginPage.doLogin("Admin", "1234");
        Assert.assertTrue(loginPage.btnSetting.isDisplayed());
    }
    @Test(priority = 1)
    public void doLogout(){
        loginPage = new LoginPage(driver);
        loginPage.doLogout();
       Assert.assertTrue(loginPage.btnLogin.isDisplayed());
    }
    @Test(priority = 2)
    public void doLoginWithInvalidCreds(){

        loginPage = new LoginPage(driver);

        loginPage.doLogin("wrongUsername", "wrongPassword");
        Assert.assertTrue(loginPage.btnLogin.isDisplayed());
    }
    @Test(priority = 3)
    public void doLoginWithNullCreds(){

        loginPage = new LoginPage(driver);

        loginPage.doLogin("", "");
        Assert.assertTrue(loginPage.btnLogin.isDisplayed());
    }

}
