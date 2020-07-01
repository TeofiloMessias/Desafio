package br.com.jumptreinamentos.pageobjects;




import org.openqa.selenium.By;

public class AdicionarContaPage extends BasePage{
	
	
	private By adicionarConta = By.xpath("//a[@href='/addConta']");
	private By addNomeConta = By.id("nome");	
	private By botaoSalvarConta = By.xpath("//button[contains(.,'Salvar')]");	
	
	BarraMenuPage menu = new BarraMenuPage();
	
	
	public void AdicionarConta() {
		
		getDriver().findElement(adicionarConta).click();
		getDriver().findElement(addNomeConta).sendKeys("Conta 033");
		getDriver().findElement(botaoSalvarConta).click();
		
		
		
	}
	
}
