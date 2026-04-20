import java.util.HashMap;
import java.util.Map;

public class Task4WordCoun {
    public static void main(String[] args){
        String[] array= {"A","B","C","D","A","D"};
        System.out.println(wordCoun(array));
    }
    public static Map<String, Integer> wordCoun(String[] array){
        Map<String, Integer> map= new HashMap<>();
        for(String result: array){
            if(map.containsKey(result)){
                map.put(result,map.get(result)+1);
            }else{
                map.put(result,1);
            }
        }
        return map;
    }
}
