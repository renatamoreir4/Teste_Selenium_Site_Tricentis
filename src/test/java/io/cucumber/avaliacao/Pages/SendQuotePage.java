package io.cucumber.avaliacao.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.avaliacao.Servicos.Configuracao;

public class SendQuotePage extends Configuracao {

    public static WebElement campoEmail (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='email']"));
    }
    
    public static WebElement campoTelefone (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='phone']"));
    }

    public static WebElement campoUser (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='username']"));
    }

    public static WebElement campoSenha (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='password']"));
    }

    public static WebElement campoConfirmSenha (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='confirmpassword']"));
    } 

    public static WebElement campoComentario (WebDriver browser) {
      return browser.findElement(By.xpath("#confirmpassword"));
  } 

    public static WebElement botaoSend (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='sendemail']"));
    }

    public static WebElement menssagemSucesso (WebDriver browser) {
        return browser.findElement(By.xpath("body>div.sweet-alert.showSweetAlert.visible>h2"));
    } 

    public static WebElement botaoOk (WebDriver browser) {
        return browser.findElement(By.xpath("body>div.sweet-alert.showSweetAlert.visible>div.sa-button-container>div>button"));
    }

    
}
