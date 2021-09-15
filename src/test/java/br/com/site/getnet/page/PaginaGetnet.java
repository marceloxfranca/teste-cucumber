package br.com.site.getnet.page;

import br.com.site.getnet.core.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

public class PaginaGetnet extends BaseTest{

    @FindBy(id = "u-depth1__item-15214")
    private WebElement passaMousePorAjuda;

    @FindBy(linkText = "Central de ajuda")
    private WebElement selecionaCentralAjuda;

    @FindBy(id = "faq-search-input")
    private WebElement campoPesquisa;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/div/div[1]/div/div/div/div/div[2]/div/div[2]/form/div[2]/div[2]/a[1]")
    private WebElement linkModal;

    @FindBy(linkText = "Como acesso a minha conta SuperGet?")
    private WebElement resultadoModal;

    @FindBy(xpath = "//span[contains(text(),'Getnet')]")
    private WebElement validaHome;

    public void validaPaginaHome () {
        assertEquals(validaHome.getText(), "Getnet");
    }

    public void acessaMenuAjuda(){
        moverCursorPara(passaMousePorAjuda);
    }

    public void clicaCentral(){
        click(selecionaCentralAjuda);
    }

    public void digitaDuvida (String pergunta) {
        preencherCampo(campoPesquisa, pergunta);
    }

    public void selecionaDuvida() {
        click(linkModal);
    }

    public void validaModal() {
        assertEquals(resultadoModal.getText(), "Como acesso a minha conta SuperGet?");
    }
}
