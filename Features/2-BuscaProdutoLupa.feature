#language: pt
#enconding: utf-8
@PesquisaLupa
Funcionalidade: Pesquisa Pela Lupa

  Contexto: 
    Dado que estou na tela home

  @PesquisaLupaSucesso
  Esquema do Cenario: Pesquisa com sucesso
    Quando pesquiso pelo modelo "<modelo>"
    E clico na lupa
    E clico no modelo "<modelo2>"
    Entao estarei na tela do modelo "<modelo>"

    Exemplos: 
      | modelo                | modelo2                           |
      | LAPTOP                | HP STREAM - 11-D020NR LAPTOP      |

  @PesquisaLupaFalha
  Esquema do Cenario: Pesquisa com falha
    Quando pesquiso pelo modelo "<modelo>"
    E clico na lupa
    Entao aparecera uma mensagem de produto nao encontrado "<modelo>"

    Exemplos: 
      | modelo       |
      | Kawasaki |
