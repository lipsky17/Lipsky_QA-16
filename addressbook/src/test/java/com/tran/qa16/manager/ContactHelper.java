package com.tran.qa16.manager;

import com.tran.qa16.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }


    public void fillContactForms(ContactData contactData) {
        type(By.name("firstname"),contactData.getFirstname());
        type(By.name("lastname"),contactData.getLastname());
        type(By.name("address"),contactData.getAddress());
        type(By.name("mobile"),contactData.getMobile());
        type(By.name("email"),contactData.getEmail());
    }

    public void initContactCreation() {
        click(By.linkText("add new"));

    }

    public void submitContactModification() {
        click(By.name("update"));
    }

    public void modifyContactsForm(ContactData contactData) {
        type(By.name("firstname"),contactData.getFirstname());
        type(By.name("lastname"),contactData.getLastname());
        type(By.name("address"),contactData.getAddress());
        type(By.name("mobile"),contactData.getMobile());
        type(By.name("email"),contactData.getEmail());

    }

    public void initContactModification() {
        click(By.xpath("//*[@title='Edit']"));

    }

    public void selectContact() {
        click(By.name("selected[]"));
    }

    public void selectContactByIndex(int ind) {
        wd.findElements(By.name("selected[]")).get(ind).click();
    }

    public void deleteContact() {
        click(By.xpath("//*[@value='Delete']"));
    }

    public int getContactsCount() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public void createContact() {
        initContactCreation();
        fillContactForms(new ContactData().withFirstname("Dima")
                .withLastname("Lipsky")
                .withAddress("Tel Aviv, Shenkin 9")
                .withMobile("0546987521")
                .withEmail("123@k.com"));
        submitContactCreation();
    }

    public boolean isContactPresent() {
        return isElementPresent(By.name("selected[]"));
    }

}
