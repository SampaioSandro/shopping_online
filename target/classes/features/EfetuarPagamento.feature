@EfetuarPagamento
Feature: Efetuar pagamento do(s) produto(s) no site advantageonlineshopping

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

  Scenario: Adicionar produtos ao carrinho
    When eu clico no frame/imagem do laptop
    Then o sistema me direciona para tela que contem apenas os laptops, apresentando uma relacao de laptops contendo imagem, valor, preco e ainda um filtro com as opcoes (preco, exibicao, sistema operacional, processador, peso, cor)
    Then eu clico na imagem do laptop escolhido
    Then o sistema me direciona para uma tela que contem a imagem do laptop escolhido, as especificacoes do produto, opcoes de cores, opcao de quantidade com o valor um selecionado e o botao para adicionar ao carrinho
    Then eu clico no botao adicionar ao carrinho
    Then o sistema adicona o produto ao carrinho
    And apresenta um acorddion com as seguintes informacoes (modelo e nome do produto, quantidade, cor e valor, total de itens, valor total), e um botao de checkout com o valor total

  @EfetuarPagamentoPositivo
  Scenario Outline: Efetuar pagamento do(s) produto(s)
    When passo o mouse sobre o icone do carrinho
    Then o sistema apresenta um acorddion com as seguintes informacoes (modelo e nome do produto, quantidade, cor e valor, total de itens, valor total), e um botao de checkout com o valor total
    Then eu clico no botao checkout
    Then o sistema me direciona para a tela ordem de pagamento, apresentando uma slider com Detalhes do Envio selecionado (com opcao de edicao), e Forma de Pagamento desabilitado, Resumo do pedido, e o botao proximo
    Then eu clico no botao proximo
    Then o sistema seleciona Forma de Pagamento no slider e desabilita Detalhes do Envio, com os campos relacionados ao pagamento habilitados para que eu insira as informacoes, o link Voltar para detalhes do envio e um botao Pague Agora
    Then eu seleciono o arquivo de massa "efetuarpgto"
    Then eu insiro as informacoes <cenario>
    And  clico no botao Pague Agora
    Then o sistema apresenta efetua o pagamento
    And apresenta um resumo referente ao pedido, contendo uma mensagem de agradecimento, número de rastreamento, numero do pedido, detalhes do envio, forma de pagamento, resumo do pedido, e opcoes para seguir a empresa atraves do facebook, twitter ou linkedin
    Examples:
      |cenario|
      |INFO_PGTO_VALIDAS|