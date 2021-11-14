package com.codechef;

public class Main {

    public static void main(String[] args) {
	int[] nums = {3,5,1,4,2,3};
	int ans = findDuplicate(nums);
        System.out.println(ans);
    }
    static int findDuplicate(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct = nums[i] -1;
            if(nums[i]!= i+1){
                if(nums[i]!=nums[correct]){
                    swap(nums,i,correct);
                }
                else{
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }
    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
