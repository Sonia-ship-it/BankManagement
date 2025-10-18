import java.time.LocalDate;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\t-----------Welcome to Bank Management System-----------");
        System.out.print("Enter your names: ");
        String name=sc.nextLine();
        System.out.print("Enter your date of birth (yyyy-mm-dd): ");
        String date=sc.nextLine();
        LocalDate dob=LocalDate.parse(date);
        Person p=new Person(1,name,dob);
        System.out.print("Create account in bank? Y or N: ");
        String option=sc.nextLine().toLowerCase();
        if(option.equals("y")) {
            System.out.print("Enter account number: ");
            int ac = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter your current balance: ");
            float b = sc.nextInt();
            sc.nextLine();
            Account a = new Account(ac, b);
            while (true) {
                System.out.println("\n1. Deposit money to your account");
                System.out.println("2. Withdraw money from your account");
                System.out.println("3. Exit");
                System.out.print("Choose: ");
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        float amount = sc.nextInt();
                        sc.nextLine();
                        a.deposit(amount);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        float money = sc.nextInt();
                        sc.nextLine();
                        a.withdraw(money);
                        break;
                    case 3:
                        System.out.println("Goodbye -Exit");
                        return;
                    default:
                        System.out.println("Invalid option");
                        break;
                }
            }
        }
        else {
            System.out.println("Goodbye -Exit");
            return;
        }
    }
}