import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // to get input from user
        Scanner sc = new Scanner(System.in);

        Service bankService = new Service();

        System.out.println("Welcome to our Bank!!");

        while (true) {
            System.out.println("1 Register\n2 Login\n3 Deposit\n4 Withdraw\n5 History\n6 Logout \n Please select a choice");
            System.out.println("Enter choice");
            int cho = sc.nextInt();

            // 1: Register
            if (cho == 1) {

                // ask for credentials
                System.out.println("Enter Your username: ");
                String username = sc.next();
                System.out.println("Enter Your password");
                String password = sc.next();

                // check if password is valid or not
                if (Validation.isValid(password)) {

                    // if yes we register the user
                    bankService.register(username, password);
                    System.out.println("\nUser Succesfully Registered\n");
                    System.out.println("Thank You for Registering! Welcome");
                }
            } else if (cho == 2) { // 2: Login

                // ask for credentials
                System.out.println("Enter Your username: ");
                String username = sc.next();
                System.out.println("Enter Your password");
                String password = sc.next();

                // login the user
                bankService.login(username, password);
                System.out.println("\nUser Succesfully Logged In\n");
            } else if (cho == 3) { // 3: Deposit

                // ask for amount
                System.out.println("Enter amount to deposit: ");
                int amt = sc.nextInt();

                // deposit
                bankService.deposit(amt);
            } else if (cho == 4) { // 4: Withdraw

                // ask for amount
                System.out.println("Enter amount to withdraw: ");
                int amt = sc.nextInt();

                // withdraw
                bankService.withdraw(amt);
            } else if (cho == 5) { // 5: History

                // get Transactional History
                bankService.printHistory();
            } else if (cho == 6) { // 6: Logout

                // logout
                bankService.logout();
                System.out.println("Thankyou");
                break;
            } else {

                System.out.println("Invalid Choice. Try Again");
                break;
            }
        }
    }
}
