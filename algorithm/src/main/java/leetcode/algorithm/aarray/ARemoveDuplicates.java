package leetcode.algorithm.aarray;

import java.util.Arrays;

/**
 *    
 * Title         [Remove Duplicates from Sorted Array]
 * Author:       [..]
 * CreateDate:   [2020-04-30--14:02]  @_@ ~~
 * Version:      [v1.0]
 * Description:  [ 删除排序数组中的重复项]
 * <p>
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * </p>
 * <pre>
 * 示例 1:
 * 给定数组 nums = [1,1,2],
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 * 你不需要考虑数组中超出新长度后面的元素。
 * </pre>
 * <pre>
 * 示例 2:
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 * 你不需要考虑数组中超出新长度后面的元素。
 * </pre>
 * <pre>
 * 说明:
 * 为什么返回数值是整数，但输出的答案是数组呢?
 * 请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
 * 你可以想象内部操作如下:
 * {@code
 * // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
 * int len = removeDuplicates(nums);
 *
 * // 在函数里修改输入数组对于调用者是可见的。
 * // 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
 * for (int i = 0; i < len; i++) {
 *     print(nums[i]);
 * }
 * }
 * </pre>
 *  
 */
public class ARemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        int[] nums = {1,2};
        // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
        int len = removeDuplicates(nums);

        // 在函数里修改输入数组对于调用者是可见的。
        // 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
//        System.out.println(Arrays.toString(nums));
    }

//    public static int removeDuplicates(int[] nums) {
//        int offset = 1;
//        if (nums.length <= 1) {
//            return nums.length;
//        }
//        for (int i = 1; i < nums.length; i++) {
//            int left = nums[i - 1];
//            if (left >= nums[i]) {
//                //和左边的重复或者 比左边的小
//                for (; offset < nums.length; offset++) {
//                    //找到和左边不重复的那个
//                    if (left < nums[offset]) {
//                        //把第一个不重复的和i互换
//                        int temp = nums[offset];
//                        nums[offset] = nums[i];
//                        nums[i] = temp;
//                        break;
//                    }
//                }
//            }
//            if (offset == nums.length) {
//                return i;
//            }
//        }
//        return nums.length;
//    }

    //大神的解法
    public static int removeDuplicates(int[] nums) {
        int len = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[len++] = nums[i];
            }
        }
        return len;
    }
}
