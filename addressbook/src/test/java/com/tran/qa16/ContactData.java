package com.tran.qa16;

public class ContactData {
    private String firstname;
    private String lastname;
    private String address;
    private String mobile;
    private String email;

    public ContactData withFirstname(String firstname) {
        this.firstname = firstname;
        return  this;
    }

    public ContactData withLastname(String lastname) {
        this.lastname = lastname;
        return  this;
    }

    public ContactData withAddress(String address) {
        this.address = address;
        return  this;
    }

    public ContactData withMobile(String mobile) {
        this.mobile = mobile;
        return  this;
    }

    public ContactData withEmail(String email) {
        this.email = email;
        return  this;
    }


    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }
}
