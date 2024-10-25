public class strdemo {
    public static void main(String[] args) {
        String str="hello";
        String str1="priya";
        System.out.println(str.hashcode());
        System.out.println(str1.hashcode());
        System.out.println(str.length());
        System.out.println(str.concat("priya"));
        System.out.println(str1.toUpperCase());
        System.out.println(str.toLowerCase());
        char[] ch=str.toCharArray();
        for(char c:ch){
            System.out.print(c+",");
        }
        System.out.println(str.charAt(2));
        System.out.println("");

    }
}
