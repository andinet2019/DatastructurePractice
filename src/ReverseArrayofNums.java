import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ReverseArrayofNums {
    public static void main(String[] args) {
        int [] arr1={1, 2, 3};
        System.out.println(Arrays.toString(reverse3(arr1)));
    }

    public  static int[] reverse3(int[] nums) {

        int [] values=new int[3];
        for(int i = 0, j = nums.length - 1; i < nums.length; i++,j--) {
            values[i] = nums[j];
        }
return  values;
    }
}
