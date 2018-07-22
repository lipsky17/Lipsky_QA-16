package com.tran.qa16;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
        initContactCreation();
        fillContactForms(new ContactData().withFirstname("Dima")
                .withLastname("Lipsky")
                .withAddress("Tel Aviv, Shenkin 9")
                .withMobile("0546987521")
                .withEmail("123@k.com"));
        submitContactCreation();
    }

}
