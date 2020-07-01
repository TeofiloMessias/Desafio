package br.com.jumptreinamentos.pageobjects;



import org.openqa.selenium.By;

public class LoginPage extends BasePage {

	private By inputEmail = By.name("email");
	private By inputPassword = By.id("senha");
	private By botaoEntrar = By.xpath("//button[contains(text(),'Entrar')] ");
	

	public void toLogin() {
		getDriver().navigate().to("https://srbarriga.herokuapp.com");
	}

	public void realizaLogin(String email, String senha) {

		getDriver().findElement(inputEmail).sendKeys(email);
		getDriver().findElement(inputPassword).sendKeys(senha);
		getDriver().findElement(botaoEntrar).click();
	}

	

}
