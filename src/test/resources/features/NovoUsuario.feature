#language: pt
#Version: 1.0
#Author:Teofilo

Funcionalidade: Criando novo usuário

  @NovoUsuario
  Cenario: Crinado um novo usuário no sistem
    Dado que o visitante esteja no site srBarriga
    Quando que o visitante escolha a opção Novo Usuario
    E preecher os dados de acesso
      | Nome            | Email | Senha |
      | Teofilo Messias |       |       |
    Entao sera exibido a mensagem "Usuário inserido com sucesso"
