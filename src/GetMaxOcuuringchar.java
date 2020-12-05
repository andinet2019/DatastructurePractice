import java.util.HashMap;
import java.util.Map;

public class GetMaxOcuuringchar {
    public static void main(String[] args) {
        System.out.println(maxoccuringChar("abbggg"));
    }
    public static char maxoccuringChar(String str){
      int []frequencies=new int[256];
        for (var ch:str.toCharArray())
            frequencies[ch]++;
            int max=0;
        char result=' ';
          for(int i=0;i<frequencies.length;i++)

           if(frequencies[i]>max ){
               max=frequencies[i];
               result=(char) i;

           }
             return result;



    }   }
