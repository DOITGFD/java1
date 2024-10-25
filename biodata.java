import  java.util.Scanner;

public class biodata {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("enter your name:");
        String name = data.nextLine();
        System.out.print("enter your age:");
        int age = data.nextInt();
        System.out.print("Address:");
        String address = data.nextLine();
        data.close();
    }
}
