public class Array11 {
    public int array11(int[] nums, int index){ //Create a method name

        if (index == nums.length) { //Base Case
            return 0;
        }

        if(nums[index] == 11){ //Checking the current element using nums[index]
            return 1 + array11(nums,index +1);
        }
        else{
            return array11(nums,index + 1);
        }

    }

}
