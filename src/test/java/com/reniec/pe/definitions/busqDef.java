package com.reniec.pe.definitions;

import com.reniec.pe.steps.search.busqConsuladoSteps;
import com.reniec.pe.steps.validation.validationSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import com.reniec.pe.utilities.webSite;
import org.junit.Assert;


public class busqDef {
    @Steps(shared = true)
    webSite url;


    @Steps(shared = true)
    busqConsuladoSteps busqueda;

    @Steps(shared = true)
    validationSteps validation;

    @Given("que ingreso al portal de Reniec")
    public void userNavigateTo() {
        url.navigateTo("https://www.reniec.gob.pe/portal/masServiciosLinea.htm");
    }

    @When("doy clic en la opcion Peruanos en el Extranjero")
    public void el_usuario_navega_a_la_pagina_de_registro() {
        busqueda.Step_clicPeruanos();
    }

    @When("doy clic en la opcion CONSULADOS EN EL MUNDO")
    public void doy_clic_en_la_opcion_CONSULADOS_EN_EL_MUNDO() {
        busqueda.Step_clickConsulado();
    }

    @When("doy clic en la opción Lista de Consulados en el mundo")
    public void doy_clic_en_la_opcion_Lista_de_Consulados_en_el_mundo() {
        busqueda.Step_clicLista();

    }

    @When("realizo la busqueda de la palabra {string}")
    public void realizo_la_busqueda_de_la_palabra(String busquedaC) {
        busqueda.Step_ingresoBusqueda(busquedaC);
    }

    @When("doy clic en busqueda")
    public void doy_clic_en_busqueda() {
        busqueda.Step_clicBusqueda();
    }

    @Then("se muestra oficinas de consulado relacionada a la busqueda")
    public void se_muestra_oficinas_de_consulado_relacionada_a_la_busqueda() throws InterruptedException {
        Assert.assertTrue(validation.Step_isTituloVisible());
        Thread.sleep(2000);
    }

    @Then("regreso a la pestaña principal")
    public void regreso_a_la_pestaña_principal() throws InterruptedException {
        busqueda.Step_retornoPagina();
        Thread.sleep(2000);
        Assert.assertTrue(validation.Step_isTituloVisiblePrin());
    }
}
