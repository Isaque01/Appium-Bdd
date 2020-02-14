#language: pt
#enconding: utf-8

Funcionalidade: Cadastro de usuario

  Contexto: 
    Dado que estou no menu da tela home
    Quando clico no botao logar
    E clico em Criar uma nova conta

  @cadastroSucesso
  Esquema do Cenario: Cadastro com sucesso
    E passo o username "<Username>"
    E passo o email "<Email>"
    E passo a senha "<Password>"
    E passo a confirmacao da senha "<ConfirmPassword>"
    E passo o primeiro nome "<FirstNome>"
    E passo o ultimo nome "<LastNome>"
    E passo o telefone "<Phone>"
    E passo o Pais "<Country>"
    E passo o estado "<State>"
    E passo o endereco "<Address>"
    E passo a cidade "<City>"
    E passo o CEP "<Zip>"
    E clico em registrar
    Entao o meu usuario aparece conectado como "<Username>"

    Exemplos: 
      | Username | Email                     | Password   | ConfirmPassword | FirstNome | LastNome | Phone         | Country| State   | Address         | City         | Zip       |
      | ISAQUElxi  | isaque.silva@rsinet.com.br| Concreto01 | Concreto01      | Isaque    | Silva    | (11)949432415 | Brazil |  SP     | Rua Juliana, 60 | Barueri      | 06436-350 |

  @cadastroFalha
  Esquema do Cenario: Cadastro com falha
    E passo o username "<Username>"
    E passo o email "<Email>"
    E passo a senha "<Password>"
    E passo a confirmacao da senha "<ConfirmPassword>"
    E passo o primeiro nome "<FirstNome>"
    E passo o ultimo nome "<LastNome>"
    E passo o telefone "<Phone>"
    E passo o Pais "<Country>"
    E passo o estado "<State>"
    E passo o endereco "<Address>"
    E passo a cidade "<City>"
    E passo o CEP "<Zip>"
    E clico em registrar
    Entao o meu usuario aparece conectado como "<Username>"

    Exemplos: 
      | Username | Email                      | Password   | ConfirmPassword | FirstNome    | LastNome   | Phone         | Country   | State    | Address         | City         | Zip       |
      | ISAQUElxi | isaque.silva@rsinet.com.br | Concreto01 | Concreto01      | Isaque       | Silva      | (11)949432415 | Brazil    | SP       | Rua Juliana, 60 | Barueri      | 06436-350 |