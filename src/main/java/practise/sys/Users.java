package practise.sys;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.UUID;

@Setter
@Getter
public class Users implements UserInter {

    private static HashMap<String, Users.User> userList = new HashMap<>(100);

    @Override
    public boolean signUp(String account, String password, String rePassword) {
        if (checkAccount(account) || !checkPassword(password, rePassword)) {
            return false;
        }
        Users.User user = new Users.User();
        user.id = UUID.randomUUID().toString();
        user.account = account;
        user.password = password;
        userList.put(account, user);
        return true;
    }

    @Override
    public boolean signIn(String account, String password) {
        if (isElemEmpty(account, password)) {
            return false;
        }
        if (userList.isEmpty()) {
            return false;
        }
        Users.User user = userList.get(account);
        if (!checkAccount(account)) {
            return false;
        }
        return user.password.equals(password);
    }

    @Override
    public boolean checkAccount(String account) {
        if (account == null) {
            return false;
        }
        return userList.containsKey(account);
    }

    @Override
    public boolean checkPassword(String password_1, String password_2) {
        if (isElemEmpty(password_1, password_2)) {
            return false;
        }
        return password_1.length() < 18 && password_1.equals(password_2);
    }

    private boolean isElemEmpty(String str1, String str2) {
        return str1 == null || str2 == null;
    }

    @Getter
    @Setter
    class User {
        private String id;
        private String account;
        private String password;

        private Blog blog;

        public User() {
            blog = new Blog(this);
        }

    }
}
