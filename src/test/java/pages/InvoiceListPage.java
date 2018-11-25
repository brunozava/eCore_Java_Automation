package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Zava on 24/11/2018.
 */
public class InvoiceListPage extends BasePage {
    public InvoiceListPage(WebDriver browser) {
        super(browser);
    }

    public InvoiceDetailsPage clickInvoiceDetailsButton(){
        browser.findElement(By.linkText("Invoice Details")).click();
        return new InvoiceDetailsPage(browser);
    }


}

