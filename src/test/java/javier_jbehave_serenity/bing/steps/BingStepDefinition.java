package javier_jbehave_serenity.bing.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import javier_jbehave_serenity.bing.steps.serenity.BingEndUserSteps;
import net.thucydides.core.annotations.Steps;

public class BingStepDefinition {
	
	@Steps
	BingEndUserSteps bingEndUser;
	
	@Given("user is in the Bing homepage")
		public void given_user_is_in_the_bing_homepage()
		{
			bingEndUser.is_in_the_bing_homepage();
		}
	
	@When("users enteres search term '$searchTerm'")
		public void when_users_enters_search_term(String searchTerm){
			bingEndUser.enters_search_term(searchTerm);
		}	
		
	@When("user clicks on the search button")
		public void when_user_clicks_on_the_search_button(){
			bingEndUser.clicks_on_search_button();
		}

	@Then("user should be able to '$searchResult'")
	public void then_user_should_be_able_to(String searchResult){
		bingEndUser.should_be_able_to_see_results(searchResult);
	}
}
