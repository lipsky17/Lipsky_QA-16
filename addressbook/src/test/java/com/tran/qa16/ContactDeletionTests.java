package com.tran.qa16;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

    @Test

    public void testContactDeletion() {
        selectContact();
        deleteContact();
        confirmAlert();
    }


}
