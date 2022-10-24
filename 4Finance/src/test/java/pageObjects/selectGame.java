package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class selectGame {

    @FindBy(xpath = "//*[@id='searchstr']")
    WebElement searchGame;

    @FindBy(xpath = "//tbody/tr[1]/td[3]/input[2]")
    WebElement Go;

    @FindBy(xpath="//a[@href='/boardgame/27708/1960-making-president']")
    WebElement selectGame;


    private ChromeDriver driver;

    public selectGame(ChromeDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setSearchGame(){

        driver.navigate().refresh();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(searchGame));
        searchGame.click();
        searchGame.sendKeys("The making");

    }

    public void setGo(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Go.click();
    }

    public void setSelectGame(){
        selectGame.click();
    }
}
