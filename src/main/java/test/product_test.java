package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.login_page;
import page.product_page;

import java.time.Duration;

public class product_test {
    WebDriver driver;
    login_page login_page;
    product_page product_page;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
        login_page = new login_page(driver);
        product_page = new product_page(driver);
    }

    @Test(priority = 0)
    public void login() throws InterruptedException {
        login_page.login("standard_user", "secret_sauce");
        Thread.sleep(2000);
    }

    @Test(priority = 1, dependsOnMethods = "login")
    public void option1() throws InterruptedException {
        product_page.sortByNameAToZ();
        Thread.sleep(2000);
    }

    @Test(priority = 2, dependsOnMethods = "login")
    public void option2() throws InterruptedException {
        product_page.sortByNameZToA();
        Thread.sleep(2000);
    }

    @Test(priority = 3, dependsOnMethods = "login")
    public void option3() throws InterruptedException {
        product_page.sortByPriceLowToHigh();
        Thread.sleep(2000);
    }

    @Test(priority = 4, dependsOnMethods = "login")
    public void option4() throws InterruptedException {
        product_page.sortByPriceHighToLow();
        Thread.sleep(2000);
    }
}
