package com.reniec.pe.pages.search;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;

public class busqConsuladoPages extends PageObject {
    @FindBy(xpath = "//a[@href='/portal/peruanosExtranjero.htm']")
    protected WebElementFacade clicPeruanos;

    @FindBy(xpath = "//a[text()='CONSULADOS EN EL MUNDO']")
    protected WebElementFacade clicConsulado;

    @FindBy(xpath = "//a[text()='Lista de Consulados en el mundo']")
    protected WebElementFacade  clicLista;


    @FindBy(xpath = "//input[@id='txtSearch']")
    protected WebElementFacade ingresoBusqueda;

    @FindBy(xpath = "//img[@src='/Style%20Library/Images/lupa.png']")
    protected WebElementFacade clicBusqueda;


    public void clicPeruanos(){
        clicPeruanos.waitUntilVisible().click();
    }


    public void clickConsulado(){
        clicConsulado.waitUntilVisible().click();
    }


    public void clicLista(){
        clicLista.waitUntilVisible().click();
    }



    public void ingresoBusqueda(String busquedaC){
        getDriver().switchTo().window(new ArrayList<>(getDriver().getWindowHandles()).get(1)); //Interactuar con la nueva pestaña
        ingresoBusqueda.sendKeys(busquedaC);
    }

    public void clicBusqueda(){
        clicBusqueda.waitUntilVisible().click();
    }

    public void retornoPagina() {
        getDriver().switchTo().window(new ArrayList<>(getDriver().getWindowHandles()).get(0)); // Retornar a la pestaña anterior
    }
}



