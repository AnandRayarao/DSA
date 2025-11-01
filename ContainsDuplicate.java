import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> ss = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(ss.contains(nums[i])){
                return true;
            }
            ss.add(nums[i]);
        }
        return false;
    }
}
