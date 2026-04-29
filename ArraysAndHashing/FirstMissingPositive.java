package ArraysAndHashing;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        //   cleaning the array eg. [1 , 3, 7, 4, 9 ] -> [1 , 3 , 6 , 4, 6]
        for(int i = 0 ; i < n; i++){
            if(nums[i] <= 0 || nums[i] > n){
                nums[i] = n + 1;
            }
        }
        // now we mark the positive numbers at particular indexes as negative. i.e number at index 3

        for(int z = 0 ; z < n; z++){
            int number = Math.abs(nums[z]);

            if(number <= n ){
                int index = number - 1;

                if(nums[index] > 0 ){
                    nums[index] = -nums[index];
                }

            }
        }


        for(int x = 0 ; x < n ; x ++){
            if(nums[x] > 0){
                return x + 1;
            }

        }

        //for an array to actually be returning the smallest of its first positive missing , then the
        //range of the number will be between 1 and n+1 eg. [7, 8 , 19 , 22] the first positive will be 1 .
        //[1 , 2, 4, 7] the first positive missing will be 3
        // [1, 4, 5, 6, 7,9]

        return n + 1;

    }
}

