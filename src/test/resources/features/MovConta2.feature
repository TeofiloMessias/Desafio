#language: pt
#Version: 1.0
#Author:Teofilo
@Regressivo
Funcionalidade: Criar tipo de movimentação

  Contexto: 
    Dado que o usuario esteja na pagina de login
    Quando o usuario preecher as credencias de acesso
      | email | password |
      |       |          |
    Entao o usuario estara logado

  @MovConta2Pago
  Cenario: Fazer uma movimentação de conta paga
    Quando usuario escolher a opção Criar Movimentação
    E o usuario preecher todos os dados da  Movimentacao
      | Data da Movimentacao | Data do Pagamento | Descrição                | Interessado | Valor | Conta         |
      |                      |                   | Pagamento Contan de água | Teofilo     |   200 | Conta de Água |
    Entao validar que a mensagem será "Movimentação adicionada com sucesso!"
