package com.demoqa.test.base;

import com.demoqa.pages.BasePage;
import com.demoqa.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class BaseTest {
    protected WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private String url = "https://demoqa.com/";
    private String browser = "edge";

    @BeforeClass
    public void setUp(){
        switch (browser){
            case("edge"):
                driver = new EdgeDriver();
                break;
            case("firefox"):
                driver = new FirefoxDriver();
                break;
            case("safari"):
                driver = new SafariDriver();
                break;
            default:
                driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        basePage = new BasePage();
        homePage = new HomePage();
        basePage.setDriver(driver);
    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
