public class FindNumOfVowels {
    //Find the number of vowels in a string
    public static void main(String[] args) {
        System.out.println(numberOfVowels(""));
    }
    public static  int numberOfVowels(String str){
String vowels="aeiou";
if(str==null){
    return 0; }
        int count=0;
for( var ch:str.toLowerCase().toCharArray()){

    if(vowels.indexOf(ch)!=-1)
    count++;

    }
        return count;
}

    }

