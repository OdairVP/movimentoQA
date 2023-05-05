package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastroTest1 {
    @Test
    public void conectar(){
        System.setProperty("web-driver.chrome.driver", "/path/to/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.navigate().to("http://localhost:8080");

        browser.quit();
    }

    @Test
    public void preencherCamposDadosValidos(){
        System.setProperty("web-driver.chrome.driver", "/path/to/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.navigate().to("http://localhost:8080");

        String nome = "Batatinha Fritz";
        String cpf = "228.408.768-09";
        String celular = "(11) 98877 6655";
        String dtnascimento = "01/02/1963";

        browser.findElement(By.id("nome")).sendKeys(nome);
        browser.findElement(By.id("cpf")).sendKeys(cpf);
        browser.findElement(By.id("celular")).sendKeys(celular);
        browser.findElement(By.id("dt-nascimento")).sendKeys(dtnascimento);
        browser.findElement(By.id("btn-salvar")).submit();

        browser.quit();
    }

    @Test
    public void preencherCamposDadosInvalidos(){
        System.setProperty("web-driver.chrome.driver", "/path/to/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.navigate().to("http://localhost:8080");

        String nome = "Batatinha Fritz";
        String cpf = "228.408.768-09";
        String celular = "(11) 98877 6655";
        String dtnascimento = "01/02/1963";

        browser.findElement(By.id("nome")).sendKeys(nome);
        browser.findElement(By.id("cpf")).sendKeys(cpf);
        browser.findElement(By.id("celular")).sendKeys(celular);
        browser.findElement(By.id("dt-nascimento")).sendKeys(dtnascimento);

//        avalidações

        browser.findElement(By.id("btn-salvar")).submit();

        browser.quit();
    }
}
