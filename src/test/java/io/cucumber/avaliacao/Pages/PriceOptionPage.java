package io.cucumber.avaliacao.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PriceOptionPage {

    public static WebElement opcoesSelecionar (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='priceTable']/tfoot/tr/th[2]/label[4]/span"));
    }

    public static WebElement botaoNext (WebDriver browser) {
        return browser.findElement(By.xpath("//*[@id='nextsendquote']"));
    }
    
}
