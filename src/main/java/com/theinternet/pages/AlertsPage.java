package com.theinternet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AlertsPage extends BasePage{
    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[onclick='jsAlert()']")
    WebElement jsAlert;

    public AlertsPage clickByJsAlert() {
        click(jsAlert);
        driver.switchTo().alert().accept();
        return this;
    }

    @FindBy(css = "[onclick='jsConfirm()']")
    WebElement jsConfirm;

    public AlertsPage selectResult(String confirm) {
        click(jsConfirm);
        if (confirm != null && confirm.equals("OK")) {
            driver.switchTo().alert().accept();
        } else if (confirm != null && confirm.equals("Cancel")) {
            driver.switchTo().alert().dismiss();
        }

        return this;
    }

    @FindBy(id = "result")
    WebElement confirmResult;

    public AlertsPage verifyResult(String result) {
        Assert.assertTrue(confirmResult.getText().contains(result));
        return this;
    }

    @FindBy(css = "[onclick='jsPrompt()']")
    WebElement jsPrompt;


    public AlertsPage sendMessageToAlert(String message) {
            click(jsPrompt);
        if (message != null) {
            driver.switchTo().alert().sendKeys(message);
            driver.switchTo().alert().accept();
        }

        return this;
    }


    public AlertsPage verifyMessage(String text) {
        Assert.assertTrue(confirmResult.getText().contains(text));
        return this;
    }
}
