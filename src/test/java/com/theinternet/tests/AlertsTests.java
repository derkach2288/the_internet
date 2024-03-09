package com.theinternet.tests;

import com.theinternet.pages.AlertsPage;
import com.theinternet.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getAlert();
    }

    @Test
    public void clickByJsAlertTest() {
        new AlertsPage(driver).clickByJsAlert();
    }

    @Test
    public void clickByJsConfirmTest() {
        new AlertsPage(driver).selectResult("Cancel").verifyResult("Cancel");
    }

    @Test
    public void sendMessageToAlertTest() {
        new AlertsPage(driver).sendMessageToAlert("Hallo world!").verifyMessage("Hallo world!");
    }


}
