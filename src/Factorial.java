public class Factorial {
    public static void main(String[] args) {
        System.out.println(FactorialOfANumber(1));
    }
    public static  int FactorialOfANumber(int n){
        if(n<=1){ return  1;}

        else{ return n*FactorialOfANumber(n-1);  }
    }
}
