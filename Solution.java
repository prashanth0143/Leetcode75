package org.example.leetcode75;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {


    public static void main(String[] args) {
        char[] ch = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};

        char[] ch2 = {'a','a','b','b','c','c','c'};

        char[] ch3 = {'a','a','a','b','b','a','a'};


        int answer = compress(ch3);

        System.out.println(answer);
    }


    public static int compress3(char[] chars){




        return chars.length;
    }
    public static int compress(char[] chars) {
        int answer = 0;

        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder b  = new StringBuilder();


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

//            System.out.println(map.get(key));
        }

        String s = b.toString();

        char[] a = s.toCharArray();

        System.out.println(a.length);

        chars = a;

        for(char i : chars){
            System.out.print(i + " ");
        }



        return chars.length;
    }


//    public static int compressTwo(char[] ch){
//        int answer = 0;
//        StringBuilder b = new StringBuilder();
//
//        for(char c : ch){
//            if(b.toString().indexOf(c){
//
//            }
//        }
//
//        return answer;
//    }


}