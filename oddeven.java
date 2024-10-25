import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
    Scanner num= new Scanner(System.in);
    System.out.print("enter a number:");
    int odd_even = num.nextInt();
    num.close();
    if(odd_even%2==0 || odd_even%2!=1){
        System.out.println("It is a even number");
    }
    else{
        System.out.println("It is a odd number");
    }
    }
}
