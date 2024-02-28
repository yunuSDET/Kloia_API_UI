package com.kloia.step_definitions;

import com.kloia.pages.HomePage;
import com.kloia.pages.LoginPage;
import com.kloia.utilities.BrowserUtils;
import com.kloia.utilities.ConfigurationReader;
import com.kloia.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class N11TestScenarios {

    HomePage homePage=new HomePage();
    LoginPage loginPage=new LoginPage();


    @Given("Navigate to {string}")
    public void navigate_to(String url) {
       Driver.getDriver().get(ConfigurationReader.getProperty(url));
    }

    @When("Navigate to login page")
    public void navigate_to_login_page() {
    homePage.loginLink.click();
    }


    @When("Log in with facebook")
    public void log_in_with_facebook() {
    loginPage.facebookBtn.click();
        BrowserUtils.switchToWindow("Facebook");
        BrowserUtils.waitFor(3);
    loginPage.inputEmail.sendKeys(ConfigurationReader.getProperty("email"));
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        BrowserUtils.waitFor(1);
        loginPage.loginBtn.click();
    }


    @Then("Verify successful login")
    public void verify_successful_login() {

        BrowserUtils.waitFor(2);
        BrowserUtils.switchToWindow("n11");
        BrowserUtils.waitFor(6);


        Assert.assertEquals("n11 - 10 Üzerinden 11'lik Alışveriş Deneyimi", Driver.getDriver().getTitle());

    }



}
