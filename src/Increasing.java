public class Increasing {


    //Given an array of scores, return true if each score is equal
    // or greater than the one before. The array will be length 2 or more.
    public static void main(String[] args) {
        int []myscore={4,1,3};
        System.out.println(scoresIncreasing(myscore));
    }
    public static  boolean scoresIncreasing(int[] scores) {
if(scores.length>=2)

    for (int i = 0; i < scores.length; i++) {
       if(scores[i+1]>scores[i])



    return true;

    }
 return false;
}   }
