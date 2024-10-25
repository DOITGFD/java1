import java.util.*;
public class GenericsDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Item1",20);
        hm.put("item2",30);
        hm.put("item3",40);
        System.out.println(hm.keySet());
        for(Map.Entry<String,Integer> ent:hm.entrySet()){
            System.out.println(ent.getKey()+":"+ent.getValue());
        }

        HashSet<String> set1 = new HashSet<>();
        set1.add("Grapes");
        set1.add("Mango");
        set1.add("Apple");

        System.out.println(set1.size());
    }
}
