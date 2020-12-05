public class ContainDuplicate {
public static void main(String[]args){
int [] Input={1,2,3,4,2,5};
    System.out.println(containsDuplicate(Input));
        }

        public static   boolean containsDuplicate(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i+1; j < nums.length; j++) {
                    if(nums[i]==nums[j] && i!=j)
                        return true;
                }
            }
            return  false;
    }}
