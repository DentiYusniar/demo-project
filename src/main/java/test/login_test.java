package test;

import base_test.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page.login_page;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class login_test extends base {

    @Test (priority = 0)
    public void testLoginValid() {
        login_page login_page= new login_page(driver);
        login_page.login("standard_user", "secret_sauce");

        // Tunggu maksimal 10 detik sampai message muncul
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("/inventory.html"));
    }

    @Test (priority = 1)
    public void testLoginInvalidPassword() {
        login_page login_page = new login_page(driver);
        login_page.login("standard_user", "wrongpass");

        // Tunggu maksimal 10 detik sampai message muncul
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Tunggu sampai error message terlihat
        WebElement errorMsg = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.className("error-message-container"))
        );

        Assert.assertTrue(login_page.isErrorDisplayed());
        Assert.assertEquals(login_page.getErrorMessage(), "Epic sadface: Username and password do not match any user in this service");
    }

    @Test (priority = 2)
    public void testLoginInvalidUsername() {
        login_page login_page = new login_page(driver);
        login_page.login("wrongusername", "secret_sauce");

        // Tunggu maksimal 10 detik sampai message muncul
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Tunggu sampai error message terlihat
        WebElement errorMsg = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.className("error-message-container"))
        );

        Assert.assertTrue(login_page.isErrorDisplayed());
        Assert.assertEquals(login_page.getErrorMessage(), "Epic sadface: Username and password do not match any user in this service");
    }

    @Test (priority = 3)
    public void testLoginEmptyUsername() {
        login_page login_page = new login_page(driver);
        login_page.login("standard_user", "wrongpass");

        // Tunggu maksimal 10 detik sampai message muncul
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Tunggu sampai error message terlihat
        WebElement errorMsg = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.className("error-message-container"))
        );

        Assert.assertTrue(login_page.isErrorDisplayed());
        Assert.assertEquals(login_page.getErrorMessage(), "Epic sadface: Username and password do not match any user in this service");
    }

    @Test (priority = 4)
    public void testLoginEmptyPassword() {
        login_page login_page = new login_page(driver);
        login_page.login("wrongusername", "secret_sauce");

        // Tunggu maksimal 10 detik sampai message muncul
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Tunggu sampai error message terlihat
        WebElement errorMsg = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.className("error-message-container"))
        );

        Assert.assertTrue(login_page.isErrorDisplayed());
        Assert.assertEquals(login_page.getErrorMessage(), "Epic sadface: Username and password do not match any user in this service");
    }
}
