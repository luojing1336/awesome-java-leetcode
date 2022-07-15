import java.util.Arrays;
import java.util.HashMap;

/**
 * @author luojing
 * @description LJSolution
 * @date 2022/07/15
 */

public class LJSolution {

    /**
     * Solution1
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    /**
     * Solution2
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum2(int[] nums, int target) {
        int length = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            final Integer value = map.get(nums[i]);
            if (value != null) {
                return new int[] { value, i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        LJSolution ljSolution = new LJSolution();
        int[] nums = new int[] {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(ljSolution.twoSum1(nums, target)));
    }
}
