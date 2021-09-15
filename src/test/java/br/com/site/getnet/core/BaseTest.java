package br.com.site.getnet.core;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static br.com.site.getnet.driverFactory.ConfigDriver.driver;
import static org.junit.Assert.fail;

public class BaseTest{

    private static final int LOAD_TIMEOUT = 30;

    public BaseTest() {
        PageFactory.initElements(driver, this);
    }

    public void preencherCampo(WebElement element, String keysToSend){
        try {
            element.clear();
            element.sendKeys(keysToSend);
        } catch (WebDriverException e) {
            fail("Nao foi possivel encontrar o elemento para preencher: "+element +". Pagina: " +driver.getTitle()+"\n "+e.getMessage());

        }
    }

    public void click(WebElement element){
        try {
            aguardarElementoVisivel(element);
            element.click();
        } catch (Exception e) {
            fail("Nao foi possivel encontrar o elemento para clicar: "+element +". Pagina: " +driver.getTitle()+"\n "+e.getMessage());
        }
    }

    public void aguardarElementoVisivel(WebElement element){
        try {
            WebDriverWait driverWait = new WebDriverWait(driver, LOAD_TIMEOUT);
            driverWait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            fail("Tempo excedido para aguardar elemento: "+element);
        }
    }

    public void moverCursorPara(WebElement elemento) {
        Actions action = new Actions(driver);
        action.moveToElement(elemento).build().perform();
    }
}
