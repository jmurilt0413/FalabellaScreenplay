package co.com.banco.certificacion.fallabela.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/compras/compra_celular.feature",
    glue = "co.com.banco.certificacion.fallabela.stepdefinitions")
public class CompraCelularRunner {}
