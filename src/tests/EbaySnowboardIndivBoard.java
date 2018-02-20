package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class EbaySnowboardIndivBoard {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.ebay.com.au/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testEbaySnowboardIndivBoard() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Sports")).click();
    driver.findElement(By.cssSelector("button.b-list__footer-resetbutton.b-list__footer--viewall")).click();
    driver.findElement(By.xpath("//li[@id='w1-w0-w32']/button")).click();
    driver.findElement(By.linkText("See all in Skiing & Snowboarding Equipment")).click();
    driver.findElement(By.xpath("//img[@alt='Snowboarding']")).click();
    //
      //
      // driver.get(baseUrl + "/b/Skiing-Snowboarding-Equipment/36259/bn_1843340");
    driver.findElement(By.xpath("//div[@id='w4-xCarousel-x-carousel-items']/ul/li[2]/a/div")).click();
    driver.findElement(By.cssSelector("div.b-guidancecard__img")).click();
    driver.findElement(By.cssSelector("img.b-img")).click();
    driver.findElement(By.linkText("Burton")).click();
    driver.findElement(By.cssSelector("h3.s-item__title")).click();
   // driver.findElement(By.id("boBtn_btn")).click();
  }

  @After
  public void tearDown() throws Exception {
    //driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
