package com.tran.qa16.manager;

import com.tran.qa16.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    SessionHelper sessionHelper;
    GroupHelper groupHelper;
    private WebDriver wd;

    public void start() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        sessionHelper = new SessionHelper(wd);
        sessionHelper.openSite("http://localhost/addressbook");
        sessionHelper.login("admin", "secret");
        groupHelper = new GroupHelper(wd);
    }

    public void stop() {
        wd.quit();
    }

    public void submitContactCreation() {
        wd.findElement(By.name("submit")).click();
    }

    public void fillContactForms(ContactData contactData) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());

        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(contactData.getLastname());

        wd.findElement(By.name("address")).click();
        wd.findElement(By.name("address")).clear();
        wd.findElement(By.name("address")).sendKeys(contactData.getAddress());

        wd.findElement(By.name("mobile")).click();
        wd.findElement(By.name("mobile")).clear();
        wd.findElement(By.name("mobile")).sendKeys(contactData.getMobile());

        wd.findElement(By.name("email")).click();
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys(contactData.getEmail());

    }

    public void initContactCreation() {
        wd.findElement(By.linkText("add new")).click();

    }

    public void submitContactModification() {
        wd.findElement(By.name("update")).click();
    }

    public void modifyContactsForm(ContactData contactData) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());

        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(contactData.getLastname());

        wd.findElement(By.name("address")).click();
        wd.findElement(By.name("address")).clear();
        wd.findElement(By.name("address")).sendKeys(contactData.getAddress());

        wd.findElement(By.name("mobile")).click();
        wd.findElement(By.name("mobile")).clear();
        wd.findElement(By.name("mobile")).sendKeys(contactData.getMobile());

        wd.findElement(By.name("email")).click();
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys(contactData.getEmail());


    }

    public void initContactModification() {
        wd.findElement(By.xpath("//*[@title='Edit']")).click();

    }

    public void selectContact() {
        wd.findElement(By.name("selected[]")).click();
    }

    public void selectContactByIndex(int ind) {
        wd.findElements(By.name("selected[]")).get(ind).click();
    }

    public void deleteContact() {
        wd.findElement(By.xpath("//*[@value='Delete']")).click();
    }

    public void confirmAlert() {
        wd.switchTo().alert().accept();
    }

    public void dissmisAlert() {
        wd.switchTo().alert().dismiss();
    }


    public int getContactsCount() {
        return wd.findElements(By.cssSelector("form:nth-child(10) table.sortcompletecallback-applyZebra:nth-child(2) tbody:nth-child(1) tr:nth-child(2) > td.center:nth-child(1)")).size();
    }

    public boolean isElementPresent(By locator) {
        try {
            wd.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }


    public boolean isContactPresent() {
        return isElementPresent(By.name("selected[]"));
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

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }
}
