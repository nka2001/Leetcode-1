package com.mycompany.leetcode1;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author nicka
 */
public class TwoSum {

    public TwoSum() {
        //do nothing
    }

    /**
     * twoSum method will satisfy Leetcode #1, it will return the two numbers needed to produce target
     * @param nums
     * @param target
     * @return 
     */
    public int[] twoSum(int[] nums, int target) {

        int[] targetArr = new int[2];//array that contains the two elements that add up to the target

        Map<Integer, Integer> hash = new HashMap<>();//create a hashmap

        for (int i = 0; i < nums.length; i++) {//only looping through the array one time, so O(n) instead of O(n^2)
            
            if (hash.containsKey(nums[i])) {//if the hashmap contains the key nums at index i, then it is part of the sum, so that gets added to the final array

                targetArr[0] = i;//set i to the first num

                targetArr[1] = hash.get(nums[i]);//then get the element from the hashmap

            } else {
                hash.put(target - nums[i], i);//otherwise, take the difference of the target and the current element and store it to get layer (it follows b = c - a)
            }
        }
        return targetArr;//finally return the target array
    }

}
