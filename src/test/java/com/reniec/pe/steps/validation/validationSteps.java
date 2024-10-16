package com.reniec.pe.steps.validation;

import com.reniec.pe.pages.validation.validationPages;
import net.serenitybdd.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class validationSteps extends ScenarioSteps {
    validationPages validation;

    @Step("Titulo visible")
    public boolean Step_isTituloVisible(){
        return validation.isTituloVisible();
    }

    @Step("Titulo principal visible")
    public boolean Step_isTituloVisiblePrin(){
        return validation.isTituloVisiblePrin();
        }
}
