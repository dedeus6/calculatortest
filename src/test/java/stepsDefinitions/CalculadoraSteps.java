package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CalculadoraPage;

public class CalculadoraSteps {
	
	CalculadoraPage calculadora = new CalculadoraPage(driver);

	@Quando("eu digitar o numero {string}")
	public void euDigitarONumero(String string) {
	    calculadora.digitarNumero(string);
	}

	@Quando("eu acionar a tecla {string}")
	public void euAcionarATeclaMais(String string) {
	    calculadora.acionarOperador(string);
	}

	@Entao("a calculadora apresenta o resultado {string}")
	public void aCalculadoraApresentaOResultado(String string) {
	    assertEquals(string, driver.findElement(By.id("com.android.calculator2:id/result")).getText());
	}
	
}
