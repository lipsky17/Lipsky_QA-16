package com.tran.qa16.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

    @Test

    public void testContactDeletion() throws InterruptedException {
        if (!app.getSessionHelper().isOnTheHomePage()) {
            app.getSessionHelper().goToTheHomePage();
        }

        if (!app.getContactHelper().isContactPresent()) {
            app.getContactHelper().createContact();
        }
        int before = app.getContactHelper().getContactsCount();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.getContactHelper().confirmAlert();
        Thread.sleep(2000);
        int after = app.getContactHelper().getContactsCount();

        Assert.assertEquals(after, before - 1);
    }


}
