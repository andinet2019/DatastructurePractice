public class Withoutx2 {
    public static void main(String[] args) {
        System.out.println(withoutX2("xxhi"));
    }

    public static String withoutX2(String str) {
        //if one firstchar=x or both first two char x return
        //string without x if doesnot have return same

        if(str.charAt(0)=='x' && str.charAt(1)=='x')
        {return str.substring(2);}

        else if (str.charAt(0) == 'x')
    {
        return str.substring(1);
    }

    else return str;
    }




}




