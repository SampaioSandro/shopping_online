package shopping_test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        format = {"pretty", "html:target/cucumber-html-report"},
        features = "classpath:features",
//        tags = "@Especifico",
        tags = "@AdicionarProduto",
        glue = "classpath:steps"
//        glue = "src/main/java/steps"
//        dryRun = false
)

public class TestRunnerAdicionar {
}
