class CanPlaceFlower{
  public static void main(String[] args){
    int[] arr  = new int[]{1,0,0,0,1};
    int n = 1;

    boolean answer = canPlaceFlower(arr,n);

    System.out.println(answer);

    
  }

  static boolean canPlaceFlower(int [] arr, int n){

    int count = 0;
    int len = arr.length;
    int index = 0;
    for(int x : arr){
      if(index < len){
        if(index >=0 && arr[index] == 1){
          index+=2;
        }
        else if(index >=0 && arr[index] == 0){
          if(index == 0 && arr[index +1] != 1){
            count++;
            index+=2;
          }else{
            index+=1;
          }
        }
          else if(arr[index-1] !=1 && arr[index+1] !=1){
            count++;
            index+=2;
          }else{
            index+=1;
          }
        }else{
          break;
        }
      }

    if(count >= n){
      return true;
      
    }

       return false;
      
      
    }
  
}