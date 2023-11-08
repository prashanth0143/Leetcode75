public class ProductArray{
  public static void main(String[] args){

    int[] arr = {1,2,3,4};

    int [] answer = ProductOfAnArray(arr);

    for(int n : answer){
      System.out.println(n + " ");
    }
  }


  public static int[] ProductOfAnArray(int[] arr){

    int len = arr.length;
    int [] answer = new int[len];

    int index =0;

    int product = 1;

    for(int i = 0; i<len; i++){

      for(int j = 0; j < len; j++){
        if(i != j){
          product *= arr[j];
          
          
        }  
      }

      arr[index] = product;
      product = 1;
      index++;

        
      }

    return answer;
    

    
  }
}