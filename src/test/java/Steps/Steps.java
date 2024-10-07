package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	
	@Given("User is on homepage")
	public void user_is_on_homepage() {
	    System.out.println("I am on homepage");
	}

	@Given("User accepts the cookies")
	public void user_accepts_the_cookies() {
	    System.out.println("I will accpet the cookies ");
	}

	@When("User selects a product")
	public void user_selects_a_product() {
	    System.out.println("Products selected");
	}

	@Then("User should land on product page")
	public void user_should_land_on_product_page() {
	    System.out.println("Will take you to checkout");
	}


}
