package com.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
  public static WebDriver driver;
  public static JavascriptExecutor js;


  public void setDriver(WebDriver driver){
      BasePage.driver = driver;
      BasePage.js = (JavascriptExecutor) driver;
  }

  protected WebElement find(By locator){
      WebElement webElement = driver.findElement(locator);
      js.executeScript("arguments[0].scrollIntoView(true);",webElement);
      return webElement;
  }

  protected void set(By locator,String text){
      WebElement webElement = find(locator);
      webElement.clear();
      webElement.sendKeys(text);
  }

  protected void click(By locator){
      find(locator).click();
  }

  protected void selectByText(By locator, String text){
      Select select = new Select(find(locator));
      select.selectByVisibleText(text);
  }

  protected String getText(By locator){
      return find(locator).getText();
  }


}
