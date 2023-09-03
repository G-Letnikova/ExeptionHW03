package task01;
import java.util.regex.Pattern;

public class PasswordVerifier {
    private String pass;
    public PasswordVerifier () {
    }
    public PasswordVerifier (String pass) throws PasswordVerifierExeptoin{
        this.pass = pass;
        Pattern pattern1 = Pattern.compile("[A-Z]");
        Pattern pattern2 = Pattern.compile("[0-9]");
    
        if (pass.length() < 8) { 
            throw new PasswordVerifierExeptoin("Пароль должен быть не менее 8 символов");
        }
        if (!pattern1.matcher(pass).find()) { 
            throw new PasswordVerifierExeptoin("Пароль должен содержать хотя бы одну заглавную букву");
        }
        if (!pattern2.matcher(pass).find()) { 
            throw new PasswordVerifierExeptoin("Пароль должен  содержать хотя бы одну цифру");
        }


    }
    public String getPass() {
            return pass;
    }
    @Override
    public String toString() {
        return pass;
    }
}
    
