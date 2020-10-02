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

public class AlterarEnderecoEntregaPage extends AcessarNavegadores {

    private static HashMap<String, Object> hash_map;

    public static void acessarMenu(By menuUsuarioBtn) {

        WebDriverWait wait = new WebDriverWait(driver, 33);

        WebElement menuUsuario = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='hi-user containMiniTitle ng-binding']")));

        JavascriptExecutor java = (JavascriptExecutor) driver;
        java.executeScript("document.getElementsByClassName('hi-user containMiniTitle ng-binding')[0].click();");
    }

    public static void selecionarItemMenu(By minhaconta) {

        WebDriverWait wait = new WebDriverWait(driver, 60);

        WebElement follow = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/h3[@class='roboto-regular center ng-scope']")));

        JavascriptExecutor java = (JavascriptExecutor) driver;

        java.executeScript("document.getElementsByClassName('hi-user containMiniTitle ng-binding')[0].click();");

        WebElement conta = wait.until(ExpectedConditions.visibilityOfElementLocated(minhaconta));
        conta.click();

    }

    public static void clicarLinkEditar(By editarLink) {

        WebDriverWait wait = new WebDriverWait(driver, 33);

        WebElement linkEditar = wait.until(ExpectedConditions.visibilityOfElementLocated(editarLink));
        linkEditar.click();

    }

    public static void informarDados(By cidadeAltTextfield, By enderecoAltTextfield, By cepAltTextfield) throws IOException {

        WebDriverWait wait = new WebDriverWait(driver, 33);
        hash_map = ObterDadosCSV.obterDadosCSV();

        WebElement cidade = wait.until(ExpectedConditions.visibilityOfElementLocated(cidadeAltTextfield));
//        cidade.sendKeys("Guarulhos");
        cidade.clear();
        cidade.sendKeys((CharSequence) hash_map.get("cidade"));

        WebElement endereco = wait.until(ExpectedConditions.visibilityOfElementLocated(enderecoAltTextfield));
//        endereco.sendKeys("Feira, 777");
        endereco.clear();
        endereco.sendKeys((CharSequence) hash_map.get("endereco"));

        WebElement cep = wait.until(ExpectedConditions.visibilityOfElementLocated(cepAltTextfield));
        cep.clear();
        cep.sendKeys((CharSequence) hash_map.get("cep"));

    }

    public static void atualizarDados(By salvarBtn) {

        WebDriverWait wait = new WebDriverWait(driver, 33);

        WebElement btnSalvar = wait.until(ExpectedConditions.visibilityOfElementLocated(salvarBtn));
        btnSalvar.click();

    }

}