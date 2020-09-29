package steps;

import acessar_navegadores.AcessarNavegadores;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import element_locators.ElementLocators;
import page_object.*;

public class StepDefinitions {

    public static String massaCsv = null;

    //CriarConta

    @Then("^eu clico na opcao criar nova conta$")
    public void eu_clico_na_opcao_criar_nova_conta() throws Throwable {
        HomePage.criarConta(ElementLocators.novaContaBtn);
    }

    @Then("^o sistema me direciona para experiencia de criacao de conta com os campos relacionados aos itens\\(Detalhes da Conta, Detalhes Pessoais e Endereco\\) habilitados para que eu insira as informacoes$")
    public void o_sistema_me_direciona_para_experiencia_de_criacao_de_conta_com_os_campos_relacionados_aos_itens_Detalhes_da_Conta_Detalhes_Pessoais_e_Endereco_habilitados_para_que_eu_insira_as_informacoes() throws Throwable {
    }

    @Then("^eu insiro as informacoes NOVA_CONTA_VALIDA$")
    public void eu_insiro_as_informacoes_NOVA_CONTA_VALIDA() throws Throwable {
        CadastrarUsuarioPage.informarDados(ElementLocators.usuarioNovoTextfield, ElementLocators.emailNovoTextfield, ElementLocators.senhaNovaTextfield,
                ElementLocators.senhaConfNovaTextfield, ElementLocators.primeiroNomeNovoTextfield, ElementLocators.ultimoNomeNovoTextfield,
                ElementLocators.telefoneNovoTextfield, ElementLocators.selectpaisCombo, ElementLocators.cidadeNovoTextfield,
                ElementLocators.enderecoNovoTextfield, ElementLocators.estadoNovoTextfield, ElementLocators.cepNovoTextfield,
                ElementLocators.concordocheckBox);
    }

    @Then("^clico no botao Registro$")
    public void clico_no_botao_Registro() throws Throwable {
        CadastrarUsuarioPage.registrarConta(ElementLocators.registraBtn);
    }

    @Then("^efetua o cadastro$")
    public void efetua_o_cadastro() throws Throwable {
    }

    //EfetuarLogin
    @Given("^que eu tenha acessado o site advantageonlineshopping atraves da \"([^\"]*)\"$")
    public void que_eu_tenha_acessado_o_site_advantageonlineshopping_atraves_da_url(String url) throws Throwable {
        AcessarNavegadores.abrirChrome(url);
    }

    @When("^eu clico no ícone da imagem do usuario$")
    public void eu_clico_no_ícone_da_imagem_do_usuario() throws Throwable {  // O Cadastro do usuário utiliza o mesmo
        System.out.println("Só para ver se passa aqui ===>> 001");
        HomePage.acessarLogin(ElementLocators.menuUsuarioBtn);
    }

    @Then("^eu seleciono o arquivo de massa \"([^\"]*)\"$")
    public void eu_seleciono_o_arquivo_de_massa(String massa) throws Throwable {
        massaCsv = massa;
    }

    @Then("^o sistema apresenta um poup-up/modal com opcoes de login, sendo atraves do facebook, com usuario pre-cadastrado ou criar uma nova conta e ainda a opcao de esqueci minha senha$")
    public void o_sistema_apresenta_um_poup_up_modal_com_opcoes_de_login_sendo_atraves_do_facebook_com_usuario_pre_cadastrado_ou_criar_uma_nova_conta_e_ainda_a_opcao_de_esqueci_minha_senha() throws Throwable {
    }

    @Then("^eu insiro as informacoes USUARIO_VALIDO$")
    public void eu_insiro_as_informacoes_cenario() throws Throwable {
        HomePage.efetuarLogin(ElementLocators.usuarioTextfield, ElementLocators.senhaTextField, ElementLocators.lembrarCheckBox, ElementLocators.logarBtn);
    }

    @Then("^o sistema valida as informacoes$") // O Cadastro do usuário & Alterar Endereço utilizam o mesmo
    public void o_sistema_valida_as_informacoes() throws Throwable {
    }

    @Then("^me direciona para home com o usuario ja logado$") // O Cadastro do usuário utiliza o mesmo
    public void me_direciona_para_home_com_o_usuario_ja_logado() throws Throwable {
    }

    //AdicionarProduto

    @Given("^que eu tenha efetuado o login com um usuario valido no site advantageonlineshopping$")
    public void que_eu_tenha_efetuado_o_login_com_um_usuario_valido_no_site_advantageonlineshopping() throws Throwable {

    }

    @When("^eu clico no frame/imagem do laptop$")
    public void eu_clico_no_frame_imagem_do_laptop() throws Throwable {
        System.out.println("Só para ver se passa aqui ===>> 002");
        AdicionarProdutoCarrinhoPage.escolherSecao(ElementLocators.laptopsImg);
    }

