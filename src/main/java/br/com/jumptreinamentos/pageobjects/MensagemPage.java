package br.com.jumptreinamentos.pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;

public class MensagemPage extends BasePage {
	private By msnGeneric = By.xpath("//div[contains(@class, 'alert')]");
	

	public void validarMensagem(String mensagem) {

		String contaPago = getDriver().findElement(msnGeneric).getText();
		
		Assert.assertEquals(mensagem, contaPago);

	
	}
}
