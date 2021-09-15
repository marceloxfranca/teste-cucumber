#language: pt
Funcionalidade: Pesquisa duvida sobre como acessar a conta

  Contexto: Validar mensagem no Modal da Central de ajuda
  Esquema do Cenario: acessa o site
    Dado que é acessada a pagina home
    Quando acessar o menu de ajuda
    E clica no link da central de ajuda
    Entao quando aparecer o campo busca digito "<palavra-chave>"
    E clica na duvida
    Entao checa se a modal foi aberta com sucesso

    Exemplos:
    | palavra-chave                     |
    | Como acesso a minha conta SuperGet|

