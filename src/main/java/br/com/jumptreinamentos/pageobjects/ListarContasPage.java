package br.com.jumptreinamentos.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ListarContasPage extends BasePage {

	private By lista = By.xpath("//a[@href='/contas'][contains(.,'Listar')]");	
	private By exibeListaConta = By.xpath("//th[contains(.,'Conta')]");

	BarraMenuPage menu = new BarraMenuPage();
	

	public void ListarTodasAsContas() {

		getDriver().findElement(lista).click();
		
	}
	public void exibeLista() {
		getDriver().findElement(exibeListaConta);
	}
}
	
