package com.tran.qa16;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

    @Test

    public void testContactModification() {
        selectContact();
        initContactModification();
        modifyContactsForm(new ContactData().withFirstname("Dima3333132")
                .withLastname("Lipsky12333")
                .withAddress("Tel Aviv12333, Shenkin 9")
                .withMobile("054698752poi")
                .withEmail("123@k44dd.com"));
        submitContactModification();

    }

}
