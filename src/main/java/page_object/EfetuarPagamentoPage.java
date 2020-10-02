package page_object;

import acessar_navegadores.AcessarNavegadores;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_utils.ObterDadosCSV;

import java.io.IOException;
import java.util.HashMap;

public class EfetuarPagamentoPage extends AcessarNavegadores {

    private static HashMap<String, Object> hash_map;

    public static void acessarCarrinho(By menuCarImg, By aguardeGenerico3) {

        WebDriverWait wait = new WebDriverWait(driver, 31);

//        WebElement menuUsuario = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='hi-user containMiniTitle ng-binding']")));
        WebElement aguarde = wait.until(ExpectedConditions.visibilityOfElementLocated(aguardeGenerico3));
        WebElement carrinho = wait.until(ExpectedConditions.visibilityOfElementLocated(menuCarImg));
        carrinho.click();

    }

    public static void clicarBotaoCheckout(By checkoutBtn) {

        WebDriverWait wait = new WebDriverWait(driver, 31);

        WebElement btnCheckOut = wait.until(ExpectedConditions.visibilityOfElementLocated(checkoutBtn));
        btnCheckOut.click();
    }

    public static void clicarBotaoProximo(By proximoBtn) {

        WebDriverWait wait = new WebDriverWait(driver, 31);

        WebElement btnProximo = wait.until(ExpectedConditions.visibilityOfElementLocated(proximoBtn));
        btnProximo.click();

    }

    public static void inserirInformacoes(By salvaProfilecheckBox, By usuarioSafeTextField, By senhaSafeTextField, String formaPgtRadio, By aguardeGenerico3) throws IOException {
        WebDriverWait wait = new WebDriverWait(driver, 31);
        hash_map = ObterDadosCSV.obterDadosCSV();

//        WebElement menuUsuario = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='hi-user containMiniTitle ng-binding']")));
        WebElement aguarde = wait.until(ExpectedConditions.visibilityOfElementLocated(aguardeGenerico3));
        WebElement checkBox = wait.until(ExpectedConditions.visibilityOfElementLocated(salvaProfilecheckBox));
        checkBox.click();

        JavascriptExecutor java = (JavascriptExecutor) driver;
        java.executeScript(formaPgtRadio);

        WebElement usuarioSafe = wait.until(ExpectedConditions.visibilityOfElementLocated(usuarioSafeTextField));
        usuarioSafe.clear();
//        usuarioSafe.sendKeys("Gervasio");
        usuarioSafe.sendKeys((CharSequence) hash_map.get("usuario"));

        WebElement senhaSafe = wait.until(ExpectedConditions.visibilityOfElementLocated(senhaSafeTextField));
        senhaSafe.clear();
//        senhaSafe.sendKeys("Gervas2020");
        senhaSafe.sendKeys((CharSequence) hash_map.get("senha"));

    }

    public static void efetuarPagamento(By pagueBtn) {

        WebDriverWait wait = new WebDriverWait(driver, 31);

        WebElement btnPague = wait.until(ExpectedConditions.visibilityOfElementLocated(pagueBtn));
        btnPague.click();

    }
}