package element_locators;

import org.openqa.selenium.By;

public class ElementLocators {

    //CriarConta
    public static By menuUsuarioBtn = By.xpath("(//a[@id='menuUserLink']//*[name()='svg'])"); // utilizado também no Efetuar Login e AlterarEnderecoEntrega
    public static By novaContaBtn = By.linkText("CREATE NEW ACCOUNT");
    public static By usuarioNovoTextfield = By.name("usernameRegisterPage");
    public static By emailNovoTextfield = By.name("emailRegisterPage");
    public static By senhaNovaTextfield = By.name("passwordRegisterPage");
    public static By senhaConfNovaTextfield = By.name("confirm_passwordRegisterPage");
    public static By primeiroNomeNovoTextfield = By.name("first_nameRegisterPage");
    public static By ultimoNomeNovoTextfield = By.name("last_nameRegisterPage");
    public static By telefoneNovoTextfield = By.name("phone_numberRegisterPage");
    public static By selectpaisCombo = By.name("countryListboxRegisterPage");
    public static By cidadeNovoTextfield = By.name("cityRegisterPage"); //utilizado também no AlterarEnderecoEntrega
    public static By enderecoNovoTextfield = By.name("addressRegisterPage"); //utilizado também no AlterarEnderecoEntrega
    public static By estadoNovoTextfield = By.name("state_/_province_/_regionRegisterPage");
    public static By cepNovoTextfield = By.name("postal_codeRegisterPage");//utilizado também no AlterarEnderecoEntrega
    public static By concordocheckBox = By.name("i_agree");
    public static By registraBtn = By.id("register_btnundefined");

    //EfetuarLogin
    public static By usuarioTextfield = By.name("username");
    public static By senhaTextField = By.name("password");
    public static By lembrarCheckBox = By.name("remember_me");
    public static By logarBtn = By.id("sign_in_btnundefined");

    //AdicionarProduto
    public static By laptopsImg = By.id("laptopsImg");
    public static By laptopEscolhidoImg = By.xpath("//*[@id='3']");
    public static By adicionaBtn = By.name("save_to_cart");

    //EfetuarPagamento
    public static By menuCarImg = By.id("menuCart");
    public static By checkoutBtn = By.id("checkOutButton");
    public static By proximoBtn = By.id("next_btn");
    public static String formaPgtRadio = "document.getElementsByName('safepay')[0].click();";
    public static By usuarioSafeTextField = By.name("safepay_username");
    public static By senhaSafeTextField = By.name("safepay_password");
    public static By salvaProfilecheckBox = By.name("save_safepay");
    public static By pagueBtn = By.id("pay_now_btn_SAFEPAY");

    //AlterarEnderecoEntrega
    public static By minhaconta = By.xpath("(//label[@class='option roboto-medium ng-scope'])[2]");
    public static By editarLink = By.xpath("/html/body/div[3]/section/article/div[1]/div[1]/h3/a");
    public static By salvarBtn = By.id("save_btnundefined");
    public static By cidadeAltTextfield = By.name("cityAccountDetails");
    public static By enderecoAltTextfield = By.name("addressAccountDetails");
    public static By cepAltTextfield = By.name("postal_codeAccountDetails");

    //Genérico
    public static By aguardeGenerico = By.xpath("//div/label[@class='roboto-bold ng-scope']");
    public static By aguardeGenerico2 = By.xpath("//*[@id=\"registerPage\"]/article/sec-form/div[2]/label[2]/a");
    public static By aguardeGenerico3 = By.xpath("//span[@class='hi-user containMiniTitle ng-binding']");
}