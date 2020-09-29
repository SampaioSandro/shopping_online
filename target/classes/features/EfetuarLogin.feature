@EfetuarLogin
Feature: Efetuar login no site advantageonlineshopping

  @EfetuarLoginPositivo
  Scenario Outline: Efetuar login em uma conta ja existente com informacoes validas
    Given que eu tenha acessado o site advantageonlineshopping atraves da "<url>"
    When eu clico no ícone da imagem do usuario
    Then o sistema apresenta um poup-up/modal com opcoes de login, sendo atraves do facebook, com usuario pre-cadastrado ou criar uma nova conta e ainda a opcao de esqueci minha senha
    Then eu seleciono o arquivo de massa "efetuarlogin"
    Then eu insiro as informacoes <cenario>
    Then o sistema valida as informacoes
    And me direciona para home com o usuario ja logado
    Examples:
      | url                                     |cenario       |
      | https://www.advantageonlineshopping.com |USUARIO_VALIDO|