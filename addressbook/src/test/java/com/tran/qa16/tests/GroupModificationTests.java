package com.tran.qa16.tests;

import com.tran.qa16.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {


    @Test
    public void testGroupModification() {
        app.getGroupHelper().goToGroupsPage();
        if (!app.getGroupHelper().isGroupPresent()) {
            app.getGroupHelper().createGroup();
        }
        int before = app.getGroupHelper().getGroupsCount();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().modifyGroupsForm(new GroupData().withName("123456")
                .withHeader("456789")
                .withFooter("147852"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToTheGroupsPage();
        int after = app.getGroupHelper().getGroupsCount();

        Assert.assertEquals(after, before);


    }


}
