import java.util.HashMap;
import java.util.Map;

public class word0 {
    public static void main(String[] args){
        String[] array= {"A","B","C","D"};
        System.out.println(word0(array));
    }
    public static Map<String, Integer> word0(String[] array){
        Map<String, Integer> map= new HashMap<>();
        for(String result: array){
            map.put(result, 0);
        }
        return map;
    }
}
