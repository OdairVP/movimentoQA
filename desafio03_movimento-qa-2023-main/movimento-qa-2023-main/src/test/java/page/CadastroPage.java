package page;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastroPage {
    public static final String URL_8080 = "http://localhost:8080";
    private WebDriver browser;

    public CadastroPage() {
        System.setProperty("web-driver.chrome.driver", "/path/to/chromedriver");
        this.browser = new ChromeDriver();
        browser.navigate().to(URL_8080);
    }

    @BeforeEach // sempre que iniciar vai passar por aqui primeiro
    public void iniciaAqui(){

    }

    @AfterEach
    public void finalizaAqui(){
        this.browser.quit();
    }
}
