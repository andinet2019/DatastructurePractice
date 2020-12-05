import java.util.ArrayList;
import java.util.List;

public class DuplicateNumberBrut {
    public static void main(String[] args) {
        int[] pak = {1, 3, 4, 2, 2,1};
        System.out.println(findDuplicate(pak));
    }



        public static List<Integer> findDuplicate(int[] nums) {
            List<Integer> duplicate = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {

                  if(nums[i]==nums[j])

                         duplicate.add(nums[i]);


                }
            }
            return duplicate;
        }   }