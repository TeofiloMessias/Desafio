package br.com.jumptreinamentos.steps;

import br.com.jumptreinamentos.pageobjects.BarraMenuPage;
import br.com.jumptreinamentos.pageobjects.BasePage;
import br.com.jumptreinamentos.pageobjects.ResumoMensalPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class ResumoMensalStepes extends BasePage {
	BarraMenuPage menu = new BarraMenuPage();
	ResumoMensalPage resumoMensal = new ResumoMensalPage();

	@Dado("que o usuario escolha a opção Resumo Mensal")
	public void queOUsuarioEscolhaAOpçãoResumoMensal() {
		menu.resumoMensal();
	}

	@Quando("o usuario selecionar o mês e ano dos seus gastos")
	public void oUsuarioSelecionarOMêsEAnoDosSeusGastos() {
		resumoMensal.resumoMesEAno("Junho", "2020");
	}

	@Entao("será apresentados a situação de todos os seus gastos")
	public void seráApresentadosASituaçãoDeTodosOsSeusGastos() {
		resumoMensal.descContasPagas();
	}

}
