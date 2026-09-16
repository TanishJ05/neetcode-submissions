class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ////////number,index/////////////////////////

        int arr[] = new int[2];

        for(int i=0;i<nums.length;i++){
            int Ans = target - nums[i];

            if(map.containsKey(Ans)){
                arr[0] = map.get(Ans);
                arr[1] = i;

                return arr;
            }

            map.put(nums[i],i);
        }

        return arr;
    }
}
