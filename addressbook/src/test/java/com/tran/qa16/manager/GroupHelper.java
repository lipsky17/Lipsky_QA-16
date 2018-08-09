package com.tran.qa16.manager;

import com.tran.qa16.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    public void returnToTheGroupsPage() {
        click(By.linkText("group page"));
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupsForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());

        type(By.name("group_header"), groupData.getHeader());

        type(By.name("group_footer"), groupData.getFooter());
    }


    public void initGroupCreation() {
        click(By.xpath("//*[@value='New group'][1]"));
    }

    public void goToGroupsPage() {
        if (!isElementPresent(By.xpath("//h1[contains(text(),'Groups')]"))
                && !isElementPresent(By.name("new"))) {
            click(By.cssSelector("[href='group.php']"));
        }
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }

    public void modifyGroupsForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void groupDeletion() {
        click(By.name("delete"));
    }

    public void selectGroupByIndex(int ind) {
        wd.findElements(By.name("selected[]")).get(ind).click();
    }

    public int getGroupsCount() {
        return wd.findElements(By.cssSelector("span.group")).size();
    }

    public boolean isGroupPresent() {
        return isElementPresent(By.name("selected[]"));
    }

    public void createGroup() {
        initGroupCreation();
        fillGroupsForm(new GroupData().withName("ghjkk")
                .withHeader("jjdjdjd")
                .withFooter("ssasada"));
        submitGroupCreation();
        returnToTheGroupsPage();
    }
}
