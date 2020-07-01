package br.com.jumptreinamentos.steps;
import com.github.javafaker.Faker;
import br.com.jumptreinamentos.core.LeitorProperties;
import br.com.jumptreinamentos.pageobjects.BarraMenuPage;
import br.com.jumptreinamentos.pageobjects.HomePage;
import br.com.jumptreinamentos.pageobjects.LoginPage;
import br.com.jumptreinamentos.pageobjects.MensagemPage;
import br.com.jumptreinamentos.pageobjects.NovoUsuarioPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class NovoUsuarioSteps {	

	LoginPage login = new LoginPage();
	HomePage homePage = new HomePage();	
	BarraMenuPage menu = new BarraMenuPage();
	LeitorProperties dadosRestritos = new LeitorProperties();
	MensagemPage msnGeral = new MensagemPage();
	NovoUsuarioPage novoUser = new NovoUsuarioPage();
	
	Faker faker = new Faker();	
	//String nome = faker.name().firstName();
	String email = faker.internet().emailAddress();
	String senha = faker.number().digits(6).toString();
	
	
	@Dado("que o visitante esteja no site srBarriga")
	public void queOVisitanteEstejaNoSiteSrBarriga() {
	   login.toLogin();
	}

	@Quando("que o visitante escolha a opção Novo Usuario")
	public void queOVisitanteEscolhaAOpçãoNovoUsuario() {
	    menu.novoCadastroUsuario();
	}

	
	
	@Quando("preecher os dados de acesso")
	public void preecherOsDadosDeAcesso(DataTable dataTable) {
		dataTable.asMaps().forEach(linha -> {		
		
			novoUser.criarNovoUsuario(linha.get("Nome"), email,senha);
						
		});
	}
		@Entao("sera exibido a mensagem {string}")
	public void seraExibidoAMensagem(String mensagem) {
	    msnGeral.validarMensagem(mensagem);
	}



}