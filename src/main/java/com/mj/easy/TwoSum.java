package com.mj.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] solution(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        if (nums.length < 1){
            return new int[]{};
        }
        for (int i = 0; i < nums.length; i++) {
            Integer key = nums[i];
            Integer valueIndex = map.get(target-key);
            if(valueIndex == null){
                map.put(key,i);
            }else{
                return new int[]{valueIndex,i};
            }
        }
        return new int[]{};
    }

}
