import java.util.HashMap;
import java.util.Map;

public class Task2WordLen {
    public static void main(String[] args){
        String[] array = {"Aa","BbB","C","D"};
        System.out.println(wordLen(array));
    }
    public static Map<String, Integer> wordLen(String[] array){
        Map<String, Integer> map = new HashMap<>();
        for(String result : array){
            map.put(result,result.length());
        }

    }
}
