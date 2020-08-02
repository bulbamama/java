package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class ApplicationManager {

    private final ContactHelper contactHelper = new ContactHelper();
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;

    public void init() {
        contactHelper.wd = new FirefoxDriver();
        contactHelper.wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        contactHelper.wd.get("http://localhost/addressbook/");
        groupHelper = new GroupHelper(contactHelper.wd);
        navigationHelper = new NavigationHelper(contactHelper.wd);
        sessionHelper = new SessionHelper(contactHelper.wd);
        sessionHelper.login("admin", "secret");
    }


    public void logout() {
        contactHelper.wd.findElement(By.linkText("Logout")).click();
    }

    public void stop() {
        contactHelper.wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public void login(String username, String password) {
      contactHelper.wd.findElement(By.name("user")).click();
      contactHelper.wd.findElement(By.name("user")).clear();
      contactHelper.wd.findElement(By.name("user")).sendKeys(username);
      contactHelper.wd.findElement(By.name("pass")).clear();
      contactHelper.wd.findElement(By.name("pass")).sendKeys(password);
      contactHelper.wd.findElement(By.xpath("//input[@value='Login']")).click();
    }

    public void gotoHomePage() {
      contactHelper.wd.findElement(By.linkText("home page")).click();
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
