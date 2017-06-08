package javier_jbehave_serenity.comteco.pages;

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


// https://www.comteco.com.bo/guiatel/guiatelf.php

@DefaultUrl("https://www.comteco.com.bo/guiatel/guiatelf.php")
public class COMTECO_Page extends PageObject{
	
	@FindBy(xpath="//form/div[1]/div/input")
    private WebElementFacade campoNombre;
	
	@FindBy(id="ap_pat")
    private WebElementFacade campoApellido;
	
	@FindBy(xpath=".//*[@id='GuiatelForm']/div[3]/div/button[1]")
	private WebElementFacade botonConsultar;

	@FindBy(xpath=".//*[@id='sha']/div[2]/div[4]/small/strong[2]")
	private WebElementFacade resultado;
	
	//@FindBy(xpath=".//*[@id='sha']/div[2]/div[4]/small/strong[2]")
	//.//*[@id='sha']/div[2]/div[4]/small/text()[3]
	
	@FindBy(id = "status")
	private WebElementFacade dropdown;
	
	
	public void seleccionar_nombre_y_apellido_en_selector() {
		//Select dropdown = new Select(getDriver().findElement(By.id("status")));
		dropdown.selectByIndex(1);
		// dropdown.selectByValue("nombre");
		//dropdown.selectByVisibleText("Nombre & Apellidos");
	}

	public void insertNombre(String nombre) {
		typeInto(campoNombre, nombre);
	}

	public void insertApellido(String apellido) {
		typeInto(campoApellido, apellido);
	}

	public void clique_boton_consulta() {
		botonConsultar.click();
	}

	public String obtenerNumero() {
		return resultado.getText();
	}

	/*
	 * public Iterable<? super String> obtenerNumero() {
		return resultado.getText();
	}
	 */
	
	public WebElementFacade waitFor(WebElementFacade webElement) {
        return getRenderedView().waitFor(webElement);
    }
	
	  public COMTECO_Page waitForReady() {	       
	        waitFor(dropdown);
			return this;
	  }
	  	  
}
