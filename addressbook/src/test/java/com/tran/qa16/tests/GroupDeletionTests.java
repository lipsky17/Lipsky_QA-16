package com.tran.qa16.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {


    @Test
    public void deletionLastGroupTest() {
        app.getGroupHelper().goToGroupsPage();
        if (!app.getGroupHelper().isGroupPresent()) {
            app.getGroupHelper().createGroup();
        }
        int before = app.getGroupHelper().getGroupsCount();
        app.getGroupHelper().selectGroupByIndex(before - 1);
        app.getGroupHelper().groupDeletion();
        app.getGroupHelper().returnToTheGroupsPage();
        int after = app.getGroupHelper().getGroupsCount();

        Assert.assertEquals(after, before - 1);
    }


    @Test
    public void deletionFirstGroupTest() {
        app.getGroupHelper().goToGroupsPage();
        if (!app.getGroupHelper().isGroupPresent()) {
            app.getGroupHelper().createGroup();
        }
        int before = app.getGroupHelper().getGroupsCount();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().groupDeletion();
        app.getGroupHelper().returnToTheGroupsPage();
        int after = app.getGroupHelper().getGroupsCount();

        Assert.assertEquals(after, before - 1);
    }


}
