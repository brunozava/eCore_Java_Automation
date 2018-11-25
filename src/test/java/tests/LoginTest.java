package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import suporte.Web;

/**
 * Created by Zava on 24/11/2018.
 */
public class LoginTest {
    private WebDriver browser;


    @Before
    public void setUp() {
        browser = Web.createChrome();
    }


    @Test
    public void testLoginSuccess(){
        String textoToast = new LoginPage(browser)
                .logandoComUser("demouser", "abc123")
                .capturarTextoToastInvoiceListPage();
        Assert.assertEquals("Invoice List", textoToast);
    }

    @Test
    public void testLoginFail1(){
        String textoToast = new LoginPage(browser)
                .logandoComUser("Demouser", "abc123")
                .capturarTextoToastWrongNameOrPassword();
        Assert.assertEquals("Wrong username or password.", textoToast);
    }

    @Test
    public void testLoginFail2(){
        String textoToast = new LoginPage(browser)
                .logandoComUser("demouser_", "xyz")
                .capturarTextoToastWrongNameOrPassword();
        Assert.assertEquals("Wrong username or password.", textoToast);
    }

    @Test
    public void testLoginFail3(){
        String textoToast = new LoginPage(browser)
                .logandoComUser("demouser", "nananana")
                .capturarTextoToastWrongNameOrPassword();
        Assert.assertEquals("Wrong username or password.", textoToast);
    }

    @Test
    public void testLoginFail4(){
        String textoToast = new LoginPage(browser)
                .logandoComUser("Demouser", "abc123")
                .capturarTextoToastWrongNameOrPassword();
        Assert.assertEquals("Wrong username or password.", textoToast);
    }

    @After
      public void tearDown(){
        browser.quit();
    }

}
