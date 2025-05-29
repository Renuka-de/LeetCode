class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> comb=new ArrayList<>();
        combination(1,n,k,new ArrayList<>(),comb);
        return comb;
    }
    public void combination(int start,int stop,int size,List<Integer> nums,List<List<Integer>> result){
        if(nums.size()==size){
            result.add(new ArrayList<>(nums));
            return;
        }
        for(int i=start;i<=stop;i++){
            nums.add(i);
            combination(i+1,stop,size,nums,result);
            nums.remove(nums.size()-1);
        }
    }
}
