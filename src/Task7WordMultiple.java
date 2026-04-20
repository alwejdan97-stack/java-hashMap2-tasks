import java.util.HashMap;
import java.util.Map;

public class Task7WordMultiple {
    public static void main(String[] args){
        String[] array={"a","b","c","b","d","c"};
        System.out.println(wordMultiple(array));
    }
    public static Map<String,Boolean> wordMultiple(String[] array){
        Map<String,Boolean> map=new HashMap<>();
        for(String result:array){
            if(map.containsKey(result)){
                map.put(result,true);
            }else{
                map.put(result,false);
            }
        }
        return map;
    }
}
