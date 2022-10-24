package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.equalTo;


public class HomePage {

    @FindBy(xpath = "//*[@id='c-p-bn']")
    WebElement acceptCookies;

    @FindBy(xpath ="//a[contains(text(),'Octavian')]")
    WebElement user;



    private ChromeDriver driver;

    public HomePage(ChromeDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setAcceptCookies(){
        driver.navigate().refresh();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(acceptCookies));
        acceptCookies.click();
    }

    public void selectUser() {

        driver.navigate().refresh();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(user));
        user.click();
    }

    public void apiTest(){
        //Please provide api link to test the api

    }

}
