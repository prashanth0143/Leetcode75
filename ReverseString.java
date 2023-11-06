package org.example.leetcode75;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {

        StringBuilder b2 =  new StringBuilder("  the sky is blue   ");

        String s = "example   good a";

        String a = s.trim();




//        String[] arr = s.split(" ");
//
//        System.out.println(arr[0]);
//
//        System.out.println(arr[0].equals(" "));
//        System.out.println("[ ");
//
//        for(String s1 : arr){
//            System.out.println(s1);
//        }
//
//        System.out.println("]");
//
//
//        System.out.println(Arrays.toString(arr) + " " + arr.length);
//
//        System.out.println(b.reverse());
        StringBuilder b = new StringBuilder();

        String[] arr = a.split(" ");

        System.out.println(Arrays.toString(arr));

        int len = arr.length;

        for(int i= len-1; i>=0; i--){

            if(!arr[i].equals("")){

                if(i == 0){
                    b.append(arr[i]);
                }else {
                    b.append(arr[i] + " ");
                }
            }



            }

        System.out.println("[ ");
        System.out.println(b);
        System.out.println(b.toString().length());
        System.out.println("]");

    }
}
