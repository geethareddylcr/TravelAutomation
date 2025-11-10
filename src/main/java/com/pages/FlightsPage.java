package com.travel.pages;

import com.travel.base.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FlightsPage extends BasePage {

    public FlightsPage(WebDriver driver) {
        super(driver);
    }

    By flightsTab = By.xpath("//span[text()='Flights']");

    public void openFlights() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Close the login / language popup if present
        try {
            WebElement closePopup = driver.findElement(By.cssSelector("span.commonModal__close"));
            closePopup.click();
        } catch (Exception ignored) {}

        // Wait for the image slider overlay to disappear
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(
                    By.cssSelector(".imageSlideContainer")));
        } catch (Exception ignored) {}

        // Click via JavaScript to bypass any leftover overlay
        WebElement flights = wait.until(ExpectedConditions.elementToBeClickable(flightsTab));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", flights);
    }
}