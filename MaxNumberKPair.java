class Solution {
    public int maxOperations(int[] nums, int k) {
        int count=0;

       return recurr(nums,k,0,nums.length-1,count);
    }

    public int recurr(int[] num,  int k, int st, int end,int count){

        if(st >=  end){
            return count;
        }

        int ans = num[st] + num[end];

        if(ans == k){
            count++;
         return recurr(num,k,st+1,end-1,count);
        }

        if(num[st] < k ){
            return recurr(num,k,st,end-1,count);
        }else{
            return recurr(num,k,st+1,end-1,count);
        }




    }
}