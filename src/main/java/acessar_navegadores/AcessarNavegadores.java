package acessar_navegadores;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class  AcessarNavegadores {

    public static WebDriver driver;

    public static void abrirChrome(String url) {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

    }

    public static void fecharBrowser() {
        driver.close();
        driver.quit();
    }
}
