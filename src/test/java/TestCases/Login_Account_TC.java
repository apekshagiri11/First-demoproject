package TestCases;

import Configurations.Config;
import DriverManager.DriverM;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Login_Account_TC {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        DriverM.initDriver();
        driver = DriverM.getDriver();
        driver.get(Config.get("BaseURL"));
        System.out.println("Added the changes for testing for GIT");
        System.out.println("TESTING");
        //Thread.sleep(2000);
    }

    @Test
    public void loginOrangeHRM()
    {
        LoginPage LP = new LoginPage(driver);
        LP.enterusername(Config.get("USERID"));
        LP.enterpassword(Config.get("Password"));
        LP.click();

    }

}
