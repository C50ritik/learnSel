package page;

import base.BaseClass;
import page.Homepage;
import page.LoginPage;
import page.ProfilePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {

    LoginPage loginPage;
    Homepage homepage;
    ProfilePage profilePage;

    public HomePageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
        homepage = new Homepage();
        homepage = loginPage.login(properties.getProperty("username"), properties.getProperty("password"));
    }

    @Test
    public void verifyClickOnProfile() {
        profilePage = homepage.clickOnProfile();

    }

    @AfterMethod
    public void tearDown() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
