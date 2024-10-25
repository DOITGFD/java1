import java.util.Scanner;
public class days {
    public static void main(String[]args){
        Scanner weekdays = new Scanner(System.in);
        System.out.print("ENTER THE DAY :");
        int day= weekdays.nextInt();
        weekdays.close();
        switch(day){
        case 1:
            System.out.print("monday");
            break;
        case 2:
            System.out.println("TUESDAY");
            break;
        case 3:
            System.out.print("Wednesday");
            break;
        case 4:
            System.out.print("Thursday");
            break;
        case 5 :
            System.out.println("Friday");
            break;
         
    }
  }
}
