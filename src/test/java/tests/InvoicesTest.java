package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.InvoiceDetailsPage;
import pages.InvoiceListPage;
import pages.LoginPage;
import suporte.Web;

/**
 * Created by Zava on 24/11/2018.
 */
public class InvoicesTest {
    private WebDriver browser;

    //LoginPage LPage = new LoginPage(browser);
    InvoiceListPage InvoiceLPage = new InvoiceListPage(browser);
    InvoiceDetailsPage IDPage = new InvoiceDetailsPage(browser);

    @Before
    public void setUp() {
        browser = Web.createChrome();
    }

    @Test
    public void testValidateInvoiceInformations() throws InterruptedException {
        InvoiceListPage textoToast = new LoginPage(browser)
                .logandoComUser("demouser", "abc123");
        InvoiceDetailsPage textoToast2 = new InvoiceListPage(browser)
                .clickInvoiceDetailsButton();
        browser.switchTo();
        Thread.sleep(6000);
        InvoiceDetailsPage textoToast3 = new InvoiceDetailsPage(browser);
        Thread.sleep(6000);
                String capturarHotelName = textoToast3.capturarHotelName();
                String capturarInvoiceDate = textoToast3.capturarInvoiceDate();
                String capturarDueDate = textoToast3.capturarDueDate();
                String capturarInvoiceNumber = textoToast3.capturarInvoiceNumber();
                String capturarBookingCode = textoToast3.capturarBookingCode();
                String capturarCustomerDetails = textoToast3.capturarCustomerDetails();
                String capturarRoom       = textoToast3.capturarRoom();
                String capturarCheckin  = textoToast3.capturarCheckin();
                String capturarCheckout = textoToast3.capturarCheckout();
                String capturarTotalStayCount = textoToast3.capturarTotalStayCount();
                String capturarTotalStayAmount = textoToast3.capturarTotalStayAmount();
                String capturarDepositNow = textoToast3.capturarDepositNow();
                String capturartaxEVat = textoToast3.capturartaxEVat();
                String capturarTotalAmount = textoToast3.capturarTotalAmount();


        Assert.assertEquals("Rendezvous Hotel", capturarHotelName);
        Assert.assertEquals("14/01/2018", capturarInvoiceDate);
        Assert.assertEquals("15/01/2018", capturarDueDate);
        Assert.assertEquals("#110", capturarInvoiceNumber);
        Assert.assertEquals("0875", capturarBookingCode);
        Assert.assertEquals("JOHNY SMITH\n" +
                "R2, AVENUE DU MAROC\n" +
                "123456", capturarCustomerDetails);
        Assert.assertEquals("Superior Double", capturarRoom);
        Assert.assertEquals("14/01/2018", capturarCheckin);
        Assert.assertEquals("15/01/2018", capturarCheckout);
        Assert.assertEquals("1", capturarTotalStayCount);
        Assert.assertEquals("$150", capturarTotalStayAmount);
        Assert.assertEquals("USD $20.90", capturarDepositNow);
        Assert.assertEquals("USD $19", capturartaxEVat);
        Assert.assertEquals("USD $209", capturarTotalAmount);

    }

    @After
    public void tearDown(){
        browser.quit();
    }
}
