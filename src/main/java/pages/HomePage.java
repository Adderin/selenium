package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By formAuthentificationLink = By.linkText("Form Authentication");

    public HomePage(WebDriver driver){
            this.driver = driver;
    }
    public LoginPage clickFormAuthentification() {
            driver.findElement(formAuthentificationLink).click();
            return new LoginPage(driver);
    }
}
