import java.util.Scanner;
public class list {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("enter the size");
        int size=num.nextInt();
        int[]arr=new int[size];
        System.out.println("enter the element:");
        for(int i=0;i<size;i++){
            arr[i]=num.nextInt();
        }
            System.out.print("the array elements are:");
            for(int i=0;i<size;i++){
                System.out.print(arr[i]+" ");
        }

    }
}
