package practise.sys;

public interface UserInter {

    boolean signUp(String account, String password, String rePassword);

    boolean signIn(String account, String password);

    boolean checkAccount(String account);

    boolean checkPassword(String password_1, String password_2);

}