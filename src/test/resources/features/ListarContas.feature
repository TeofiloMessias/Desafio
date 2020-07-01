#language: pt
#Version: 1.0
#Author:Teofilo
@Regressivo
Funcionalidade: Listar todas as contas criadas

    Contexto: 
    Dado que o usuario esteja na pagina de login
    Quando o usuario preecher as credencias de acesso
      | email | password |
      |       |          |
    Entao o usuario estara logado

  @ListarTodasAsContas
  Cenario: Listar todas as contas criadas pendentes
  	Dado que o usuario escolha a opção Contas
    Quando que o usuario selecionar a opção Lista
    Entao sera exibido todas as contas cadastradas no sistema