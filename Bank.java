import java.util.*;


public class Bank {
    public static void main(String arg[])
    {
        Scanner s = new Scanner(System.in);
        double balance = 10000;
        double withdrawAmount;  
        System.out.println("Current Balance: \u20B1"+balance);
        do{
            System.out.print("Please enter desired amount: \u20B1");
            withdrawAmount = s.nextDouble();
            if((balance - withdrawAmount) < 0){
                System.out.println("You have an insufficient balance");
            }
            else{
                balance -= withdrawAmount;
                System.out.println("Successful withdrawal, your current balance is : \u20B1"+balance);
            }
        }
        while(balance > 0);
        
        s.close();
    }
}
