package io.cucumber.avaliacao.Steps;

import static org.junit.Assert.assertEquals;

import io.cucumber.avaliacao.Pages.SendQuotePage;
import io.cucumber.avaliacao.Servicos.Configuracao;
import io.cucumber.java.pt.*;

public class SendQuoteSteps extends Configuracao {

  @Dado("preencho o email")
  public void preencho_o_email() {
      SendQuotePage.campoEmail(browser).sendKeys("usuario@tester.com.br");
  }
    
  @Dado("digito um telefone")
  public void digito_um_telefone() {
      SendQuotePage.campoTelefone(browser).sendKeys("81987757291");
  }
  
  @Dado("escolho um nome de usuario")
  public void escolho_um_nome_de_usuario() {
      SendQuotePage.campoUser(browser).sendKeys("UsuarioTeste");
  }
  
  @Dado("escolho uma senha")
  public void escolho_uma_senha()  {
      SendQuotePage.campoSenha(browser).sendKeys("Ilove3u");
  }
  
  @Dado("confirmo a senha")
  public void confirmo_a_senha()  {
      SendQuotePage.campoConfirmSenha(browser).sendKeys("Ilove3u");
  }
  
  @Dado("comento")
  public void comento() {
      SendQuotePage.campoComentario(browser).sendKeys("Ok");
  }  

  @Quando("clico em Send")
  public void clico_em_Send() {
      SendQuotePage.botaoSend(browser).click();
  }
  
  @Entao("Verifico a mensagem {string}")
  public void verifico_a_mensagem(String string) throws InterruptedException {
    Thread.sleep(12000);
    assertEquals(string, SendQuotePage.menssagemSucesso(browser).getText());
  }    

  @Entao("clico no botao Ok")
  public void clico_no_botao_Ok() {
      SendQuotePage.botaoOk(browser).click();
      browser.close();
  }

  
}
