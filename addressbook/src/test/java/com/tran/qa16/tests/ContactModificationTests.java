package com.tran.qa16.tests;

import com.tran.qa16.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

    @Test

    public void testContactModification() {
        if(!app.isContactPresent()){
            app.createContact();
        }
        int before = app.getContactsCount();
        app.selectContact();
        app.initContactModification();
        app.modifyContactsForm(new ContactData().withFirstname("Dima3333132")
                .withLastname("Lipsky12333")
                .withAddress("Tel Aviv12333, Shenkin 9")
                .withMobile("054698752poi")
                .withEmail("123@k44dd.com"));
        app.submitContactModification();
        int after = app.getContactsCount();

        Assert.assertEquals(after, before);

    }

}
