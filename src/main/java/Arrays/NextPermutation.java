/*
Next Permutation Problem.
========================================================================================================================
A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory.

Example 1:
Input: nums = [1,2,3]
Output: [1,3,2]

Example 2:
Input: nums = [3,2,1]
Output: [1,2,3]

Example 3:
Input: nums = [1,1,5]
Output: [1,5,1]
========================================================================================================================
*/

package Arrays;


public class NextPermutation {
    public static void main(String[] args) {
        int arr[] = {3,2,1};
        findNextPermutation(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void findNextPermutation(int[] arr) {
        int size = arr.length;
        int k = size-2;

        if(size==0){
            return;
        }
        for (int i = size-1; i > 0; i--) {
            if(arr[i]<=arr[i-1]){
                k--;
            }else{
                break;
            }
        }
        if(k==-1){
            reverseArray(arr,k+1,size-1);
            return;
        }else{
            for(int i=size-1;i>0;i--){
                if(arr[k]<arr[i]){
                    int temp = arr[k];
                    arr[k] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }
        }
        reverseArray(arr,k+1,arr.length-1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}





























