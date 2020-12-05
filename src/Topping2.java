import java.util.Map;

public class Topping2 {

    public static void main(String[] args) {

    }


        public Map<String, String> topping2(Map<String, String> map) {
            if(map.containsValue("ice cream")) {
                map.put("yogurt", map.get("ice cream"));
                return map;
            }

            if(map.containsValue("spinach")) {
                map.put("spinach", "nuts");
                return map;
            }

            return map;
        }}

