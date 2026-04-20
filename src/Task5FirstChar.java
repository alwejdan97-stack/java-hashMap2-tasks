import java.util.HashMap;
import java.util.Map;

public class Task5FirstChar {
    public static void main(String[] args){
        String[] array= {"A","B","C","D","A","D","A"};
        String[] array1= {};
        System.out.println(firstChar(array));
        System.out.println(firstChar(array1));
    }
    public static Map<String,String> firstChar(String[] array){
        Map<String,String> map= new HashMap<>();
        for(String result:array){
            String key= result.substring(0,1);
            if(map.containsKey(key)){
                map.put(key, map.get(key)+result);
            }else{
                map.put(key,result);
            }
        }
        return map;
    }
}
