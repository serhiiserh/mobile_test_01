package com.remindly.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.util.Collection;

public class MainScreenHelper extends BaseHelper{
    public MainScreenHelper(AppiumDriver driver) {
        super(driver);
    }
// click OK
    public void confirm() {
        tap(By.id("android:id/button1"));
    }
// find field phone with text
    public boolean isNoReminderTextPresent() {
        return isElementPresent(By.id("no_reminder_text"));
    }

    public void tapOnAddReminder() {
        tap(By.id("add_reminder"));
    }

    public String isReminderTitlePresent() {
    return driver.findElement(By.id("recycle_title")).getText();
    }



    public boolean isLicenseTextPresent() {
        return isElementPresent(By.id("licenses_text_view"));
    }

    public void tapThreeDots() {
        tap(By.className("android.widget.ImageView"));
    }


    public void tapLicenseField() {
        tap(By.className("android.widget.LinearLayout"));
    }
}
