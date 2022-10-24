package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gamePage {

    private ChromeDriver driver;

    @FindBy(xpath="//*[@class='btn btn-xs btn-empty feature-action-icon']")
    WebElement languagedependence;

    public gamePage(ChromeDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setlanguagedependence(){
        Actions actions = new Actions(driver);
        actions.moveToElement(languagedependence);
        languagedependence.click();

    }
}
