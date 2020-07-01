package br.com.jumptreinamentos.pageobjects;
import java.time.LocalDate;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import br.com.jumptreinamentos.util.Date;


public class CriarMovimentacaoPage extends BasePage {

	
	private By tipoMovimentacaoREC = By.id("tipo");
	private By dataMovimentacao    = By.id("data_transacao");
	private By dataPagamento       = By.id("data_pagamento");
	private By descricao           = By.id("descricao");
	private By interessado         = By.id("interessado");
	private By valor               = By.id("valor");
	private By conta               = By.id("conta");	
	private By situacaoPago        = By.id("status_pago");
	private By botaoSalvar         = By.xpath("//button[contains(.,'Salvar')]");
	
	BarraMenuPage menu = new BarraMenuPage();
	Date data = new Date();

	public void criarMovimentacaoComSituacaoPago(Map<String, String> linha) {

		WebElement element = getDriver().findElement(tipoMovimentacaoREC);
		Select combo = new Select(element);
		combo.selectByValue("REC");
	
		getDriver().findElement(dataMovimentacao).sendKeys(new Date().getDataAtual());
		getDriver().findElement(dataPagamento).sendKeys(new Date().getDataFutura());
				
		getDriver().findElement(descricao).sendKeys(linha.get("Descrição"));
		getDriver().findElement(interessado).sendKeys(linha.get("Interessado"));
		getDriver().findElement(valor).sendKeys(linha.get("Valor"));
		getDriver().findElement(conta).sendKeys(linha.get("Conta"));
		getDriver().findElement(situacaoPago).click();
		getDriver().findElement(botaoSalvar).click();
	}



}
