package br.com.jumptreinamentos.steps;

import br.com.jumptreinamentos.pageobjects.BarraMenuPage;
import br.com.jumptreinamentos.pageobjects.HomePage;
import br.com.jumptreinamentos.pageobjects.ListarContasPage;
import br.com.jumptreinamentos.pageobjects.LoginPage;
import br.com.jumptreinamentos.pageobjects.MensagemPage;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class ListarContasSteps {
	LoginPage login = new LoginPage();
	HomePage homePage = new HomePage();
	ListarContasPage listaDeTodasAsContas = new ListarContasPage();
	MensagemPage msnGeral = new MensagemPage();
	
	BarraMenuPage menu = new BarraMenuPage();
	

	@Quando("que o usuario selecionar a opção Lista")
	public void queOUsuarioSelecionarAOpçãoLista() {
		listaDeTodasAsContas.ListarTodasAsContas();
	}

	@Entao("sera exibido todas as contas cadastradas no sistema")
	public void seraExibidoTodasAsContasCadastradasNoSistema() {
		listaDeTodasAsContas.exibeLista();
	}

}
