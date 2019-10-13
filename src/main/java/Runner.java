import java.util.Scanner;

// import static java.lang.Integer.parseInt;

public class Runner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        GitHubAccount gitHubAccount = new GitHubAccount();
        Repository repository = new Repository();
        Commit commit = new Commit();

        System.out.println("Welcome to GitHub");
        System.out.println("Select an Option:");
        System.out.println("1. Login");
        System.out.println("2. Create a new account");
        System.out.println("3. Select a Repository");
        System.out.println("4. Create a new Repository");
        System.out.println("5. Select a Commit");
        System.out.println("6. Create a new Commit");
        System.out.println("7. Logout");

        int pick = scanner.nextInt();

        if(pick == 1) {
            String prompt = String.format("Please enter your username: ");
            System.out.println(prompt);
            String userName = scanner.next();
            if(GitHubAccount.checkUsername(userName)) {
                GitHubAccount.logUserIn(userName);
            }
            else {
                System.out.println("Sorry, that username is not known. Please try again.");
            }
        }
        else if(pick == 2) {
            String prompt = String.format("Please enter your preferred username: ");
            System.out.println(prompt);
            String userName = scanner.next();
            if(GitHubAccount.checkUsername(userName)) {
                System.out.println("That username is taken please try again...");
            }
            else {
                GitHubAccount.createNewUserAccount(userName);
                System.out.println(" ");
            }



        }
        else if(pick == 3) {
            Repository.getRepositories(userName);
        }
        else if(pick == 4) {

        }
        else if(pick == 5) {

        }
        else if(pick == 6) {

        }
        else if(pick == 7) {
            if(GitHubAccount.logUserOut(userName)) {
                System.out.println("Thank you for using GitHub, come back again soon...");
            }
            else {
                System.out.println("Ooops! Something went wrong, please logout again");
            }
        }
        else {
            System.out.println("You need to choose 1, 2, 3, 4, 5, 6 or 7");
        }
        scanner.close();
    }

}
