import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
    Scanner num= new Scanner(System.in);
    System.out.print("enter a number:");
    int grade = num.nextInt();
    num.close();
    if(grade>=90){
        System.out.println("Grade:A");
    }
    else if(70<grade && 80<=grade){
        System.out.println("Grade:B");
    }
    else if(50<grade  && grade<=70){
        System.out.println("Grade:C");
    }
    else{
        System.out.println("Fail");
    }
    }
}