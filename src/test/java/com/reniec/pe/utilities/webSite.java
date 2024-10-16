package com.reniec.pe.utilities;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

public class webSite {
    @Steps(shared = true)
    PageObject reniec;

    @Step("Navegar al sitio web")
    public void navigateTo(String url){
        reniec.setDefaultBaseUrl(url);
        reniec.open();
        maximizeWindow();

    }

    private void maximizeWindow() {
        WebDriver driver = reniec.getDriver();
        driver.manage().window().maximize();

    }

}
