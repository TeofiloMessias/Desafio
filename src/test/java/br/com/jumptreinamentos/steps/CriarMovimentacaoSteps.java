package br.com.jumptreinamentos.steps;

import br.com.jumptreinamentos.pageobjects.BarraMenuPage;
import br.com.jumptreinamentos.pageobjects.CriarMovimentacaoPage;
import br.com.jumptreinamentos.pageobjects.HomePage;
import br.com.jumptreinamentos.pageobjects.LoginPage;
import br.com.jumptreinamentos.pageobjects.MensagemPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class CriarMovimentacaoSteps {
	
	LoginPage login = new LoginPage();
	HomePage homePage = new HomePage();
	CriarMovimentacaoPage movimentacao = new CriarMovimentacaoPage();
	BarraMenuPage menu = new BarraMenuPage();
	MensagemPage msnGeral = new MensagemPage();
		
	
	@Quando("usuario escolher a opção Criar Movimentação")
	public void usuarioEscolherAOpçãoCriarMovimentação() {
	   menu.acessarMovimentacao();
	}

	@Quando("o usuario preecher todos os dados da  Movimentacao")
	public void oUsuarioPreecherTodosOsDadosDaMovimentacao(DataTable dataTable) {
		dataTable.asMaps().forEach(linha -> {
			movimentacao.criarMovimentacaoComSituacaoPago(linha);
			
		});
	}

	@Entao("validar que a mensagem será {string}")
	public void validarQueAMensagemSerá(String msnMovConta) {
	   msnGeral.validarMensagem(msnMovConta);
	}

}
