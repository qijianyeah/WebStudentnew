package infomessage;

import forms.LoginForm;
import forms.RegisterFrom;
import org.junit.Test;

public class UserMessqgeTest {


    @Test
    public void testRegister(){
        RegisterFrom registerFrom = new RegisterFrom("qqq","123","1","111@qq.com");
        LoginForm loginForm = new LoginForm();
        UserMessage userMessage = UserMessage.getInstance();
//        userMessage.login(loginForm);
        userMessage.Register(registerFrom);
    }

}
