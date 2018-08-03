package com.tran.qa16.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogin extends TestBase {
    @BeforeMethod

    public void esurePrecondition() {
        app.getSessionHelper().logout();
    }

    @Test

    public void loginTest() {
        app.getSessionHelper().login("admin", "secret");

        Assert.assertTrue(app.isElementPresent(By.xpath("//a[contains(text(),'Logout')]")));
    }

    @Test

    public void negativeLoginTest() {
        app.getSessionHelper().login("admin", "123456");

        Assert.assertFalse(app.isElementPresent(By.xpath("//a[contains(text(),'Logout')]")));
    }


}
