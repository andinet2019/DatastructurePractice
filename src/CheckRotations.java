public class CheckRotations {
    public static void main(String[] args) {
        String st="ABCD";
        String st2="BAD1";
        System.out.println(checkRotaion(st,st2));
    }
    public static boolean checkRotaion(String str1,String  str2){
        if(str1==null || str2==null)return false;
else{
        return  ( str1.length()== str2.length() && (str1+str2).contains(str2));}




    }
}
