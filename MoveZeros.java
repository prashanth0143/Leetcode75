class Solution {
  public void moveZeroes(int[] nums) {
    if (nums.length <= 1) {
      return;
    }

    int onePointer = 0;
    int twoPointer = nums.length - 1;
    boolean test = false;
    // for(int i = 0; i < nums.length; i++){

    // if(nums[i] == 0 && nums[])
    // }

    while (onePointer < twoPointer) {

      if (nums[onePointer] == 0 && nums[twoPointer] != 0) {
        swap(nums, onePointer, twoPointer);
        onePointer += 1;
        twoPointer -= 1;
        test = true;
      } else if (nums[onePointer] == 0 && nums[twoPointer] == 0) {
        twoPointer -= 1;
      } else {
        onePointer += 1;
        // twoPointer+=1;

      }

    }

    // Sorting

    if (test) {
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) {
          for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] != 0) {
              if (nums[i] > nums[j]) {
                swap(nums, i, j);
              }
            }
          }
        }

      }
    }

  }

  public void swap(int[] nums, int one, int two) {
    int temp = nums[one];
    nums[one] = nums[two];
    nums[two] = temp;
  }

}