public class ReversingString1 {
    public static void main(String[] args) {
        System.out.println(reverse("heloo"));
    }

   public static String  reverse(String str) {
        if(str==null){
            return "";
        }
        StringBuilder reversed = new StringBuilder();
       for (int i = str.length()-1; i>=0 ; i--)
        reversed.append(str.charAt(i));
       return reversed.toString();

    }

}
