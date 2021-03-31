package io.cucumber.avaliacao.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.avaliacao.Servicos.Configuracao;

public class VehiclePage extends Configuracao {

    public static WebElement dropdownMarca (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='make']/option[14]"));
    }

    public static WebElement dropdownModelo (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='model']/option[2]"));
    }

    public static WebElement campoCilindro (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='cylindercapacity']"));
    }

    public static WebElement campoMotor (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='engineperformance']"));
    }

    public static WebElement campoData (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='dateofmanufacture']"));
    }

    public static WebElement opcoesAssento (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='numberofseats']/option[2]"));
    }

    public static WebElement opcoesDirecao (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='insurance-form']/div/section[1]/div[7]/p/label[1]/span"));
    }

    public static WebElement opcoesAssent (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='numberofseatsmotorcycle']/option[3]"));
    }

    public static WebElement opcoesCombustivel (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='fuel']/option[2]"));
    }
    
    public static WebElement campoCarga (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='payload']"));
    }

    public static WebElement campoTotal (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='totalweight']"));
    }

    public static WebElement campoPreco (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='listprice']"));
    }

    public static WebElement campoPlaca (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='licenseplatenumber']"));
    }
    
    public static WebElement campoMilhagem (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='annualmileage']"));
    } 

    public static WebElement botaoNext (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='nextenterinsurantdata']"));
    }


}
