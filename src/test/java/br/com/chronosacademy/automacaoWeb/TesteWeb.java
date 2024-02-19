package br.com.chronosacademy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.common.subtyping.qual.Bottom;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class TesteWeb {
    ChromeDriver driver;

    @Before
    public void inicializaTeste(){
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.chronosacademy.com.br");
    }
    @Test
    public void primeiroTeste(){
        String xpathTitulo = "//section[2]//h4";
        WebElement txttitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txttitulo.getText();
        assertEquals("Porque Tempo É Conhecimento.",titulo);
    }
    @After
    public void finalizaTeste(){
        driver.quit();
    }
}