    @Then("^o sistema me direciona para tela que contem apenas os laptops, apresentando uma relacao de laptops contendo imagem, valor, preco e ainda um filtro com as opcoes \\(preco, exibicao, sistema operacional, processador, peso, cor\\)$")
    public void o_sistema_me_direciona_para_tela_que_contem_apenas_os_laptops_apresentando_uma_relacao_de_laptops_contendo_imagem_valor_preco_e_ainda_um_filtro_com_as_opcoes_preco_exibicao_sistema_operacional_processador_peso_cor() throws Throwable {
    }

    @Then("^eu clico na imagem do laptop escolhido$")
    public void eu_clico_na_imagem_do_laptop_escolhido() throws Throwable {
        AdicionarProdutoCarrinhoPage.escolherProduto(ElementLocators.laptopEscolhidoImg);
    }

    @Then("^o sistema me direciona para uma tela que contem a imagem do laptop escolhido, as especificacoes do produto, opcoes de cores, opcao de quantidade com o valor um selecionado e o botao para adicionar ao carrinho$")
    public void o_sistema_me_direciona_para_uma_tela_que_contem_a_imagem_do_laptop_escolhido_as_especificacoes_do_produto_opcoes_de_cores_opcao_de_quantidade_com_o_valor_um_selecionado_e_o_botao_para_adicionar_ao_carrinho() throws Throwable {
    }

    @Then("^eu clico no botao adicionar ao carrinho$")
    public void eu_clico_no_botao_adicionar_ao_carrinho() throws Throwable {
        AdicionarProdutoCarrinhoPage.adicionarProduto(ElementLocators.adicionaBtn);
    }

    @Then("^o sistema adicona o produto ao carrinho$")
    public void o_sistema_adicona_o_produto_ao_carrinho() throws Throwable {
    }

    @Then("^apresenta um acorddion com as seguintes informacoes \\(modelo e nome do produto, quantidade, cor e valor, total de itens, valor total\\), e um botao de checkout com o valor total$")
    public void apresenta_um_acorddion_com_as_seguintes_informacoes_modelo_e_nome_do_produto_quantidade_cor_e_valor_total_de_itens_valor_total_e_um_botao_de_checkout_com_o_valor_total() throws Throwable {
    }

    //EfetuarPagamento

    @Given("^que eu tenha efetuado o login no site advantageonlineshopping	e adicionado o\\(s\\) produto\\(s\\) ao carrinho$")
    public void que_eu_tenha_efetuado_o_login_no_site_advantageonlineshopping_e_adicionado_o_s_produto_s_ao_carrinho() throws Throwable {
    }

    @When("^passo o mouse sobre o icone do carrinho$")
    public void passo_o_mouse_sobre_o_icone_do_carrinho() throws Throwable {
        EfetuarPagamentoPage.acessarCarrinho(ElementLocators.menuCarImg);
    }

    @Then("^o sistema apresenta um acorddion com as seguintes informacoes \\(modelo e nome do produto, quantidade, cor e valor, total de itens, valor total\\), e um botao de checkout com o valor total$")
    public void o_sistema_apresenta_um_acorddion_com_as_seguintes_informacoes_modelo_e_nome_do_produto_quantidade_cor_e_valor_total_de_itens_valor_total_e_um_botao_de_checkout_com_o_valor_total() throws Throwable {
    }

    @Then("^eu clico no botao checkout$")
    public void eu_clico_no_botao_checkout() throws Throwable {
        EfetuarPagamentoPage.clicarBotaoCheckout(ElementLocators.checkoutBtn);
    }

    @Then("^o sistema me direciona para a tela ordem de pagamento, apresentando uma slider com Detalhes do Envio selecionado \\(com opcao de edicao\\), e Forma de Pagamento desabilitado, Resumo do pedido, e o botao proximo$")
    public void o_sistema_me_direciona_para_a_tela_ordem_de_pagamento_apresentando_uma_slider_com_Detalhes_do_Envio_selecionado_com_opcao_de_edicao_e_Forma_de_Pagamento_desabilitado_Resumo_do_pedido_e_o_botao_proximo() throws Throwable {
    }

    @Then("^eu clico no botao proximo$")
    public void eu_clico_no_botao_proximo() throws Throwable {
        EfetuarPagamentoPage.clicarBotaoProximo(ElementLocators.proximoBtn);
    }

    @Then("^o sistema seleciona Forma de Pagamento no slider e desabilita Detalhes do Envio, com os campos relacionados ao pagamento habilitados para que eu insira as informacoes, o link Voltar para detalhes do envio e um botao Pague Agora$")
    public void o_sistema_seleciona_Forma_de_Pagamento_no_slider_e_desabilita_Detalhes_do_Envio_com_os_campos_relacionados_ao_pagamento_habilitados_para_que_eu_insira_as_informacoes_o_link_Voltar_para_detalhes_do_envio_e_um_botao_Pague_Agora() throws Throwable {
    }

