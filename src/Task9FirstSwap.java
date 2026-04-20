import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Task9FirstSwap {
    public static void main(String[] args){
        String[] array={"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        System.out.println(Arrays.toString(firstSwap(array)));
    }
    public static String[] firstSwap(String[] array){
        Map<String, Integer> map=new HashMap<>();
        for(int i=0; i<array.length; i++){
            String key=array[i].substring(0,1);
            if(map.containsKey(key)){
                int before=map.get(key);
                if(before!=-1){
                    String first = array[i];
                    array[i] = array[before];
                    array[before] = first;
                    map.put(key,-1);
                }
            }else{
                map.put(key,i);
            }
        }
        return array;
    }
}
