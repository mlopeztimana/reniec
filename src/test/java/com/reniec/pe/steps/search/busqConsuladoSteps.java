package com.reniec.pe.steps.search;
import com.reniec.pe.pages.search.busqConsuladoPages;
import net.serenitybdd.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class busqConsuladoSteps extends ScenarioSteps {
    busqConsuladoPages busqueda;

    @Step ("Clic en Peruanos en el Extranjero")
    public void Step_clicPeruanos(){
        busqueda.clicPeruanos();
    }

    @Step ("Clic en Consulados")
    public void Step_clickConsulado(){
        busqueda.clickConsulado();
    }

    @Step("Clic en Lista")
    public void Step_clicLista(){
        busqueda.clicLista();
    }

    @Step("Ingresar busqueda")
    public void Step_ingresoBusqueda(String busquedaC){
        busqueda .ingresoBusqueda(busquedaC);
    }

    @Step("Clic Buscar")
    public void Step_clicBusqueda(){
        busqueda.clicBusqueda();
    }

    @Step("Retorno a la pagina")
    public void Step_retornoPagina(){
        busqueda.retornoPagina();
    }
}
