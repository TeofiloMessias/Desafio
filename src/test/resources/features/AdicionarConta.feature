#language: pt
#Version: 1.0
#Author:Teofilo
@Regressivo
Funcionalidade: Criar uma conta

  Contexto: 
    Dado que o usuario esteja na pagina de login
    Quando o usuario preecher as credencias de acesso
      | email | password |
      |       |          |
    Entao o usuario estara logado

  @AdicionarConta
  Cenario: Realizar uma nova conta
    Dado que o usuario escolha a opção Contas
    Quando usuario escolher a opção Adicionar
    Entao a mensagem será "Conta adicionada com sucesso!"
