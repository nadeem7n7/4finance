package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class userPage {

    @FindBy(xpath = "//a[@href='/collection/user/Octavian?own=1&subtype=boardgame&ff=1']")
    WebElement selectGametype;

    private ChromeDriver driver;

    public userPage(ChromeDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setSelectGametype(){
        selectGametype.click();
    }
}
