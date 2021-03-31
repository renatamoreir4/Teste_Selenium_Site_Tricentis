package io.cucumber.avaliacao.Steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.avaliacao.Pages.ProductPage;
import io.cucumber.avaliacao.Servicos.Configuracao;
import io.cucumber.java.pt.*;

public class ProductSteps extends Configuracao{

    @Quando("seleciono uma data")
    public void seleciono_uma_data(){
        ProductPage.campoCalendario(browser).sendKeys("08/07/2022");
    }
    
    @Quando("seleciono um valor")
    public void seleciono_um_valor() {
        ProductPage.campoValor(browser).click();
    }
    
    @Quando("seleciono uma nota")
    public void seleciono_uma_nota() {
        ProductPage.campoMerito(browser).click();
    }
    
    @Quando("seleciono uma cobertura")
    public void seleciono_uma_cobertura()  {
        ProductPage.campoCorbertura(browser).click();
    }
    
    @Quando("seleciono produtos opcionais")
    public void seleciono_produtos_opcionais() {
      ProductPage.campoProdutos(browser).click();
    }
    
    @Quando("seleciono uma cortesia")
    public void seleciono_uma_cortesia() {
        ProductPage.campoCortesia(browser).click();
    }
    
    @Entao("clico em next para ver tabela de precos")
    public void clico_em_next_para_ver_tabela_de_precos()  {
        ProductPage.botaoNext(browser).click();
    }    
    
}
