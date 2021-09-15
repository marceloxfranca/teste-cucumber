package br.com.site.getnet.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = "src/test/resources/features/",
        monochrome = true,
        glue = "",
        plugin = {"pretty","html: relatorio-testes-cucumber/reports-cucumber.html/"}
)

public class TestPesquisaRunCucumber {

}
