package br.com.jumptreinamentos.pageobjects;

import org.openqa.selenium.By;

public class BarraMenuPage extends BasePage {
	private By criarMovimentacao = By.xpath("//a[@href='/movimentacao']");
	private By Conta = By.xpath("//a[@href='/'][contains(.,'Contas')]");
	private By cadastroUsuario = By.xpath("//a[@href='/cadastro']");
	//private By resumoMensal = By.xpath("//a[href='/extrato']");
	private By resumoMensal = By.xpath("//a[@href='/extrato'][contains(.,'Resumo Mensal')]");
	
	

	public void acessarMovimentacao() {
		getDriver().findElement(criarMovimentacao).click();

	}

	public void criarConta() {
		getDriver().findElement(Conta).click();
		

	}
	public void novoCadastroUsuario() {
		getDriver().findElement(cadastroUsuario).click();
	}
	public void resumoMensal() {
		getDriver().findElement(resumoMensal).click();
	}
}
