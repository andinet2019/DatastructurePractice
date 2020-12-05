import java.util.HashMap;
import java.util.Map;

public class ReturnFirstNonRepeatChar {
    public static void main(String[] args) {
        System.out.println(firstNonRepeat("mnhello"));
    }
    public static char firstNonRepeat(String str){

        Map<Character,Integer> map=new HashMap<>();
        var mychar=str.toCharArray();
        for(char ch:mychar) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }}

            for (char ch:mychar)
            if(map.get(ch)==1){
                return ch;

            }

        return Character.MIN_VALUE;
        }

    }

