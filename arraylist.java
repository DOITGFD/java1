
import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(2,4);
        int maximum = Collections.max(arr);
        int minimum = Collections.min(arr);

        int sum=0;
        for (int num:arr){
            sum +=num;
        }
        System.out.println(arr);
        System.out.println(maximum);
        System.out.println(minimum);
        System.out.println(sum);

    }
}


//Iterator iter= arr.iterator();
//int sum = 0; 
//while(iter.hashnext()){
    //sum+=iter.next();
    //System.out.println(sum);
//}