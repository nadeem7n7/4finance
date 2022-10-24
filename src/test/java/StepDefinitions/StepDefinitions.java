package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import pageObjects.HomePage;
import pageObjects.userPage;
import pageObjects.gamePage;
import pageObjects.selectGame;


import java.util.concurrent.TimeUnit;

public class StepDefinitions {
    public static ChromeDriver driver;
    public String baseUrl = "https://boardgamegeek.com/";
    public HomePage homePage;
    public userPage userPage;
    public gamePage gamePage;
    public selectGame selectGame;




 @Before
    public static void setChromedriver()
    {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }
//    @After
//    public void quitBrowser(){
//
//     driver.quit();
//    }


    @Given("I Open the game collection of a user \\(any user, there is no need to create one).")
    public void i_open_the_game_collection_of_a_user_any_user_there_is_no_need_to_create_one() {

        driver.get(baseUrl);
        homePage = new HomePage(driver);
        homePage.setAcceptCookies();
        homePage.selectUser();

        }



    @And("Go to the page of one of the games \\(chosen at random).")
    public void go_to_the_page_of_one_of_the_games_chosen_at_random() {

        userPage = new userPage(driver);
        userPage.setSelectGametype();
        selectGame = new selectGame(driver);
        selectGame.setSearchGame();
        selectGame.setGo();
        selectGame.setSelectGame();
        gamePage = new gamePage(driver);
        gamePage.setlanguagedependence();

    }
    @Then("API Check the information about the game - look for poll results about Language Dependence.")
    public void api_check_the_information_about_the_game_look_for_poll_results_about_language_dependence() {


    }
    @Then("Verify that the most voted Language Dependence level is presented on the game's page.")
    public void verify_that_the_most_voted_language_dependence_level_is_presented_on_the_game_s_page() {


    }


}
