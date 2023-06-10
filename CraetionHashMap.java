import java.util.*;
public class CraetionHashMap {
    public static void main(String args[]){
        HashMap<String, Integer> map= new HashMap<>();
        map.put("IND",120);
        map.put("CHN",150);
        map.put("UK",30);
        
        System.out.println(map);
        System.out.println("updating value of an existing key");
        map.put("CHN",110);
        System.out.println(map);
        System.out.println("checking whether the key is present or not");
        if(map.containsKey("IND"))
        System.out.println("It is presnt and the value is :"+map.get("IND"));
        else
        System.out.println(map.get("UN"));

        System.out.println("printing values of a hashmap using for loop");
        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        System.out.println("printing keys using for loop");
        Set<String> keys=map.keySet();
        for(String key: keys)
        System.out.println(key);
        System.out.println("printing values using for loop");
        Collection<Integer> val=map.values();
        for( Integer values : val)
        System.out.println(values);

    }
}
