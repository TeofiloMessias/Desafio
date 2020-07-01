package br.com.jumptreinamentos.steps;

import br.com.jumptreinamentos.pageobjects.AdicionarContaPage;
import br.com.jumptreinamentos.pageobjects.BarraMenuPage;
import br.com.jumptreinamentos.pageobjects.BasePage;

import br.com.jumptreinamentos.pageobjects.HomePage;
import br.com.jumptreinamentos.pageobjects.ListarContasPage;
import br.com.jumptreinamentos.pageobjects.LoginPage;
import br.com.jumptreinamentos.pageobjects.MensagemPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class AdicionarContaSteps extends BasePage {
	
	LoginPage login   = new LoginPage();		
	BarraMenuPage menu = new BarraMenuPage();		
	AdicionarContaPage novaConta = new AdicionarContaPage();
	MensagemPage msnGeral = new MensagemPage();
	
	
	@Dado("que o usuario escolha a opção Contas")
	public void queOUsuarioEscolhaAOpçãoContas() {
	    menu.criarConta();
	}

	@Quando("usuario escolher a opção Adicionar")
	public void usuarioEscolherAOpçãoAdicionar() {
	   novaConta.AdicionarConta();
	}

	@Entao("a mensagem será {string}")
	public void aMensagemSerá(String mensagemcontaPago) {
		msnGeral.validarMensagem(mensagemcontaPago);
	}

	
	

}
