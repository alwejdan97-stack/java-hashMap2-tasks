import java.util.HashMap;
import java.util.Map;

public class wordAppend {
    public static void main(String[] args){
        String[] array= {"a", "b", "a","a"};
        String[] array2= {"a", "b", "a", "c", "a", "d", "a"};
        String[] array3= {"a","a"," "};
        System.out.println(wordAppend(array));
        System.out.println(wordAppend(array2));
        System.out.println(wordAppend(array3));
    }
    public static String wordAppend(String[] array){
        Map<String,Integer> map= new HashMap<>();
        String New="";
        int count;
        for(String result: array){
            count = map.getOrDefault(result,0)+1;
            map.put(result,count);
            if(count %2==0){
                New = New+ result;
            }
        }
        return New;
    }
}
