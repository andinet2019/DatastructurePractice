public class FirstLast6 {
    public static void main(String[] args) {

    }

    public boolean firstLast6(int[] nums) {
        //true if 6 is nums[0] or nums[nums.length-1]

        if( nums[0]==6 || nums[nums.length-1]==6){
            return true;


        }
        return false;
    }}
