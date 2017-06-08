package javier_jbehave_serenity.google.steps.serenity;

import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import javier_jbehave_serenity.google.pages.GoogleSearch_Page;
public class GoogleSearch_Steps {

	GoogleSearch_Page google_page;
	
	
	@Step
    public void enters(String keyword) {
		google_page.enter_keywords(keyword);
    }
	
	
	@Step
	public void is_the_home_page() {
		google_page.open();
	}
	
	@Step
	public void looks_for(String word) {
		google_page.enter_keywords(word);
	}
	
	@Step
    public void starts_search() {
		google_page.lookup_terms();
    }

	@Step
	public void clicks_button() {		
		google_page.lookup_terms();
		
	}
	
	@Step
	public void should_see_the_definition(String definition) {
		assertThat(google_page.getDefinitions(), hasItem(containsString(definition)));
	}
	
	
	
	
}
