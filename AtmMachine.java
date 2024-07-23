import java.util.*;

public class AtmMachine {
    public static void main(String arg[]) {
        // main menu
        int navigation;
        double balance = 0;
        double withdrawalAmt;
        double depositAmt;
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            Logger("Bangko ni Johny Sins");
            Logger("Balance: \u20B1" + balance);
            Logger("[0]-Exit");
            Logger("[1]-Deposit");
            Logger("[2]-Withdraw");
            Scanner scanner = new Scanner(System.in);
            System.out.print("What do you want to do? ");
            navigation = scanner.nextInt();

            switch (navigation) {
                case 0: {
                    Logger("Umexit ka na par.");
                    break;
                }
                case 1: {
                    System.out.print("Please Enter desired deposit amount: ");
                    depositAmt = scanner.nextDouble();
                    balance += depositAmt;
                    break;
                }
                case 2: {
                    System.out.print("Please Enter desired amount: ");
                    withdrawalAmt = scanner.nextDouble();
                    if (withdrawalAmt > balance) {
                        Logger("Insufficient fund");
                        break;
                    } else {
                        balance -= withdrawalAmt;
                        break;
                    }
                }
                default:
                    break;

            }

        } while (navigation != 0);
    }

    private static void Logger(String stringValue) {
        System.out.println(stringValue);
    }
}
