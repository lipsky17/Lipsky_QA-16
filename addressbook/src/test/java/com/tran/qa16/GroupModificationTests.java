package com.tran.qa16;

import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {


    @Test
    public void testGroupModification() {
        goToGroupsPage();
        selectGroup();
        initGroupModification();
        modifyGroupsForm(new GroupData().withName("123456")
                .withHeader("456789")
                .withFooter("147852"));
        submitGroupModification();
        returnToTheGroupsPage();
    }


}
