import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {

        System.out.println(checkAnagram("Hello",null));
    }
    public static boolean checkAnagram(String str1,String str2){


        if(str1==null ||str2==null || str1.length()!=str2.length()) return false;
        str1.toCharArray();
        str2.toCharArray();
       var arr1=str1.toLowerCase().toCharArray();
        var arr2=str2.toLowerCase().toCharArray();
Arrays.sort(arr1);
Arrays.sort(arr2);
return (Arrays.equals(arr1,arr2));
    }
}
