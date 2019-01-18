package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStepDef {
    @Given("^I am in test given$")
    public void i_am_in_test_given() {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
                System.out.println("I am in test GIVEN");
    }

    @When("^I am in test when$")
    public void i_am_in_test_when() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("I am in test WHEN");
    }

    @Then("^I am in test then$")
    public void i_am_in_test_then() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        System.out.println("I am in test THEN");
    }
}
