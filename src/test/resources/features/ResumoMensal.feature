#language: pt
#Version: 1.0
#Author:Teofilo
@Regressivo
Funcionalidade: Realizar consulta do resumo mensal

  Contexto: 
    Dado que o usuario esteja na pagina de login
    Quando o usuario preecher as credencias de acesso
      | email | password |
      |       |          |
    Entao o usuario estara logado

  @ResumoMensal
  Cenario: Realizar consultas dos resumos do mês
    Dado que o usuario escolha a opção Resumo Mensal
    Quando o usuario selecionar o mês e ano dos seus gastos    
    Entao será apresentados a situação de todos os seus gastos
