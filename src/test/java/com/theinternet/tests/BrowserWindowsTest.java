package com.theinternet.tests;

import com.theinternet.pages.BrowserWindowsPage;
import com.theinternet.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserWindowsTest extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getMultipleWindows();
    }

    @Test
    public void selectNewTabTest() {
        new BrowserWindowsPage(driver).switchToNextTab(1).verifyNewTabText("New Window");
    }


}
