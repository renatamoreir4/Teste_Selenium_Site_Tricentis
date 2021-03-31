package io.cucumber.avaliacao.Steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.avaliacao.Pages.VehiclePage;
import io.cucumber.avaliacao.Servicos.Configuracao;
import io.cucumber.java.pt.*;

public class VehicleSteps extends Configuracao{

    @Dado("que estou no site da tricentis")
    public void que_estou_no_site_da_tricentis() {
        Configuracao.open("http://sampleapp.tricentis.com/101/app.php");
    }

    @Dado("seleciono uma marca")
    public void seleciono_uma_marca(){
        VehiclePage.dropdownMarca(browser).click();
    }

    @Dado("seleciono um modelo")
    public void seleciono_um_modelo()  {
        VehiclePage.dropdownModelo(browser).click();
    }

    @Dado("digito a capacidade do cilindro")
    public void digito_a_capacidade_do_cilindro() {
        VehiclePage.campoCilindro(browser).sendKeys("1200");
    }	

    @Dado("digito o desempenho do motor")
    public void digito_o_desempenho_do_motor() {
        VehiclePage.campoMotor(browser).sendKeys("100");
    }	

    @Dado("insiro a data")
    public void insiro_a_data() {
        VehiclePage.campoData(browser).sendKeys("01/31/2014");
    }
    
    @Dado("seleciono o numero de assento")
    public void seleciono_o_numero_de_assento() {
        VehiclePage.opcoesAssento(browser).click();
    }

    @Dado("seleciono o tipo de direcao")
    public void seleciono_o_tipo_de_direcao() {
        VehiclePage.opcoesDirecao(browser).click();
    }	

    @Dado("seleciono novamente o numero de assento")
    public void seleciono_novamente_o_numero_de_assento() {
        VehiclePage.opcoesAssent(browser).click();
    }

    @Dado("seleciono o tipo de combustivel")
    public void seleciono_o_tipo_de_combustivel() {
        VehiclePage.opcoesCombustivel(browser).click();
    }

    @Dado("digito a carga util")
    public void digito_a_carga_util() {
        VehiclePage.campoCarga(browser).sendKeys("2000");
    }
    
    @Dado("digito o peso total util")
    public void digito_o_peso_total_util() {
        VehiclePage.campoTotal(browser).sendKeys("600");
    }	
      
    @Dado("digito no campo preco de tabela")
    public void digito_no_campo_preco_de_tabela() {
        VehiclePage.campoPreco(browser).sendKeys("1500");
    }

    @Dado("digito no campo numero da placa do carro")
    public void digito_no_campo_numero_da_placa_do_carro() {
        VehiclePage.campoPlaca(browser).sendKeys("BEH3101");
    }

    @Dado("digito no campo milhagem anual")
    public void digito_no_campo_milhagem_anual() {
        VehiclePage.campoMilhagem(browser).sendKeys("1000");
    }

    @Entao("clico no next para insurant")
    public void clico_no_next_para_insurant() {
        VehiclePage.botaoNext(browser).click();
    }

}