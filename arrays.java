package Uni;

import java.util.Arrays;

public class arrays {

    public static void main(String[] args) {
        int[] nums = new int[10]; //also works the same for others like double[] String[] etc
        nums[0] = 1; //between 0 and the length-1 (10-1 = 9 in this case) is OK for indexes, anything else is out of bounds and will give an error

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i * 2;
            System.out.println(nums[i]);
        }
        
        int[] nums2 = {4, 5, 0, 2, 1}; //quick initialization for arrays

        //you can't print out an array on its own
        //you can't use .equals or == booleans on arrays 
        //you can't resize an index using .length = int or whatever

        Arrays.sort(nums2); //sort(array) sorts an array 
        System.out.println(Arrays.toString(nums2)); //depicts an array in string 
        Arrays.fill(nums, 0); //makes every index in array the same value as entered
        System.out.println(Arrays.toString(nums));
        if(!Arrays.equals(nums, nums2)) { System.out.println("We are not the same"); } //checks if they are the same indexes in same order
        if(Arrays.equals(nums, Arrays.copyOf(nums, 10))) { System.out.println("We are the same"); } //returns a copy of array
        System.out.println(Arrays.binarySearch(nums2, 0)); //returns index of given value in a sorted array 
    }
}
