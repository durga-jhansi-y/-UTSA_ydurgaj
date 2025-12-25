import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -5.00);

        System.out.printf("balance : %s %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("balance : %s %.2f%n", account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount1 = scan.nextDouble();
        System.out.printf("%nadding %.2f to account's balance%n", depositAmount1, account1.getName());
        account1.deposit(depositAmount1);
        System.out.printf("balance : %s %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("balance : %s %.2f%n", account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        double depositAmount2 = scan.nextDouble();
        System.out.printf("%nadding %.2f to account's balance%n", depositAmount2, account2.getName());
        account2.deposit(depositAmount2);
        System.out.printf("balance : %s %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("balance : %s %.2f%n", account2.getName(), account2.getBalance());

    }  
}
