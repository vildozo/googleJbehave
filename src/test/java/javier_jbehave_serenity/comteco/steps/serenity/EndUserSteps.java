package javier_jbehave_serenity.comteco.steps.serenity;

//import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

import javier_jbehave_serenity.comteco.pages.COMTECO_Page;
import net.thucydides.core.annotations.Step;

public class EndUserSteps {

	COMTECO_Page comteco_page;
		
	@Step
	public void is_the_home_page() {
		comteco_page.open();
    	//comteco_page.waitForReady();	
	}

	@Step
	public void select_option_nombre_y_apellido() {
		comteco_page.seleccionar_nombre_y_apellido_en_selector();
	}

	@Step
	public void insertar_nombre_apellido_a_campos(String nombre, String apellido) {
		comteco_page.insertNombre(nombre);
		comteco_page.insertApellido(apellido);
	}

	@Step
	public void cliqueOnBotton() {
		comteco_page.clique_boton_consulta();
	}

	@Step
	public void verResultadoDeBusqueda(String numero) {
		assertEquals(comteco_page.obtenerNumero(),numero);
		//assertThat(comteco_page.obtenerNumero(), hasItem(containsString(numero)));
	}

	
	/*
	 * @Step
	public void verResultadoDeBusqueda(String numero) {
		assertThat(comteco_page.obtenerNumero(), hasItem(containsString(numero)));
	}
	 */
	


	
}
