import java.util.Scanner;

class ATM {
    float balance;
    int pin = 1234;

    public void checkPin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == pin) {
            menu();
        } else {
            System.out.println("Incorrect PIN");
        }
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Transaction History\n2. Withdraw\n3. Deposit\n4. Transfer\n5. Quit");
            System.out.print("Choose an option: ");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Transaction History not implemented (demo purpose)");
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    float wAmt = sc.nextFloat();
                    if (wAmt <= balance) {
                        balance -= wAmt;
                        System.out.println("Withdraw successful.");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    float dAmt = sc.nextFloat();
                    balance += dAmt;
                    System.out.println("Deposit successful.");
                    break;
                case 4:
                    System.out.print("Enter amount to transfer: ");
                    float tAmt = sc.nextFloat();
                    if (tAmt <= balance) {
                        balance -= tAmt;
                        System.out.println("Transfer successful.");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM.");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}

public class Task3_ATMInterface {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.checkPin();
    }
}
