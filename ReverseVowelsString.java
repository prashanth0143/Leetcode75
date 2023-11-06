class ReverseVowelsString{
  public static void main(String[] args) {

      String s = "aeiou";

      System.out.println(reverseVowels(s));

  }

  public static String reverseVowels(String s) {
      s = s.toLowerCase();
      char[] temp= s.toCharArray();
      char[] vowels = new char[]{'a','e','i','o','u','A','E','I','O','U'};

      int index =0;
      int end = s.length() - 1;

      boolean start = false;
      boolean ending = false;


      while (index < end){
          if(!start){
              start = checkVowels(index,vowels,temp);
          }
          if(!ending){
              ending = checkVowels(end,vowels,temp);
          }



          if(start && ending){
              swap(index,end,temp);
              start = false;
              ending =false;
              index+=1;
              end-=1;
          }
          else{
              if(!start){
                  index+=1;
              }
              else if(!ending){
                  end-=1;
              }
          }

      }

      return String.valueOf(temp);

  }

  public static boolean checkVowels(int no, char [] vowel, char[] arr ){

      for(char ch : vowel){
          if(arr[no] == ch){
              return true;
          }
      }

      return false;
  }


  public static void swap(int st, int end, char[] arr){

      char ch = arr[st];
      arr[st] = arr[end];
      arr[end] = ch;

  }
}