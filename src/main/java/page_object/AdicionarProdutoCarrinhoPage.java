package page_object;

import acessar_navegadores.AcessarNavegadores;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdicionarProdutoCarrinhoPage extends AcessarNavegadores {

//    static WebDriver driver;   Por que da null pointer se eu colocar essa variável ???????????

    public static void escolherSecao(By laptopsImg, By aguardeGenerico3) {

        WebDriverWait wait = new WebDriverWait(driver, 31);

//        WebElement menuUsuario = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='hi-user containMiniTitle ng-binding']")));
        WebElement aguarde = wait.until(ExpectedConditions.visibilityOfElementLocated(aguardeGenerico3));

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