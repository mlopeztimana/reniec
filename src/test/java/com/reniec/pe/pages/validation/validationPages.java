package com.reniec.pe.pages.validation;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class validationPages extends PageObject {
    @FindBy(xpath = "//span[@id='dialogTitleSpan']")
    protected WebElementFacade titulo;

    @FindBy(xpath = "//span[@class='contenidos_span' and text()='Peruanos en el extranjero']")
    protected WebElementFacade tituloPrin;

    public boolean isTituloVisible() {
        System.out.println("Se muestra resultado de busqueda");
        return titulo.waitUntilVisible().isDisplayed();
    }

    public boolean isTituloVisiblePrin() {
        if (tituloPrin.waitUntilVisible().isDisplayed()) {
            System.out.println("Pestaña anterior");
            return true;
        } else {
            System.out.println("No se retorno a la pestaña anterior");
            return false;
        }
    }
}

