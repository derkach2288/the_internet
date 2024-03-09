package com.theinternet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[href='/javascript_alerts']")
    WebElement javascript_alerts;

    public void getAlert() {
        click(javascript_alerts);
    }

    @FindBy(css = "[href='/windows']")
    WebElement windowsButton;


    public void getMultipleWindows() {
        click(windowsButton);
    }
}
