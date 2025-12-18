package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class product_page {
    private WebDriver driver;

    private By filterDropdown = By.className("product_sort_container");


    public product_page(WebDriver driver) {
        this.driver = driver;
    }

    public void sortByNameAToZ() {
        Select select = new Select(driver.findElement(filterDropdown));
        select.selectByValue("az");
    }

    public void sortByNameZToA() {
        Select select = new Select(driver.findElement(filterDropdown));
        select.selectByValue("za");
    }

    public void sortByPriceLowToHigh() {
        Select select = new Select(driver.findElement(filterDropdown));
        select.selectByValue("lohi");
    }

    public void sortByPriceHighToLow() {
        Select select = new Select(driver.findElement(filterDropdown));
        select.selectByValue("hilo");
    }


}
