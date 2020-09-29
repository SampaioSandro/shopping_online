$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/AlterarEnderecoEntrega.feature");
formatter.feature({
  "line": 3,
  "name": "Alterar endereco de entrega no site advantageonlineshopping",
  "description": "",
  "id": "alterar-endereco-de-entrega-no-site-advantageonlineshopping",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AlterarEnderecoEntrega"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Efetuar login em uma conta ja existente com informacoes validas",
  "description": "",
  "id": "alterar-endereco-de-entrega-no-site-advantageonlineshopping;efetuar-login-em-uma-conta-ja-existente-com-informacoes-validas",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "que eu tenha acessado o site advantageonlineshopping atraves da \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "eu clico no ícone da imagem do usuario",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "o sistema apresenta um poup-up/modal com opcoes de login, sendo atraves do facebook, com usuario pre-cadastrado ou criar uma nova conta e ainda a opcao de esqueci minha senha",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "eu seleciono o arquivo de massa \"efetuarlogin\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "eu insiro as informacoes \u003ccenario\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "o sistema valida as informacoes",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "me direciona para home com o usuario ja logado",
  "keyword": "And "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "alterar-endereco-de-entrega-no-site-advantageonlineshopping;efetuar-login-em-uma-conta-ja-existente-com-informacoes-validas;",
  "rows": [
    {
      "cells": [
        "url",
        "cenario"
      ],
      "line": 15,
      "id": "alterar-endereco-de-entrega-no-site-advantageonlineshopping;efetuar-login-em-uma-conta-ja-existente-com-informacoes-validas;;1"
    },
    {
      "cells": [
        "https://www.advantageonlineshopping.com",
        "USUARIO_VALIDO"
      ],
      "line": 16,
      "id": "alterar-endereco-de-entrega-no-site-advantageonlineshopping;efetuar-login-em-uma-conta-ja-existente-com-informacoes-validas;;2"
    }
  ],
  "keyword": "Scenarios"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 16,
  "name": "Efetuar login em uma conta ja existente com informacoes validas",
  "description": "",
  "id": "alterar-endereco-de-entrega-no-site-advantageonlineshopping;efetuar-login-em-uma-conta-ja-existente-com-informacoes-validas;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@AlterarEnderecoEntrega"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "que eu tenha acessado o site advantageonlineshopping atraves da \"https://www.advantageonlineshopping.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "eu clico no ícone da imagem do usuario",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "o sistema apresenta um poup-up/modal com opcoes de login, sendo atraves do facebook, com usuario pre-cadastrado ou criar uma nova conta e ainda a opcao de esqueci minha senha",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "eu seleciono o arquivo de massa \"efetuarlogin\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "eu insiro as informacoes USUARIO_VALIDO",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "o sistema valida as informacoes",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "me direciona para home com o usuario ja logado",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.advantageonlineshopping.com",
      "offset": 65
    }
  ],
  "location": "StepDefinitions.que_eu_tenha_acessado_o_site_advantageonlineshopping_atraves_da_url(String)"
});
formatter.result({
  "duration": 8142674300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.eu_clico_no_ícone_da_imagem_do_usuario()"
});
formatter.result({
  "duration": 2420428500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.o_sistema_apresenta_um_poup_up_modal_com_opcoes_de_login_sendo_atraves_do_facebook_com_usuario_pre_cadastrado_ou_criar_uma_nova_conta_e_ainda_a_opcao_de_esqueci_minha_senha()"
});
formatter.result({
  "duration": 29100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "efetuarlogin",
      "offset": 33
    }
  ],
  "location": "StepDefinitions.eu_seleciono_o_arquivo_de_massa(String)"
});
formatter.result({
  "duration": 161200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.eu_insiro_as_informacoes_cenario()"
});
formatter.result({
  "duration": 1825473100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.o_sistema_valida_as_informacoes()"
});
formatter.result({
  "duration": 32100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.me_direciona_para_home_com_o_usuario_ja_logado()"
});
formatter.result({
  "duration": 29100,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 19,
  "name": "Alterar endereco de entrega",
  "description": "",
  "id": "alterar-endereco-de-entrega-no-site-advantageonlineshopping;alterar-endereco-de-entrega",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@AlterarEnderecoEntregaPositivo"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "eu clico no icone da imagem do usuario que ja esta com o meu login informado",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "o sistema apresenta uma lista/accordin com tres opcoes, minha conta, minhas ordens, e sair",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "eu clico na opcao minha conta",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "o sistema me direciona para experiencia minha conta, onde posso alterar Detalhes da conta, Detalhes de envio, método de pagamento preferido, Notifique-me sobre promoções ou ainda deletar a minha conta",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "eu clico em editar detalhes da conta",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "o sistema habilita os campos relacionados a detalhes de conexao, senha, detalhes pessoais e endereco para que eu possa alterar",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "eu seleciono o arquivo de massa \"alterarendereco\"",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "eu insiro as informacoes \u003ccenario\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "clico no botao Salve",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "o sistema valida as informacoes",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "efetua a alteracao",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "apresenta a mensagem \"Conta Atualizada com Sucesso\"",
  "keyword": "And "
});
formatter.examples({
  "line": 33,
  "name": "",
  "description": "",
  "id": "alterar-endereco-de-entrega-no-site-advantageonlineshopping;alterar-endereco-de-entrega;",
  "rows": [
    {
      "cells": [
        "cenario"
      ],
      "line": 34,
      "id": "alterar-endereco-de-entrega-no-site-advantageonlineshopping;alterar-endereco-de-entrega;;1"
    },
    {
      "cells": [
        "ENDERECO"
      ],
      "line": 35,
      "id": "alterar-endereco-de-entrega-no-site-advantageonlineshopping;alterar-endereco-de-entrega;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 35,
  "name": "Alterar endereco de entrega",
  "description": "",
  "id": "alterar-endereco-de-entrega-no-site-advantageonlineshopping;alterar-endereco-de-entrega;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@AlterarEnderecoEntregaPositivo"
    },
    {
      "line": 1,
      "name": "@AlterarEnderecoEntrega"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "eu clico no icone da imagem do usuario que ja esta com o meu login informado",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "o sistema apresenta uma lista/accordin com tres opcoes, minha conta, minhas ordens, e sair",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "eu clico na opcao minha conta",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "o sistema me direciona para experiencia minha conta, onde posso alterar Detalhes da conta, Detalhes de envio, método de pagamento preferido, Notifique-me sobre promoções ou ainda deletar a minha conta",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "eu clico em editar detalhes da conta",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "o sistema habilita os campos relacionados a detalhes de conexao, senha, detalhes pessoais e endereco para que eu possa alterar",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "eu seleciono o arquivo de massa \"alterarendereco\"",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "eu insiro as informacoes ENDERECO",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "clico no botao Salve",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "o sistema valida as informacoes",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "efetua a alteracao",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "apresenta a mensagem \"Conta Atualizada com Sucesso\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.eu_clico_no_icone_da_imagem_do_usuario_que_ja_esta_com_o_meu_login_informado()"
});
formatter.result({
  "duration": 2979301000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.o_sistema_apresenta_uma_lista_accordin_com_tres_opcoes_minha_conta_minhas_ordens_e_sair()"
});
formatter.result({
  "duration": 34900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.eu_clico_na_opcao_minha_conta()"
});
formatter.result({
  "duration": 18316900300,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d85.0.4183.121)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027NP51706604\u0027, ip: \u0027192.168.13.102\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.121, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\P51706~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:52526}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 1f1028d58720c708adf3b53995560720\n*** Element info: {Using\u003dxpath, value\u003d(//label[@class\u003d\u0027option roboto-medium ng-scope\u0027])[2]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementsByXPath(RemoteWebDriver.java:432)\r\n\tat org.openqa.selenium.By$ByXPath.findElements(By.java:348)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:311)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:895)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:44)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:206)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:202)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:248)\r\n\tat page_object.AlterarEnderecoEntregaPage.selecionarItemMenu(AlterarEnderecoEntregaPage.java:47)\r\n\tat steps.StepDefinitions.eu_clico_na_opcao_minha_conta(StepDefinitions.java:187)\r\n\tat ✽.Then eu clico na opcao minha conta(features/AlterarEnderecoEntrega.feature:22)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinitions.o_sistema_me_direciona_para_experiencia_minha_conta_onde_posso_alterar_Detalhes_da_conta_Detalhes_de_envio_método_de_pagamento_preferido_Notifique_me_sobre_promoções_ou_ainda_deletar_a_minha_conta()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.eu_clico_em_editar_detalhes_da_conta()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.o_sistema_habilita_os_campos_relacionados_a_detalhes_de_conexao_senha_detalhes_pessoais_e_endereco_para_que_eu_possa_alterar()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "alterarendereco",
      "offset": 33
    }
  ],
  "location": "StepDefinitions.eu_seleciono_o_arquivo_de_massa(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.eu_insiro_as_informacoes_ENDERECO()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.clico_no_botao_Salve()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.o_sistema_valida_as_informacoes()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.efetua_a_alteracao()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Conta Atualizada com Sucesso",
      "offset": 22
    }
  ],
  "location": "StepDefinitions.apresenta_a_mensagem(String)"
});
formatter.result({
  "status": "skipped"
});
});