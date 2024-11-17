import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class LoginPage {
    @FindBy(name = "username")
    WebElement txtUsername;
    @FindBy(name = "password")
    WebElement txtPassword;
    @FindBy(css = "[type=submit]")
    WebElement btnLogin;
    @FindBy(id = "navbarDropdown1")
    WebElement btnSetting;

    @FindBy(className = "dropdown-item")
    List<WebElement> dropdownmenu;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void doLogin(String username, String password){
        txtUsername.sendKeys(username);
        txtPassword.sendKeys(password);
        btnLogin.click();

    }
    public void doLogout(){
        btnSetting.click();
        dropdownmenu.get(2).click();

    }
}
