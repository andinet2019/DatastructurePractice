public class IsPalindrome {
    public static void main(String[] args) {

        System.out.println(palindrome("rr"));
    }


    public static boolean palindrome( String s ){
            String reverse="";

            for (int i = s.length()-1; i >=0; i--) {
                reverse=reverse+s.charAt(i);

            }

            if(s.equals(reverse)){
                    return true;
            }
            else return false;
        }




}


