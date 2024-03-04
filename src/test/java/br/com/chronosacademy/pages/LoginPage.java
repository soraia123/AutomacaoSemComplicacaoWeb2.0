package br.com.chronosacademy.pages;

import br.com.chronosacademy.core.Driver;
import br.com.chronosacademy.maps.LoginMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    LoginMap loginMap;

    public LoginPage(){
        loginMap = new LoginMap();
        PageFactory.initElements(Driver.getDriver(), loginMap);
    }

    public void clickBtnLogin(){
        Driver.visibilityof(loginMap.btnLogin);
        loginMap.btnLogin.click();
    }

    public void clickBtnFechar(){
        loginMap.btnFechar.click();
    }

    public void clickDivFechaModal(){
        loginMap.divFechaModal.click();
    }

    public void setInpUserName(String username){
        if (username != null) {
            loginMap.inpUserName.sendKeys(username);
        }
    }

    public void setInpPassword(String password){
        if (password != null) {
            loginMap.inpPassword.sendKeys(password);
        }
    }

    public void clickInpRemember(){
        loginMap.inpRemember.click();

   }
   public void clickLinkCreateAccount(){
        loginMap.linkCreateAccount.click();
   }

    public void clickBtnSignIn(){
        loginMap.btnSignIn.click();
    }

    public boolean isBtnSignIn(){
        return loginMap.btnSignIn.isEnabled();
    }

    public void visibilityofBtnFechar(){
        Driver.visibilityof(loginMap.btnFechar);
    }

    public void invisibilityofBtnFechar(){
        Driver.invisibilityof(loginMap.btnFechar);
    }

    public void aguardaLoader(){
        String value;
        Driver.atributChange(loginMap.divLoader, "display", "none");}

    public String getusuarioLogado(){
        Driver.visibilityof(loginMap.textLogado);
        return loginMap.textLogado.getText();
    }

    public String getErroLogin(){
        Driver.visibilityof((loginMap.textErroLogin));
        return loginMap.textErroLogin.getText();

    }
}
