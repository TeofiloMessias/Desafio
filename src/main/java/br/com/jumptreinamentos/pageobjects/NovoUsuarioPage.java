package br.com.jumptreinamentos.pageobjects;

import org.openqa.selenium.By;

public class NovoUsuarioPage extends BasePage {

	BarraMenuPage menu = new BarraMenuPage();

	private By novoNome = By.id("nome");
	private By novoemail = By.id("email");
	private By novosenha = By.id("senha");
	private By novoCadastrar = By.xpath("//input[@type='submit']");

	public void criarNovoUsuario(String nome, String email, String senha) {

		getDriver().findElement(novoNome).sendKeys(nome);
		getDriver().findElement(novoemail).sendKeys(email);
		getDriver().findElement(novosenha).sendKeys(senha);
		getDriver().findElement(novoCadastrar).click();
		

	}

}
