package com.remindly.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainScreenTests extends TestBase{

    //confirm OK
    @BeforeMethod

    public void precondition(){
        app.getMainScreen().confirm();
    }
    // verify text is displayed,

    @Test

    public void appLaunchTest(){
        Assert.assertTrue(app.getMainScreen().isNoReminderTextPresent());
    }

    @Test

    public void appLicenseTest(){
        app.getMainScreen().tapThreeDots();
        app.getMainScreen().tapLicenseField();
        Assert.assertTrue(app.getMainScreen().isLicenseTextPresent());
    }
}
