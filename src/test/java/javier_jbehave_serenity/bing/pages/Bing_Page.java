package javier_jbehave_serenity.bing.pages;


import static ch.lambdaj.Lambda.convert;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;


@DefaultUrl("http://www.bing.com")
public class Bing_Page extends PageObject{
	
		
	
	@FindBy(css="#sb_form_q")
	private WebElementFacade searchField;

	@FindBy(id="sb_form_go")
	private WebElementFacade searchButton;
	
	@FindBy(xpath=".//*[@id='b_results']/li[1]/h2/a/strong[1]")
	private WebElementFacade searchResult;
	
	
	
	public void enterSearch(String searchTerm) {
		//typeInto((WebElement) searchField, searchTerm);
		typeInto(searchField, searchTerm);
	}

	public void click_search_button() {
		clickOn(searchButton);		
	}

	public String get_search_result() {
		return searchResult.getText();
	}
}
