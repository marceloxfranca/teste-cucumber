package br.com.site.getnet.steps;

import br.com.site.getnet.core.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static br.com.site.getnet.driverFactory.ConfigDriver.*;

public class HooksConfig extends BaseTest {

    @Before
    public void inicia() {
        driver = getDriver();
        driver.navigate().to("https://site.getnet.com.br/");
    }

    @After
    public void finaliza() {
        if(driver != null) {
            driver.quit();
        }
        driver = null;
    }
}
