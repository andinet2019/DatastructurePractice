import java.util.Map;

public class Mapshare {

    public static void main(String[] args) {

    }

    public static Map<String, String> mapShare(Map<String, String> map) {
        //if  keya is not null set "make a and b value same set a to have same value as b
        //value of b to be value of a and remove c map.remove("c")
        //if map.get("a") !=null
        //map.put("b")=map.put("a")

        if(map.get("a") !=null ){
            map.put("b",map.get("a"));
            map.remove("c");
            return map;

        }


       return map;

    }

}
