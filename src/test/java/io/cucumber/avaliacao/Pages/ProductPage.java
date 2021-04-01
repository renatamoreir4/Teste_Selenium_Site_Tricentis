package io.cucumber.avaliacao.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.avaliacao.Servicos.Configuracao;

public class ProductPage extends Configuracao{

    public static WebElement campoCalendario (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='startdate']"));
    }

    public static WebElement campoValor (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='insurancesum']/option[4]"));
    }

    public static WebElement campoMerito (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='meritrating']/option[3]"));
    }

    public static WebElement campoCorbertura (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='damageinsurance']/option[4]"));
    } 

    public static WebElement campoProdutos (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='insurance-form']/div/section[3]/div[5]/p/label[1]/span"));
    }

    public static WebElement campoCortesia (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='courtesycar']/option[3]"));
    }

    public static WebElement botaoNext (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='nextselectpriceoption']"));
    }
    
}
