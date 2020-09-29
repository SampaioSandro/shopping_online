@AlterarEnderecoEntrega

Feature: Alterar endereco de entrega no site advantageonlineshopping

  Background:
  Scenario Outline: Efetuar login em uma conta ja existente com informacoes validas
    Given que eu tenha acessado o site advantageonlineshopping atraves da "<url>"
    When eu clico no ícone da imagem do usuario
    Then o sistema apresenta um poup-up/modal com opcoes de login, sendo atraves do facebook, com usuario pre-cadastrado ou criar uma nova conta e ainda a opcao de esqueci minha senha
    Then eu seleciono o arquivo de massa "efetuarlogin"
    Then eu insiro as informacoes <cenario>
    Then o sistema valida as informacoes
    And me direciona para home com o usuario ja logado
    Scenarios:
      | url                                     |cenario       |
      | https://www.advantageonlineshopping.com |USUARIO_VALIDO|

  @AlterarEnderecoEntregaPositivo
  Scenario Outline: Alterar endereco de entrega
    When eu clico no icone da imagem do usuario que ja esta com o meu login informado
    Then o sistema apresenta uma lista/accordin com tres opcoes, minha conta, minhas ordens, e sair
    Then eu clico na opcao minha conta
    Then o sistema me direciona para experiencia minha conta, onde posso alterar Detalhes da conta, Detalhes de envio, método de pagamento preferido, Notifique-me sobre promoções ou ainda deletar a minha conta
    Then eu clico em editar detalhes da conta
    Then o sistema habilita os campos relacionados a detalhes de conexao, senha, detalhes pessoais e endereco para que eu possa alterar
    Then eu seleciono o arquivo de massa "alterarendereco"
    Then eu insiro as informacoes <cenario>
    And  clico no botao Salve
    Then o sistema valida as informacoes
    And efetua a alteracao
    And apresenta a mensagem "Conta Atualizada com Sucesso"

    Examples:
      |cenario  |
      |ENDERECO |
