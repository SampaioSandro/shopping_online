package shopping_test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        format = {"pretty", "html:target/cucumber-html-report"},
        features = "classpath:features",
//        tags = {"@EfetuarLogin, @EfetuarPagamento"},
//        tags = "@CadastrarUsuario",
//        tags = "@EfetuarLogin",
//        tags = {"@EfetuarLogin, @AdicionarProduto"},
        tags = {"@AlterarEnderecoEntrega"},
//        tags = {"@EfetuarLogin, @AdicionarProduto, @AlterarEnderecoEntrega, @EfetuarPagamento"},
        glue = "classpath:steps"
//        glue = "src/main/java/steps"
//        dryRun = false
)

public class TestRunnerLogin {
}
