package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String firsname;
    private final String lastname;
    private final String address;
    private final String phonehome;
    private final String email;

    public ContactData(String firsname, String lastname, String address, String phonehome, String email) {
        this.firsname = firsname;
        this.lastname = lastname;
        this.address = address;
        this.phonehome = phonehome;
        this.email = email;
    }

    public String getFirsname() {
        return firsname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getPhonehome() {
        return phonehome;
    }

    public String getEmail() {
        return email;
    }

}
