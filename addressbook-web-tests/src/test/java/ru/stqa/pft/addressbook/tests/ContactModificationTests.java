package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getContactHelper().chooseContact();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillFieldsContact(new ContactData("Edit Anton", "Edit Mimiron", "Uldum", "89267253535", "antonpushka@mail.ru"));
        app.getContactHelper().submitContactModification();
        app.getContactHelper().gotoHomePage();
    }
}
