package pageObjects;

import static utils.Utils.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CalculadoraPage {
  
  public CalculadoraPage (AppiumDriver<WebElement> driver) {
	  PageFactory.initElements(new AppiumFieldDecorator(driver), this);
  }
  
//  @AndroidFindBy(id = "com.android.calculator2:id/digit_6")
//  private MobileElement tecla6;
  
//  @AndroidFindBy(accessibility = "plus")
//  private MobileElement teclaMais;

  public void digitarNumero(String string) {
	  MobileElement teclaNumero = (MobileElement) driver.findElement(By.id("com.android.calculator2:id/digit_"+string));
	  teclaNumero.click();
	  //tecla6.click();
  }
  
  public void acionarOperador(String string) {
	  MobileElement operador = (MobileElement) driver.findElementByXPath("//android.widget.Button[@content-desc='"+string+"']");
	  operador.click();
	  //teclaMais.click();
  }
  
}
