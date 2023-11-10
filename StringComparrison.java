import java.util.Collection;
import java.util.HashMap;
class Solution {
    public int compress(char[] chars) {
        StringBuilder b = new StringBuilder();
        HashMap<Character,Integer> map = new HashMap<>();

        if(chars.length <=1){
            return 1;
        }


        for(char a : chars){

            if(map.containsKey(a)){
                int val = map.get(a);
                map.put(a,++val);
            }else{
                map.put(a,1);
            }
        }


        Set<Character> ket = map.keySet();

        Collection<Integer> values = map.values();

        for(char key : ket){
            b.append(key);
            if(map.get(key) > 1){
                b.append(map.get(key));
            }
        }

        char[] answer = b.toString().toCharArray();

        for(int i = 0; i<answer.length; i++){
            chars[i] = answer[i];
        }

        return answer.length;
    }
}