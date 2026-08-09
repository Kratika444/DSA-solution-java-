class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> missingEle= new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int min=nums[0];
        int max= nums[n-1];
        Set<Integer> set= new HashSet<>();
        for(int ele :nums){
            set.add(ele);
        }
        for(int i=min; i<=max;i++){
            if(!(set.contains(i))){
                missingEle.add(i);
            }
        }
        return missingEle;
    }
}