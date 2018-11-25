package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Zava on 24/11/2018.
 */
public class InvoiceDetailsPage extends BasePage {
    public InvoiceDetailsPage(WebDriver browser) {
        super(browser);
    }

    public String capturarHotelName(){
        return browser.findElement(By.xpath("//h4[@class='mt-5']")).getText();

    }
    public String capturarInvoiceDate(){
        return browser.findElement(By.xpath("//section[@class='content']//ul//li[1]")).getText();
    }

    public String capturarDueDate(){
        return browser.findElement(By.xpath("//ul//li[2]")).getText();
    }

    public String capturarInvoiceNumber(){
        return browser.findElement(By.xpath("//h6[@class='mt-2']")).getText();
    }
    public String capturarBookingCode(){
        return browser.findElement(By.xpath("//td[contains(text(),'0875')]")).getText();
    }

    public String capturarCustomerDetails(){
        return browser.findElement(By.xpath("//div[@class='container']//div")).getText();
    }

    public String capturarRoom(){
        return browser.findElement(By.xpath("//td[contains(text(),'Superior Double')]")).getText();
    }

    public String capturarCheckin(){
        return browser.findElement(By.xpath("//td[contains(text(),'14/01/2018')]")).getText();
    }

    public String capturarCheckout(){
        return browser.findElement(By.xpath("//td[contains(text(),'15/01/2018')]")).getText();
    }

    public String capturarTotalStayCount(){
        return browser.findElement(By.xpath("//tbody//tr[3]//td[2]")).getText();
    }

    public String capturarTotalStayAmount(){
        return browser.findElement(By.xpath("//td[contains(text(),'$150')]")).getText();
    }

    public String capturarDepositNow(){
        return browser.findElement(By.xpath("//td[contains(text(),'USD $20.90')]")).getText();
    }

    public String capturartaxEVat(){
        return browser.findElement(By.xpath("//td[contains(text(),'USD $19')]")).getText();
    }

    public String capturarTotalAmount(){
        return browser.findElement(By.xpath("//td[contains(text(),'USD $209')]")).getText();
    }

}

