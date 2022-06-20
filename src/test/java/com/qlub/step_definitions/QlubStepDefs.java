package com.qlub.step_definitions;

import com.qlub.pages.InvoicePage;
import com.qlub.pages.MainPage;
import com.qlub.utilities.ConfigurationReader;
import com.qlub.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class QlubStepDefs {

    MainPage menuPage = new MainPage();
    InvoicePage invoicePage = new InvoicePage();

    @Given("The user scan the QR code")
    public void the_user_scan_the_QR_code() throws InterruptedException {
        Driver.get().get(ConfigurationReader.get("url"));
        Thread.sleep(3000);
    }

    @Then("The user on the Home Page")
    public void theUserOnTheHomePage() {
        Assert.assertEquals("Qlub_ | qa-assignment", Driver.get().getTitle());
    }

    @When("The user clicks on the View the Menu button")
    public void theUserClicksOnTheViewTheMenuButton() throws InterruptedException {
        menuPage.viewTheMenuButton.click();
        Thread.sleep(3000);
    }

    @Then("The user views Menu")
    public void theUserViewsMenu() {
        Assert.assertEquals("Qlub_ | qa-assignment Menu", Driver.get().getTitle());
    }

    @When("The user sees {string} button")
    public void theUserSeesButton(String str) {
        Assert.assertEquals(str, menuPage.payTheBillButton.getText());
    }

    @And("The user clicks on Pay the Bill button")
    public void theUserClicksOnPayTheBillButton() throws InterruptedException {
        menuPage.payTheBillButton.click();
        Thread.sleep(3000);
    }

    @Then("The user should see the bill that he ordered")
    public void theUserShouldSeeTheBillThatHeOrdered() {
        Assert.assertTrue(invoicePage.billStatement.isDisplayed());
    }
}
