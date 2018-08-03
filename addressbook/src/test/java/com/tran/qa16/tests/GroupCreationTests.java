package com.tran.qa16.tests;

import com.tran.qa16.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getGroupHelper().goToGroupsPage();
        int before = app.getGroupHelper().getGroupsCount();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupsForm(new GroupData().withName("ghjkk")
                .withHeader("jjdjdjd")
                .withFooter("ssasada"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToTheGroupsPage();
        int after = app.getGroupHelper().getGroupsCount();

        Assert.assertEquals(after, before + 1);
    }


}


