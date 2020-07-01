package br.com.jumptreinamentos.pageobjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ResumoMensalPage extends BasePage {

	private By selecComboMensal = By.id("mes");
	private By selectComboAno = By.id("ano");	
	private By botaoBuscar = By.xpath("//input[@value='Buscar']");
	private By descricaoContas = By.xpath("//th[contains(.,'Descrição')]");

	public void resumoMesEAno(String mes, String ano) {
		
		WebElement element = getDriver().findElement(selecComboMensal);
		Select comboMes = new Select(element);
		comboMes.selectByVisibleText("Maio");			
				
				
		WebElement element2 = getDriver().findElement(selectComboAno);
		Select comboAno = new Select(element2);		
		comboAno.selectByVisibleText("2019");
		

		getDriver().findElement(botaoBuscar).click();
		
		
	}
	public void descContasPagas() {
		getDriver().findElement(descricaoContas).getText();
	}
}
	
