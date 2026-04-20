import java.util.HashMap;
import java.util.Map;

public class Task3Pairs {
    public static void main(String[] args){
        String[] array = {"Hoor","Ali","Sara","Wejdan"};
        System.out.println(pairs(array));
    }
    public static Map<String, String> pairs(String[] array){
        Map<String, String> map= new HashMap<>();
        for(String result: array){
            String key= result.substring(0,1);
            String value= result.substring(result.length()-1);
            map.put(key, value);
        }

    }
}
