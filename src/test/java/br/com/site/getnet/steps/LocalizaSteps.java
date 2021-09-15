package br.com.site.getnet.steps;

import br.com.site.getnet.core.BaseTest;
import br.com.site.getnet.page.PaginaGetnet;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LocalizaSteps extends BaseTest {

    PaginaGetnet paginaGetnet = new PaginaGetnet();

    @Dado("que é acessada a pagina home")
    public void que_e_acessada_a_pagina_home() {
        paginaGetnet.validaPaginaHome();
    }
    @Quando("acessar o menu de ajuda")
    public void acessar_o_menu_de_ajuda() {
        paginaGetnet.acessaMenuAjuda();
    }
    @Quando("clica no link da central de ajuda")
    public void clica_no_link_da_central_de_ajuda(){
        paginaGetnet.clicaCentral();
    }
    @Entao("quando aparecer o campo busca digito {string}")
    public void quando_aparecer_o_campo_busca_digito(String palavraChave) {
        paginaGetnet.digitaDuvida(palavraChave);
    }
    @Entao("clica na duvida")
    public void clica_na_duvida() {
        paginaGetnet.selecionaDuvida();
    }
    @Entao("checa se a modal foi aberta com sucesso")
    public void checa_se_a_modal_foi_aberta_com_sucesso(){
        paginaGetnet.validaModal();
    }
}
