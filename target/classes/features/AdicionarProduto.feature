@AdicionarProduto
Feature: Adicionar produtos ao carrinho no site advantageonlineshopping

  Background:
    Given que eu tenha efetuado o login com um usuario valido no site advantageonlineshopping

  @AdicionarProdutoPositivo
  Scenario: Adicionar produtos ao carrinho
    When eu clico no frame/imagem do laptop
    Then o sistema me direciona para tela que contem apenas os laptops, apresentando uma relacao de laptops contendo imagem, valor, preco e ainda um filtro com as opcoes (preco, exibicao, sistema operacional, processador, peso, cor)
    Then eu clico na imagem do laptop escolhido
    Then o sistema me direciona para uma tela que contem a imagem do laptop escolhido, as especificacoes do produto, opcoes de cores, opcao de quantidade com o valor um selecionado e o botao para adicionar ao carrinho
    Then eu clico no botao adicionar ao carrinho
    Then o sistema adicona o produto ao carrinho
    And apresenta um acorddion com as seguintes informacoes (modelo e nome do produto, quantidade, cor e valor, total de itens, valor total), e um botao de checkout com o valor total