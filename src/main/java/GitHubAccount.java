import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GitHubAccount {

    private Object account;
    private String username;
    private String displayName;
    private ArrayList<Repository> repositories;
    private AccountType accountType;
    private Boolean UserLoggedIn__True = false;

    private List<String> usernames = new ArrayList<String>();


    public boolean checkUsername(String username) {
        if (usernames.contains(username)) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean logUserIn(String username) {
//  called only after CheckUsername() has been called and returned True

         UserLoggedIn__True = true;
         return true;
    }

    public boolean logUserOut(String username) {
        UserLoggedIn__True = false;
        return true;
    }

    public boolean createNewUserAccount(String username) {
        displayName = username;
        accountType = AccountType.FREE;
        repositories = null;

        this.account = new account(username,
                                    displayName,
                                    accountType,
                                    repositories);

        return true;
    }
}
