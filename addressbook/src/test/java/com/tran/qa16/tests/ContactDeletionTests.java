package com.tran.qa16.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

    @Test

    public void testContactDeletion() {
        if(!app.isContactPresent()){
            app.createContact();
        }
        int before = app.getContactsCount();
        app.selectContact();
        app.deleteContact();
        app.confirmAlert();
        int after = app.getContactsCount();

        Assert.assertEquals(after, before -1 );
    }


}
