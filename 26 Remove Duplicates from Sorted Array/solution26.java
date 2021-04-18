class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 1;
		
		//check elements that are next to eachother
        for(int i = 0; i < nums.length -1; i++) {
			
			//if adjacent elements are not the same
            if(nums[i] != nums[i + 1]) {
				
				//prevent overwriting
                nums[index++] = nums[i + 1];
            }
        }
        return index;
    }
}