#language: pt
#Version: 1.0
#Author:Teofilo
@Regressivo
Funcionalidade: Login

  @loginSucesso
  Cenario: Fazer login com credenciais validas
    Dado que o usuario esteja na pagina de login
    Quando o usuario preecher as credencias de acesso
      | email | password |
      |       |          |
    Entao sera exibido a mensagem "Usuário inserido com sucesso"
