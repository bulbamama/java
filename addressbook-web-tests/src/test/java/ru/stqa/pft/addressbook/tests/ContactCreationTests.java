package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    gotoAddNewContact();
    fillFieldsContact(new ContactData("Anton", "Mimiron", "Uldum", "89267253535", "antonpushka@mail.ru"));
    submitContact();
    gotoHomePage();
    logout();
  }
}