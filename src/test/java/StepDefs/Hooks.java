package StepDefs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hooks {

    public static WebDriver driver;
    @Before
    public static void openBrowser() throws MalformedURLException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");
        driver = new ChromeDriver(options);
        //driver = new RemoteWebDriver(new URL( "http://192.168.56.1:4444/wd/hub"), options);
        driver.manage().window().maximize();
        String dateStr = "05/05/2023";
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = dateFormat.parse(dateStr);
            Cookie cookie = new Cookie("wordpress_sec_4a184fc6ab3b1000027a3958ee5e0c6b","boudouhomar00%7C1683061981%7CMr4juo9pVDCY2xqxf8w7i3spxbS9doX7nsquD4VEhK9%7Ca854f8b1255f26f3beacdcf54ed91a906f8e96d8a10a83d860629afcf989ab52","/wp-content/plugins",date);
            driver.manage().addCookie(cookie);
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
    public static void cliquer(){
        Actions actions = new Actions(driver);
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        robot.mouseMove(50,50);
        actions.click().build().perform();
    }


    @After
    public void embedScreenshot(Scenario scenario) {

        if(scenario.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException noSupportScreenshot) {
                System.err.println(noSupportScreenshot.getMessage());
            }
        }
        driver.quit();
    }
}

