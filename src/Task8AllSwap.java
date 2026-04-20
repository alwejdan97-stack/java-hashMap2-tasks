import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task8AllSwap {
    public static void main(String[] args){
        String[] array={"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        System.out.println(Arrays.toString(allSwap(array)));
    }
    public static String[] allSwap(String[] array){
        Map<String,Integer> map=new HashMap<>();
        for(int i=0; i<array.length;i++){
            String key=array[i].substring(0,1);
            if(map.containsKey(key)){
                int before=map.get(key);
                String first=array[i];
                array[i]=array[before];
                array[before]=first;
                map.remove(key);
            }
            else{
                map.put(key,i);
            }
        }
        return array;
    }
}
