
class ThreeIndices {
    public boolean increasingTriplet(int[] nums) {
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(i +1 < nums.length ){
                if(nums[i] < nums[i+1]){
                    count++;
                }else{
                    count = 0;

                }
            }

            if(count >= 2 ){
                return true;
            }
        }

        return false;
    }
}