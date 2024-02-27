package br.com.chronosacademy.steps;

import br.com.chronosacademy.core.Driver;
import br.com.chronosacademy.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.Map;

public class LoginSteps {
    LoginPage loginPage;
    @Before
    public void iniciaNavegador(){
        new Driver("chrome");
    }

    @After
    public void fechaNavegador(){
        Driver.getDriver().quit();

    }
    @Dado("que a modal esteja sendo exibida")
    public void queAModalEstejaSendoExibida() {
        Driver.getDriver().get("https://www.advantageonlineshopping.com/");
        loginPage = new LoginPage();
        loginPage.clickBtnLogin();
    }
    @Quando("for realizado um clique fora da modal")
    public void forRealizadoUmCliqueForaDaModal() {
        loginPage.clickDivFechaModal();

    }
    @Então("a janela modal deve ser fechada")
    public void aJanelaModalDeveSerFechada() throws Exception {
        try {
            loginPage.invisibilityofBtnFechar();
        } catch (Exception e) {
            throw new Exception("A janela modal não foi fechada");

        }
    }

    @Quando("for realizado um clique no ícone de fechar a modal")
    public void forRealizadoUmCliqueNoÍconeDeFecharAModal() {
        loginPage.clickBtnFechar();
    }

    @Quando("for realizado um clique no Link Create New Account")
    public void forRealizadoUmCliqueNoLinkCreateNewAccount() {
        loginPage.clickLinkCreateAccount();
    }

    @Então("a página Create New Account deve ser exibida")
    public void aPáginaCreateNewAccountDeveSerExibida() {
        
    }
    @Quando("os campos de login  sejam preenchidos da seguinte forma:")
    public void osCamposDeLoginSejamPreenchidosDaSeguinteForma(Map<String, String> map) {
        String username = map.get("login");
        String password = map.get("password");
        boolean remember = Boolean.parseBoolean(map.get("remember"));

        loginPage.setInpUserName(username);
        loginPage.setInpPassword(password);
        if (remember) loginPage.clickInpRemember();
    }

    @Quando("for realizado o clique no botão sign in")
    public void forRealizadoOCliqueNoBotãoSignIn() {
        loginPage.clickBtnSignIn();
    }

    @Então("deve ser possivel logar no sistema")
    public void deveSerPossivelLogarNoSistema() {

    }

    @Então("o sistema deve exibir uma mensagem de erro")
    public void oSistemaDeveExibirUmaMensagemDeErro() {
        
    }

    @Então("o botão sign in deve permanecer desabilitado")
    public void oBotãoSignInDevePermanecerDesabilitado() {
        boolean enabled = loginPage.isBtnSignIn();
        Assert.assertFalse(enabled);
    }
}
