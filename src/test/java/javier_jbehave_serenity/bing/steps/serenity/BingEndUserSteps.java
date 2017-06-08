package javier_jbehave_serenity.bing.steps.serenity;

import javier_jbehave_serenity.bing.pages.Bing_Page;
import net.thucydides.core.annotations.Step;

import static org.junit.Assert.assertEquals;

public class BingEndUserSteps  {

	Bing_Page bing_page;
	
	@Step
	public void is_in_the_bing_homepage() {
		bing_page.open();
	}

	@Step
	public void enters_search_term(String searchTerm) {
		bing_page.enterSearch(searchTerm);
	}

	@Step
	public void clicks_on_search_button() {
		bing_page.click_search_button();
	}

	@Step
	public void should_be_able_to_see_results(String searchResult) {
		assertEquals(searchResult, bing_page.get_search_result());
	}
	
	

}
