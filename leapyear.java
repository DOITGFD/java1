import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner leap = new Scanner(System.in);
        System.out.print("enter year:");
        int year=leap.nextInt();
        leap.close();
        if(year%400==0 ||(year%4==0 && year%100!=0)){
            System.out.print("Leap year");
        }
        else
        {
            System.out.print("not leap year");
        }
    }
}
