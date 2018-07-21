package com.tran.qa16;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {


    @Test
    public void testGroupDeletion() {
        goToGroupsPage();
        selectGroup();
        initDeletionOfTheGroup();
        returnToTheGroupsPage();
    }


}
