package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * Created by Zava on 24/11/2018.
 */
public class LoginPage extends BasePage {
    public LoginPage(WebDriver browser) {
        super(browser);
    }

    public LoginPage typeUser(String user){
        browser.findElement(By.name("username")).sendKeys(user);
        return this;
    }

    public LoginPage typeSenha(String senha){
        browser.findElement(By.name("password")).sendKeys(senha);
        return this;
    }

    public InvoiceListPage clickEntrarButton(){
        browser.findElement(By.id("btnLogin")).click();
        return new InvoiceListPage(browser);
    }

    public InvoiceListPage logandoComUser(String user, String senha){
        typeUser(user);
        typeSenha(senha);
        clickEntrarButton();
        return new InvoiceListPage(browser);
    }

}
