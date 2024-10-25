import java.io.File;
public class strbuff {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");
        StringBuffer sb1=new StringBuffer("Hello");
        StringBuffer sb1=new StringBuilder("hai");
        System.out.println(sb.capacity());
        System.out.println(sb.append("hai"));
        if(sb.compareTo(sb1)==0){
            System.out.println("Equals");
        }
        System.out.println(sb.append("world"));
    }
}
