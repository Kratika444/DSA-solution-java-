class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        int left=0;
        int eq=0;
        for(int ele: nums){
            if(ele < target) left++;
            else if(ele == target) eq++;
        }
        List<Integer> res= new ArrayList<>();
        for(int i=0;i<eq;i++){
            res.add(left + i);
        }
        return res;
    }
}