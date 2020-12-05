import java.util.Stack;

public class CheckIfBalanced {

    public static void main(String[] args) {
        String str = "((2+3))";
        System.out.println(Balanved(str));
    }
public static  boolean Balanved(String str){

            Stack<Character>mystack =new Stack<>();
            for(char ch:str.toCharArray()){

                if(ch=='('){

                    mystack.push(ch);
                }
                else if(ch==')'){
if(mystack.empty()) return false;
                     mystack.pop();
                }
            }

           return mystack.isEmpty();
        }
    }

