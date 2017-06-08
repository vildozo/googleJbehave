package javier_jbehave_serenity.comteco.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import javier_jbehave_serenity.comteco.steps.serenity.EndUserSteps;
import net.thucydides.core.annotations.Steps;

public class GoogleStepDefinitions {
	
	@Steps
	EndUserSteps endUser;
	
	@Given("the user is in the guia telefonica Comteco homepage")
	public void givenTheUserIsInTheGuiaTelefonicaComtecoHomePage()
	{
		endUser.is_the_home_page();
	}
	
	@When("the user selects Nombre & Apellido")
	public void whenTheUserSelectsNombreAndApellido(){
		endUser.select_option_nombre_y_apellido();
	}
	
	@When("the user inserts nombre '$nombre' and apellido '$apellido'")
	public void when_the_user_inserts_nombre_and_apellido(String nombre, String apellido){
		endUser.insertar_nombre_apellido_a_campos(nombre,apellido);
	}
	
	@When("you click on botton")
	public void when_you_click_on_button(){
		endUser.cliqueOnBotton();
	}
	
	@Then("I should see number '$numero'")
	public void thenIShouldSeeNumber(String numero){
		endUser.verResultadoDeBusqueda(numero);
	}

	

}
