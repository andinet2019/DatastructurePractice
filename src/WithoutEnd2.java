public class WithoutEnd2 {

    public static void main(String[] args) {
    }
    public String withouEnd2(String str) {
        //str==any length || 0
        if(str.length()<=2){
            return str.substring(2);}
            else {

                return str.substring(1,str.length()-1);
            }
        }

    }


