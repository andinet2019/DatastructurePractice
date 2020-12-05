import java.util.Stack;

public class ReversString {

    public static void main(String[] args) {
        System.out.println(Reverser("Hello"));
    }

    public static String Reverser(String str) {
if(str==null){throw new IllegalArgumentException();}
        //using stack to zzreverse push to the stack and pop and append it and toString










        Stack<Character> mystack = new Stack<>();
for(char s :str.toCharArray())
    mystack.push(s);
    StringBuilder reversed=new StringBuilder();
while(!mystack.isEmpty())
 reversed.append(mystack.pop());
        return reversed.toString();
}


    }
