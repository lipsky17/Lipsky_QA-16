package com.tran.qa16.tests;

import com.tran.qa16.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

    @Test

    public void testContactModification() {
        if(!app.getContactHelper().isContactPresent()){
            app.getContactHelper().createContact();
        }
        int before = app.getContactHelper().getContactsCount();
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactModification();
        app.getContactHelper().modifyContactsForm(new ContactData().withFirstname("Dima3333132")
                .withLastname("Lipsky12333")
                .withAddress("Tel Aviv12333, Shenkin 9")
                .withMobile("054698752poi")
                .withEmail("123@k44dd.com"));
        app.getContactHelper().submitContactModification();
        int after = app.getContactHelper().getContactsCount();

        Assert.assertEquals(after, before);

    }

}
