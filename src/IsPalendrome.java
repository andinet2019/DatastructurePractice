public class IsPalendrome {
    public static void main(String[] args) {
        System.out.println(isPalendrom(""));
    }
    public static boolean isPalendrom(String srr){
        int []myarr=new int[5];

        if(srr==null)  return false;
        int left=0;
        int right=srr.length()-1;
        while(left<right){
            if(srr.charAt(left++)!=srr.charAt(right--))
                return false;

    }
        return true;
    }
}
