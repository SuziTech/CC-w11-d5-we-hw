import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GitHubAccount {

    //    private Object account;
    private String username;
    private String displayName;
    private ArrayList<Repository> repositories;
    private AccountType accountType;
    private Boolean userLoggedIn__True = false;

    private List<String> usernames = new ArrayList<String>();

    public GitHubAccount(String username,
                         String displayName,
                         ArrayList<Repository> repositories,
                         AccountType accountType,
                         Boolean userLoggedIn__True) {
        this.username = username;
        this.displayName = displayName;
        this.repositories = repositories;
        this.accountType = accountType;
        this.userLoggedIn__True = userLoggedIn__True;
    }

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

         userLoggedIn__True = true;
         return true;
    }

    public boolean logUserOut(String username) {
        userLoggedIn__True = false;
        return true;
    }

//    public boolean createNewUserAccount(String username) {
//        displayName = username;
//        accountType = AccountType.FREE;
//        repositories = null;
//
//        this.account = new account(username,
//                                    displayName,
//                                    accountType,
//                                    repositories);
//
//        return true;
//    }
}
