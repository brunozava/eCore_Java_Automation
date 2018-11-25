package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver browser;

    public BasePage(WebDriver browser){
        this.browser = browser;
    }

    public String capturarTextoToastInvoiceListPage(){
        return browser.findElement(By.className("mt-5")).getText();
    }

    public String capturarTextoToastWrongNameOrPassword(){
        return browser.findElement(By.cssSelector("div [class='alert alert-danger mt-3']")).getText();
    }
//
//    public String msgUserInvalido(){
//        return navegador.findElement(By.id("ga-track-error")).getText();
//    }
//
//    public String msgSenhaInvalida(){
//        return navegador.findElement(By.id("ga-track-error")).getText();
//    }


}

