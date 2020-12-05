public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reveseWord("I love paku"));
    }
    public static String reveseWord(String str){
        String []words=str.split(" ");
        StringBuilder reversed=new StringBuilder();
for(int i=words.length-1;i>=0;i--){
    reversed.append(words[i]+" ");

}
        return reversed.toString().trim();
    }

}