    @Then("^eu insiro as informacoes INFO_PGTO_VALIDAS$")
    public void eu_insiro_as_informacoes_INFO_PGTO_VALIDAS() throws Throwable {
        EfetuarPagamentoPage.inserirInformacoes(ElementLocators.salvaProfilecheckBox, ElementLocators.usuarioSafeTextField, ElementLocators.senhaSafeTextField, ElementLocators.formaPgtRadio);
    }

    @Then("^clico no botao Pague Agora$")
    public void clico_no_botao_Pague_Agora() throws Throwable {
        EfetuarPagamentoPage.efetuarPagamento(ElementLocators.pagueBtn);
    }

    //    retirar o texto "apresenta"
    @Then("^o sistema apresenta efetua o pagamento$")
    public void o_sistema_apresenta_efetua_o_pagamento() throws Throwable {
    }

    @Then("^apresenta um resumo referente ao pedido, contendo uma mensagem de agradecimento, número de rastreamento, numero do pedido, detalhes do envio, forma de pagamento, resumo do pedido, e opcoes para seguir a empresa atraves do facebook, twitter ou linkedin$")
    public void apresenta_um_resumo_referente_ao_pedido_contendo_uma_mensagem_de_agradecimento_número_de_rastreamento_numero_do_pedido_detalhes_do_envio_forma_de_pagamento_resumo_do_pedido_e_opcoes_para_seguir_a_empresa_atraves_do_facebook_twitter_ou_linkedin() throws Throwable {
    }

    //AlterarEnderecoEntrega

    @Given("^que eu tenha efetuado o login no site advantageonlineshopping$")
    public void que_eu_tenha_efetuado_o_login_no_site_advantageonlineshopping() throws Throwable {
    }

    @When("^eu clico no icone da imagem do usuario que ja esta com o meu login informado$")
    public void eu_clico_no_icone_da_imagem_do_usuario_que_ja_esta_com_o_meu_login_informado() throws Throwable {
        System.out.println("Só para ver se passa aqui ===>> 003");
        HomePage.acessarLogin(ElementLocators.menuUsuarioBtn);
//        AlterarEnderecoEntregaPage.acessarMenu(ElementLocators.menuUsuarioBtn);
    }

    @Then("^o sistema apresenta uma lista/accordin com tres opcoes, minha conta, minhas ordens, e sair$")
    public void o_sistema_apresenta_uma_lista_accordin_com_tres_opcoes_minha_conta_minhas_ordens_e_sair() throws Throwable {
    }

    @Then("^eu clico na opcao minha conta$")
    public void eu_clico_na_opcao_minha_conta() throws Throwable {
        AlterarEnderecoEntregaPage.selecionarItemMenu(ElementLocators.minhaconta);
    }

    @Then("^o sistema me direciona para experiencia minha conta, onde posso alterar Detalhes da conta, Detalhes de envio, método de pagamento preferido, Notifique-me sobre promoções ou ainda deletar a minha conta$")
    public void o_sistema_me_direciona_para_experiencia_minha_conta_onde_posso_alterar_Detalhes_da_conta_Detalhes_de_envio_método_de_pagamento_preferido_Notifique_me_sobre_promoções_ou_ainda_deletar_a_minha_conta() throws Throwable {
    }

    @Then("^eu clico em editar detalhes da conta$")
    public void eu_clico_em_editar_detalhes_da_conta() throws Throwable {
        AlterarEnderecoEntregaPage.clicarLinkEditar(ElementLocators.editarLink);
    }

    @Then("^o sistema habilita os campos relacionados a detalhes de conexao, senha, detalhes pessoais e endereco para que eu possa alterar$")
    public void o_sistema_habilita_os_campos_relacionados_a_detalhes_de_conexao_senha_detalhes_pessoais_e_endereco_para_que_eu_possa_alterar() throws Throwable {
        System.out.println("Só para ver se passa aqui ===>> 004");
    }

    @Then("^eu insiro as informacoes ENDERECO$")
    public void eu_insiro_as_informacoes_ENDERECO() throws Throwable {
        System.out.println("Só para ver se passa aqui ===>> 005");
        AlterarEnderecoEntregaPage.informarDados(ElementLocators.cidadeNovoTextfield, ElementLocators.enderecoNovoTextfield, ElementLocators.cepNovoTextfield);
    }

    @Then("^clico no botao Salve$")
    public void clico_no_botao_Salve() throws Throwable {
        AlterarEnderecoEntregaPage.atualizarDados(ElementLocators.salvarBtn);
    }

    @Then("^efetua a alteracao$")
    public void efetua_a_alteracao() throws Throwable {
    }

    @Then("^apresenta a mensagem \"([^\"]*)\"$")
    public void apresenta_a_mensagem(String arg1) throws Throwable {
    }

}