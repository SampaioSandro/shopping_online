package page_object;

import acessar_navegadores.AcessarNavegadores;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_utils.ObterDadosCSV;

import java.io.IOException;
import java.util.HashMap;

public class CadastrarUsuarioPage extends AcessarNavegadores {

    private static HashMap<String, Object> hash_map;

    public static void informarDados(By usuarioNovoTextfield, By emailNovoTextfield, By senhaNovaTextfield, By senhaConfNovaTextfield,
                                     By primeiroNomeNovoTextfield, By ultimoNomeNovoTextfield, By telefoneNovoTextfield,
                                     By selectpaisCombo, By cidadeNovoTextfield, By enderecoNovoTextfield, By estadoNovoTextfield,
                                     By cepNovoTextfield, By concordocheckBox) throws IOException {

//        WebDriverWait wait = new WebDriverWait((WebDriver) driver, 33);
        WebDriverWait wait = new WebDriverWait(driver, 33);
        WebElement aguarde =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"registerPage\"]/article/sec-form/div[2]/label[2]/a")));

        hash_map = ObterDadosCSV.obterDadosCSV();

        WebElement usuario = wait.until(ExpectedConditions.visibilityOfElementLocated(usuarioNovoTextfield));
//        usuario.sendKeys("Tester_001");
        usuario.sendKeys((CharSequence) hash_map.get("usuario"));

        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(emailNovoTextfield));
//        email.sendKeys("tester_001@gmail.com");
        email.sendKeys((CharSequence) hash_map.get("email"));

        WebElement senha = wait.until(ExpectedConditions.visibilityOfElementLocated(senhaNovaTextfield));
//        senha.sendKeys("Tester001");
        senha.sendKeys((CharSequence) hash_map.get("senha"));

        WebElement senhaConf = wait.until(ExpectedConditions.visibilityOfElementLocated(senhaConfNovaTextfield));
//        senhaConf.sendKeys("Tester001");
        senhaConf.sendKeys((CharSequence) hash_map.get("senhaConf"));

        WebElement primeiroNome = wait.until(ExpectedConditions.visibilityOfElementLocated(primeiroNomeNovoTextfield));
//        primeiroNome.sendKeys("Tester Primeiro Nome");
        primeiroNome.sendKeys((CharSequence) hash_map.get("primeiroNome"));

        WebElement ultimoNome = wait.until(ExpectedConditions.visibilityOfElementLocated(ultimoNomeNovoTextfield));
//        ultimoNome.sendKeys("Tester Ultimo Nome");
        ultimoNome.sendKeys((CharSequence) hash_map.get("ultimoNome"));

        WebElement telefone = wait.until(ExpectedConditions.visibilityOfElementLocated(telefoneNovoTextfield));
//        telefone.sendKeys("11987282232");
        telefone.sendKeys((CharSequence) hash_map.get("telefone"));

        //País
        WebElement selectpais = wait.until(ExpectedConditions.visibilityOfElementLocated(selectpaisCombo));
        selectpais.click();
//        selectpais.sendKeys("Brazil");
        selectpais.sendKeys((CharSequence) hash_map.get("selectpais"));

        WebElement cidade = wait.until(ExpectedConditions.visibilityOfElementLocated(cidadeNovoTextfield));
//        cidade.sendKeys("Guarulhos");
        cidade.sendKeys((CharSequence) hash_map.get("cidade"));

        WebElement endereco = wait.until(ExpectedConditions.visibilityOfElementLocated(enderecoNovoTextfield));
//        endereco.sendKeys("Feira, 777");
        endereco.sendKeys((CharSequence) hash_map.get("endereco"));

        WebElement estado = wait.until(ExpectedConditions.visibilityOfElementLocated(estadoNovoTextfield));
//        estado.sendKeys("SP");
        estado.sendKeys((CharSequence) hash_map.get("estado"));

        WebElement cep = wait.until(ExpectedConditions.visibilityOfElementLocated(cepNovoTextfield));
//        cep.sendKeys("02415002");
        cep.sendKeys((CharSequence) hash_map.get("cep"));

        WebElement check = wait.until(ExpectedConditions.visibilityOfElementLocated(concordocheckBox));
        check.click();

    }

    public static void registrarConta(By registraBtn) {

        WebDriverWait wait = new WebDriverWait((WebDriver) driver, 33);

        WebElement btnRegistra = wait.until(ExpectedConditions.visibilityOfElementLocated(registraBtn));
        btnRegistra.click();

    }
}