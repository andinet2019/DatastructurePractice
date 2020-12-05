public class CapitalizeFirstWord {
    public static void main(String[] args) {
        System.out.println(capitalize("Hello  my  paku"));
    }
    public static String capitalize(String str){
        if(str== "" || str==null ){return "";}
        String []words=str.trim().replaceAll(" +"," ").split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i]=words[i].substring(0,1).toUpperCase()+
            words[i].substring(1).toLowerCase();
        }
        return String.join(" ",words);
    }
}
