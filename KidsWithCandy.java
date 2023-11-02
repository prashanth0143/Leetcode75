class KidsWithCandy {
  public static void main(String[] args) {


    int[] candy = new int[] {2,3,5,1,3};
    int extraCandy = 3;

    List<Boolean> answer = kidCandy(candy,extraCandy);

    System.out.println(answer);
    }
    
  }


  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      //  boolean[] bool = new boolean[array.length];
       List<Boolean> bool =  new ArrayList<>();

      int length = candies.length;
      int index = 0;


      int[] temp = new int[length];
      int max =temp[0];
      for(int j : candies){
          temp[index] = j;
          if(temp[index] > max){
              max = temp[index];
          }
          index++;

      }
      for(int n : temp){
          if(n + extraCandies >= max){
              // bool[index] = true;
              bool.add(true);

          }else{
              // bool[index] = false;
              bool.add(false);
          }

          // index++;
      }

      return bool;
  }
}
