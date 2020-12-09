//Time Complexity: O(N) -> Traversing through the whole array
//Space Complexity:O(N) - Using HashMap of size of array

class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums==null || nums.length==0){
            return new int[]{};
        }
        
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0 ; i < nums.length ; i++){
            if(!hmap.containsKey(nums[i])){
                hmap.put(target - nums[i], i);
            }else{
                result[0] = hmap.get(nums[i]);
                result[1] = i;
            }
        }
        return result;
    }
}
