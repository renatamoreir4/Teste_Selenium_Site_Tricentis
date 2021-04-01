package io.cucumber.avaliacao.Steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.avaliacao.Pages.InsurantPage;
import io.cucumber.avaliacao.Servicos.Configuracao;
import io.cucumber.java.pt.*;

public class InsurantSteps extends Configuracao {

    @Dado("que digito o primeiro nome")
    public void que_digito_o_primeiro_nome() {
        InsurantPage.campoNome(browser).sendKeys("usuario");
    }

    @Dado("digito o segundo nome")
    public void digito_o_segundo_nome() {
        InsurantPage.campoSobrenome(browser).sendKeys("teste");
    }

    @Dado("insiro a data de nascimento")
    public void insiro_a_data_de_nascimento() {
        InsurantPage.campoNascimento(browser).sendKeys("03/31/1999");
    }

    @Dado("seleciono um genero")
    public void seleciono_um_genero() {
        InsurantPage.opcoesGenero(browser).click();
    }

    @Dado("digito o endereco")
    public void digito_o_endereco() {
        InsurantPage.campoEnd(browser).sendKeys("Albion Road");
    }

    @Dado("seleciono um pais")
    public void seleciono_um_pais() {
        InsurantPage.opcoesPais(browser).click();
    }

    @Dado("digito um CEP")
    public void digito_um_CEP() {
        InsurantPage.campoCep(browser).sendKeys("44700687");
    }

    @Dado("digito a cidade")
    public void digito_a_cidade() {
        InsurantPage.campoCidade(browser).sendKeys("Toronto");
    }

    @Dado("seleciono uma ocupacao")
    public void seleciono_uma_ocupacao() {
        InsurantPage.opcoesOcupacao(browser).click();
    }

    @Dado("seleciono um hobbies")
    public void seleciono_um_hobbies() {
        InsurantPage.opcoesHobbies(browser).click();
    }

    @Dado("insiro o local na rede de internet")
    public void insiro_o_local_na_rede_de_internet() {
        InsurantPage.campoSite(browser).sendKeys("https://github.com/renatamoreir4/");
    }
      
    @Entao("clico em next para product")
    public void clico_em_next_para_product() {
        InsurantPage.botaoNext(browser).click();
    }

}
