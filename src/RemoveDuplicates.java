import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println(removeduplicate(null));
    }
    public static String removeduplicate(String str){
        StringBuilder sb=new StringBuilder();
Set<Character> seen=new HashSet<>();
if(str==null) return "";
        for (char ch:str.toCharArray()) {
             if(!seen.contains(ch)){

                 seen.add(ch);
                 sb.append(ch);
             }
        }
        return sb.toString();
}

}
