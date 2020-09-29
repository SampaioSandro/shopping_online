@CadastrarUsuario
Feature: Criar uma conta no site advantageonlineshopping

  @CadastrarUsuarioPositivo
  Scenario Outline: Criar uma nova conta com informacoes validas
    Given que eu tenha acessado o site advantageonlineshopping atraves da "<url>"
    When eu clico no ícone da imagem do usuario
    Then o sistema apresenta um poup-up/modal com opcoes de login, sendo atraves do facebook, com usuario pre-cadastrado ou criar uma nova conta e ainda a opcao de esqueci minha senha
    Then eu clico na opcao criar nova conta
    Then o sistema me direciona para experiencia de criacao de conta com os campos relacionados aos itens(Detalhes da Conta, Detalhes Pessoais e Endereco) habilitados para que eu insira as informacoes
    Then eu seleciono o arquivo de massa "cadastrarusuario"
    Then eu insiro as informacoes <cenario>
    And clico no botao Registro
    Then o sistema valida as informacoes
    And efetua o cadastro
    And me direciona para home com o usuario ja logado
    Examples:
      | url                                     | cenario           |
      | https://www.advantageonlineshopping.com | NOVA_CONTA_VALIDA |