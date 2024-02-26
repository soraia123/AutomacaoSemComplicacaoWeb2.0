#language:pt

Funcionalidade: Login

  Contexto:
    Dado que a modal esteja sendo exibida

  Cenário: Fechar a modal ao clicar fora da mesma
    Quando for realizado um clique fora da modal
    Então a janela modal deve ser fechada

  Cenário: Fechar a modal ao clicar no ícone fechar
    Quando for realizado um clique no ícone de fechar a modal
    Então a janela modal deve ser fechada

  Cenário: Link Create New Account
    Quando for realizado um clique no Link Create New Account
    Então a página Create New Account deve ser exibida

  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login  sejam preenchidos da seguinte forma:
      | login    | <login>    |
      | password | <password> |
      | remember | <remember> |
    Quando for realizado o clique no botão sign in
    Então deve ser possivel logar no sistema

    Exemplos:
      | identificacao       | login   | password | remember |
      | campos obrigatorios | chronos | senha    | false    |
      | todos os campos     | chronos | senha    | true     |


  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login  sejam preenchidos da seguinte forma:
      | login    | <login>    |
      | password | <password> |
      | remember | <remember> |
    Quando for realizado o clique no botão sign in
    Então o sistema deve exibir uma mensagem de erro

    Exemplos:
      | identificacao    | login    | password | remember |
      | usuario invalido | invalido | senha    | false    |
      | senha invalida   | chronos  | invalida | false    |

  Esquema do Cenario: Realizar login com <identificacao>
    Quando os campos de login  sejam preenchidos da seguinte forma:
      | login    | <login>    |
      | password | <password> |
      | remember | <remember> |
    Então o botão sign in deve permanecer desabilitado

    Exemplos:
      | identificacao     | login   | password | remember |
      | usuario em branco |         | senha    | false    |
      | senha em barnco   | chronos |          | false    |

