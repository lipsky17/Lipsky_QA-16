package com.tran.qa16.tests;

import com.tran.qa16.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
        app.initContactCreation();
        app.fillContactForms(new ContactData().withFirstname("Dima")
                .withLastname("Lipsky")
                .withAddress("Tel Aviv, Shenkin 9")
                .withMobile("0546987521")
                .withEmail("123@k.com"));
        app.submitContactCreation();
    }

}
