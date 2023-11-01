class MergeStringBuilder {
  public static void main(String[] args) {
    //Learned string Builder becuase its efficient than StringBuffer

    String word1 = "abc";
    String word2 = "pqr";

    String answer = mergeString(word1,word2);

    System.out.println(answer);
    
  }

  public static String mergeString(String word1,String word2){
    StringBuilder build = new StringBuilder();

    char[] ch1 = word1.toCharArray();
    
    char[] ch2 = word2.toCharArray();

    int minimum = Math.min(word1.length(),word2.length());

    for(int i = 0; i < minimum; i++){
      build.append(ch1[i]);
      build.append(ch2[i]);
    }

    if(word1.length() > word2.length()){
      build.append(word1.substring(minimum));
    }
    else{
      build.append(word2.substring(minimum));
    }

    return build.toString();
  }
}
