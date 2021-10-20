package page;

import base.BaseClass;
import page.Homepage;
import page.LoginPage;
import utility.UtilityClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.Homepage;
import page.LoginPage;
import utility.UtilityClass;

public class LoginPageTest extends BaseClass {

    LoginPage loginPage;
    Homepage homepage;
    String sheetName = "Login";

    public LoginPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();

    }
    @Test(priority = 2)
    public void loginPageTitleTest() {
        loginPage = new LoginPage();
        String loginPageTitle = loginPage.verifyPageTitle();
        //System.out.println("Login Page Title is : "+loginPageTitle);
        Assert.assertEquals(loginPageTitle, "Facebook – log in or sign up", loginPageTitle);
    }

   /* @Test(priority = 2)
    public void loginTest() {
        loginPage = new LoginPage();
        homepage = loginPage.login(properties.getProperty("username"), properties.getProperty("password"));
    }
*/
    @DataProvider
    public Object[][] getLoginTestdata() {
        return UtilityClass.getTestData(sheetName);
    }

    @Test(priority = 1, dataProvider = "getLoginTestdata")
    public void loginTest(String username, String password) {
        loginPage = new LoginPage();
        homepage = loginPage.login(username, password);
    }

    /*
    @Test(priority = 3)
    public void forgottPasswordTest() {
        forgottPasswordPage = loginPage.forgottPassword();
    }*/

    @AfterMethod
    public void tearDown() {

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
