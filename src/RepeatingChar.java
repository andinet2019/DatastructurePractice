import java.util.HashMap;
import java.util.Map;

public class RepeatingChar {
    public static void main(String[] args) {
        System.out.println(firstRepeating("hello"));
    }

    public static Map<Character, Integer> firstRepeating(String str){
        Map<Character,Integer>map=new HashMap<>();
        for(char ch:str.toCharArray()){
            if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
            }
            else{map.put(ch,1);}
        }
return map;

    }
}
