package com.tran.qa16;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        goToGroupsPage();
        initGroupCreation();
        fillGroupsForm(new GroupData().withName("ghjkk")
                .withHeader("jjdjdjd")
                .withFooter("ssasada"));
        submitGroupCreation();
        returnToTheGroupsPage();
    }


}


