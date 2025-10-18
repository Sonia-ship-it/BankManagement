import java.time.LocalDate;

public class Person {
    private int id;
    private String name;
    private LocalDate dob;
    Person(int id, String name, LocalDate dob){
        this.id=id;
        this.name=name;
        this.dob=dob;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
class Account {
    private int accountNumber;
    private float balance;
    private static float amount;

    Account(int accountNumber, float balance) {
        if(balance < 0) System.out.println("Negative amount not allowed");
        else {
            this.accountNumber = accountNumber;
            this.balance = balance;
            Account.amount = balance;
        }
    }

    public float getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public float getAmount() {
        return amount;
    }
    static void deposit(float balance) {
        if(balance < 0) System.out.println("Negative amount not allowed");
        else {
            System.out.println(balance + " Frw deposited.");
            amount += balance;
            System.out.println("New balance : " + amount + " Frw");
        }
    }
    static void withdraw(float balance) {
        if(balance < 0) System.out.println("Negative amount not allowed");
        else if(balance > amount) System.out.println("You don't have enough funds.");
        else {
            System.out.println(balance+" Frw removed from account.");
            amount -= balance;
            System.out.println("New balance: " + amount + " Frw");
        }
    }
}

