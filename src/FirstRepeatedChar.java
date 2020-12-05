import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedChar {
    public static void main(String[] args) {
        System.out.println(firstRepeated("brty"));
    }
    public static char firstRepeated(String str) {
        Set<Character> set = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (set.contains(ch))
                return ch;
            set.add(ch);


        }
        return Character.MIN_VALUE;
    }}
