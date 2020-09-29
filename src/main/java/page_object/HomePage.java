package page_object;

import acessar_navegadores.AcessarNavegadores;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_utils.ObterDadosCSV;

import java.io.IOException;
import java.util.HashMap;

public class HomePage extends AcessarNavegadores {

    private static HashMap<String, Object> hash_map;

    public static void acessarLogin(By menuUsuarioBtn) {

        WebDriverWait wait = new WebDriverWait(driver, 33);

        WebElement aguarde = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/label[@class='roboto-bold ng-scope']")));
//        aguarde.wait(5);

        WebElement menuUsuario = wait.until(ExpectedConditions.visibilityOfElementLocated((menuUsuarioBtn)));
        menuUsuario.click();

//        AcessarNavegadores.fecharBrowser();
    }

    public static void efetuarLogin(By usuarioTextfield, By senhaTextField, By lembrarCheckBox, By logarBtn) throws IOException {

        WebDriverWait wait = new WebDriverWait(driver, 31);
        hash_map = ObterDadosCSV.obterDadosCSV();

        WebElement usuario = wait.until(ExpectedConditions.visibilityOfElementLocated(usuarioTextfield));
        usuario.sendKeys((CharSequence) hash_map.get("usuario"));

        WebElement senha = wait.until(ExpectedConditions.visibilityOfElementLocated(senhaTextField));
        senha.sendKeys((CharSequence) hash_map.get("senha"));

        WebElement check = wait.until(ExpectedConditions.visibilityOfElementLocated(lembrarCheckBox));
//        check.click();

        WebElement botao = wait.until(ExpectedConditions.visibilityOfElementLocated(logarBtn));
        botao.click();

//        driver.navigate().refresh();

    }

    public static void criarConta(By novaContaBtn) {

        WebDriverWait wait = new WebDriverWait(driver, 21);
        WebElement aguarde = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/label[@class='roboto-bold ng-scope']")));

        WebElement linkCriar = wait.until(ExpectedConditions.visibilityOfElementLocated(novaContaBtn));
        linkCriar.click();

    }
}