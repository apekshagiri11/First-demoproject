package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private WebDriver driver;

    private By username = By.name("username");      //username is the Input field
    private By password = By.name("password");
    private By Loginbutton = By.xpath("//button[@type=\"submit\"]");

    public LoginPage(WebDriver driver)
    {
        this.driver= driver;
    }
    public LoginPage enterusername( String USERID)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        driver.findElement(username).sendKeys(USERID);
        return this;
    }
    public LoginPage enterpassword(String Password)
    {
        driver.findElement(password).sendKeys(Password);
        return this;
    }
    public void click()
    {
        driver.findElement(Loginbutton).click();
    }


}
