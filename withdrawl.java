import java.util.Scanner;
public class withdrawl {
    public static void main(String[] args){
        Scanner amount = new Scanner(System.in);
        System.out.print("ENTER YOUR BALANCE AMOUNT:");
        int Balance = amount.nextInt();
        System.out.print("ENTER YOUR WITHDRAWL AMOUNT:");
        int amount_withdrawl=amount.nextInt();
        amount.close();
        int amount_balance=Balance-amount_withdrawl;
        System.out.print("BALANCE AFTER WITHDRAWL:"+amount_balance);
    }
}
