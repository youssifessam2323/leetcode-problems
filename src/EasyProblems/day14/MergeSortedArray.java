package EasyProblems.day14;

import java.util.Arrays;
/**
 *  PROBLEM LINK: https://leetcode.com/explore/interview/card/top-interview-questions-easy/96/sorting-and-searching/587/
 *  STATUS: ACC
 *  HELP ? YES
 *  NUM OF SUBMISSIONS ? 1
 *  TRICK LEARNED FROM IT? how to solve a problem and take care of edge cases 
 */


public class MergeSortedArray {
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(m >= nums1.length) return;
          
        int k = nums1.length - 1, i = m-1, j = n-1;
        
        while(i >=0 && j >=0){
            if(nums1[i] >= nums2[j]){
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j]; 
                j--;
            } 
            k--;
       }
        
       if(i >= 0){
           while(i >= 0 ){
                nums1[k] = nums1[i];
                i--; 
                k--;
           }
       } 
        
       if(j >= 0){
           while(j >= 0 ){
                nums1[k] = nums2[j];
                j--; 
                k--;
           }
       } 
    }


    public static void main(String[] args) {
        MergeSortedArray demo = new MergeSortedArray();
        // int[] arr1 = {4,0,0,0,0,0};
        // int[] arr2 = {1,2,3,5,6};
        // int[] arr1 = {1,2,3,0,0,0};
        // int[] arr2 = {2,5,6};
        // int[] arr1 = {0};
        // int[] arr2 = {1};
        int[] arr1 = {1};
        int[] arr2 = {};

        int m = 1;
        int n = 0;
        demo.merge(arr1, m, arr2, n);
        Arrays.stream(arr1).forEach(System.out::print);
    }
}
