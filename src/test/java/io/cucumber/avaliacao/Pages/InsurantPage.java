package io.cucumber.avaliacao.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.avaliacao.Servicos.Configuracao;

public class InsurantPage extends Configuracao{
    
    public static WebElement campoNome (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='firstname']"));
    }

    public static WebElement campoSobrenome (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='lastname']"));
    }

    public static WebElement campoNascimento (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='birthdate']"));
    }

    public static WebElement opcoesGenero (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='insurance-form']/div/section[2]/div[4]/p/label[1]/span"));
    }

    public static WebElement campoEnd (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='streetaddress']"));
    }

    public static WebElement opcoesPais (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='country']/option[14]"));
    }

    public static WebElement campoCep (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='zipcode']"));
    }

    public static WebElement campoCidade (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='city']"));
    }

    public static WebElement opcoesOcupacao (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='occupation']/option[2]"));
    }

    public static WebElement opcoesHobbies (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='insurance-form']/div/section[2]/div[10]/p/label[2]/span"));
    }

    public static WebElement campoSite (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='website']"));
    } 

    public static WebElement botaoNext (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='nextenterproductdata']"));
    }
    
}
