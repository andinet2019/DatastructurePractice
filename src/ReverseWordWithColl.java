import java.util.Arrays;
import java.util.Collections;

public class ReverseWordWithColl {
    public static void main(String[] args) {
        System.out.println(reverseWithColle(null));
    }
    public static String reverseWithColle(String str){
        if(str==null){return "''";}
        String words[]=str.split(" ");
        Collections.reverse(Arrays.asList(words));
return String.join(" ",words);
    }
}
