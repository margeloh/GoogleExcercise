package org.examples.tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MyStepdefs_GoogleRegistration {
    WebDriver driverObj;
    @Given("the user is on the Google account registration page")
    public void theUserIsOnTheGoogleAccountRegistrationPage() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driverObj = new ChromeDriver();
        driverObj.navigate().to("https://accounts.google.com/SignUp");
    }

    @When("the user enters their first name, last name, username, password, and confirms the password as follows")
    public void theUserEntersTheirFirstNameLastNameUsernamePasswordAndConfirmsThePasswordAsFollows() {
        System.out.println("Website title is = " + driverObj.getTitle());
        driverObj.manage().deleteAllCookies();
        driverObj.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driverObj.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driverObj.findElement(By.id("firstName")).sendKeys("Mari");
        driverObj.findElement(By.id("lastName")).sendKeys("Maasikas");
        driverObj.findElement(By.id("username")).sendKeys("marimaasikas955");
        driverObj.findElement(By.name("Passwd")).sendKeys("hN6@jK#9");
        driverObj.findElement(By.name("ConfirmPasswd")).sendKeys("hN6@jK#9");
        driverObj.findElement(By.xpath("//button[span[contains(text(), 'rgmine')]]")).click();
    }

    @And("the user clicks on the {string} button")
    public void theUserClicksOnTheButton(String arg0) {
    }

    @Then("close browser")
    public void closeBrowser() {
        System.out.println("End");
        driverObj.quit();
    }
}
