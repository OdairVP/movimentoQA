package tests;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastroTest_organizando {
    public static final String URL_8080 = "http://localhost:8080";
    private WebDriver browser;

    @BeforeAll
    public static void beforAll(){
        System.setProperty("web-driver.chrome.driver", "/path/to/chromedriver");
    }

    @BeforeEach // sempre que iniciar vai passar por aqui primeiro
    public void iniciaAqui(){
        this.browser = new ChromeDriver();
        browser.navigate().to(URL_8080);
    }

    @AfterEach
    public void finalizaAqui(){
        this.browser.quit();
    }

    @Test
    public void preencherCamposDadosValidos(){

        String nome = "Batatinha Fritz";
        String cpf = "228.408.768-09";
        String celular = "(11) 98877 6655";
        String dtnascimento = "01/02/1963";

        browser.findElement(By.id("nome")).sendKeys(nome);
        browser.findElement(By.id("cpf")).sendKeys(cpf);
        browser.findElement(By.id("celular")).sendKeys(celular);
        browser.findElement(By.id("dt-nascimento")).sendKeys(dtnascimento);
        browser.findElement(By.id("btn-salvar")).submit();

    }

    @Test
    public void preencherCamposDadosInvalidos(){
//        correto
//        String nome = "Batatinha Fritz";
//        String cpf = "228.408.768-09";
//        String celular = "(11) 98877 6655";
//        String dtnascimento = "01/02/1963";

//        Dados errados para TEST
        String nome = "123456789";
        String cpf = "abc.408.768-09";
        String celular = "(11) 98877 abcd";
        String dtnascimento = "01/02/YYYY";

        browser.findElement(By.id("nome")).sendKeys(nome); //NÃO pode ficar vazio   &&   só pode aceitar letras
        browser.findElement(By.id("cpf")).sendKeys(cpf); //NÃO pode ficar vazio   &&   só pode aceitar numeros
        browser.findElement(By.id("celular")).sendKeys(celular);//NÃO pode ficar vazio   &&   só pode aceitar numeros
        browser.findElement(By.id("dt-nascimento")).sendKeys(dtnascimento);//NÃO pode ficar vazio   &&   só pode aceitar numeros

//        Imagino que tenho que colocar as validações aqui antes do subimt()

        browser.findElement(By.id("btn-salvar")).submit();

    }
//      preciso encontrar como fazer o teste nos seguintes casos: para campos INVALIDOS
//          NAO preenchimento de algum campo;
//          usar caracter diferente de String no campo nome
//          usar caracter diferente de String no campo nome
//          NAO preencher conforme o placeholder


}
