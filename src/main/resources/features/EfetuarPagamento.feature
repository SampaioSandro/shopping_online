@EfetuarPagamento
Feature: Efetuar pagamento do(s) produto(s) no site advantageonlineshopping

  Background:

  @EfetuarPagamentoPositivo
  Scenario Outline: Efetuar pagamento do(s) produto(s)
    Given que eu tenha efetuado o login no site advantageonlineshopping	e adicionado o(s) produto(s) ao carrinho
    When passo o mouse sobre o icone do carrinho
    Then o sistema apresenta um acorddion com as seguintes informacoes (modelo e nome do produto, quantidade, cor e valor, total de itens, valor total), e um botao de checkout com o valor total
    Then eu clico no botao checkout
    Then o sistema me direciona para a tela ordem de pagamento, apresentando uma slider com Detalhes do Envio selecionado (com opcao de edicao), e Forma de Pagamento desabilitado, Resumo do pedido, e o botao proximo
    Then eu clico no botao proximo
    Then o sistema seleciona Forma de Pagamento no slider e desabilita Detalhes do Envio, com os campos relacionados ao pagamento habilitados para que eu insira as informacoes, o link Voltar para detalhes do envio e um botao Pague Agora
    Then eu seleciono o arquivo de massa "efetuarpagto"
    Then eu insiro as informacoes <cenario>
    And  clico no botao Pague Agora
    Then o sistema apresenta efetua o pagamento
    And apresenta um resumo referente ao pedido, contendo uma mensagem de agradecimento, número de rastreamento, numero do pedido, detalhes do envio, forma de pagamento, resumo do pedido, e opcoes para seguir a empresa atraves do facebook, twitter ou linkedin
    Examples:
      |cenario|
      |INFO_PGTO_VALIDAS|