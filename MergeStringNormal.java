class Main {
  public static void main(String[] args) {
    String name = "abc";
    String name2 = "pqr";


    System.out.println(name.compareTo(name2));

    //Merge String alternately;

    String answer = mergeString(name, name2);

    System.out.println(answer);

    

    
  }

  public static String mergeString(String name, String name2){
    String ans = " " ;
    char[] ch = name.toCharArray();
    char[] ch1 = name2.toCharArray();

    if(name.length() == name2.length()){
      for(int i=0; i < name.length(); i++){
        ans+=ch[i];
        ans+=ch1[i];
      }
    }

    if(name.length() != name2.length()){
      if(name.length() > name2.length()){
        for(int i=0; i < name.length(); i++){
          ans+=ch[i];
          if(i < name2.length() ){
            ans+=ch1[i];
          }
          
        }
        
      }
      else{
        if(name.length() < name2.length()){
          for(int i=0; i < name2.length(); i++){
            if(i < name.length()){
              ans+=ch[i];
            }
             ans+=ch1[i];
            
      }
    }
      }
    }


    return ans;
    
  }
      
}