package shopping_test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        format = {"pretty", "html:target/cucumber-html-report"},
        features = "classpath:features",
//        tags = "@EfetuarPagamento",       // Esta OK
//        tags = "@CadastrarUsuario",       // Esta OK
        tags = "@EfetuarLogin",           // Esta OK
//        tags = "@AdicionarProduto",       // Esta OK
//        tags = "@AlterarEnderecoEntrega", // Esta OK
//        tags = {"@CadastrarUsuario", "@EfetuarLogin, @AlterarEnderecoEntrega, @AdicionarProduto, @EfetuarPagamento"},
        glue = "classpath:steps"
//        glue = "src/main/java/steps"
//        dryRun = false
)

public class TestRunnerLogin {
}
