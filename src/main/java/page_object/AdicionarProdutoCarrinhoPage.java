package page_object;

import element_locators.ElementLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdicionarProdutoCarrinhoPage extends ElementLocators {

    static WebDriver driver;

    public static void escolherSecao(By laptopsImg) {

        WebDriverWait wait = new WebDriverWait(driver, 31);

        WebElement imagemLaptop = wait.until(ExpectedConditions.visibilityOfElementLocated(laptopsImg));
        imagemLaptop.click();

    }

    public static void escolherProduto(By laptopEscolhidoImg) {

        WebDriverWait wait = new WebDriverWait(driver, 31);

        WebElement laptopEscolhido = wait.until(ExpectedConditions.visibilityOfElementLocated(laptopEscolhidoImg));
        laptopEscolhido.click();
    }

    public static void adicionarProduto(By adicionaBtn) {

        WebDriverWait wait = new WebDriverWait(driver, 31);

        WebElement btnAdd = wait.until(ExpectedConditions.visibilityOfElementLocated(adicionaBtn));
        btnAdd.click();

    }

}