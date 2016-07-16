package com.lwu.algo.string;

public class ReverseString {

    /**
     * Array.
     * Time complexity: O(n)
     * @param str
     * @return
     */
    public static String reverse1(String str) {
        if(str == null || str.length() <= 1) {
            return str;
        }

        char[] strArray = str.toCharArray();

        StringBuilder reverseHolder = new StringBuilder();

        for(int i=strArray.length-1; i>=0; i--) {
            reverseHolder.append(strArray[i]);
        }

        return reverseHolder.toString();
    }

    /**
     * Build-in method of StringBuilder
     * @param str
     * @return
     */
    public static String reverse2(String str) {
        if(str == null)
            return str;

        StringBuilder reverseHolder = new StringBuilder();
        reverseHolder.append(str);
        reverseHolder.reverse();
        return reverseHolder.toString();
    }

    /**
     * Two index to loop the array
     * O(n/2)
     * @param str
     * @return
     */
    public static String reverse3(String str) {
        if(str==null || str.length() <= 1) {
            return str;
        }

        char[] strArray = str.toCharArray();
        int start = 0;
        int end = str.length()-1;

        while(start<end) {
            char temp = strArray[end];
            strArray[end] = strArray[start];
            strArray[start] = temp;
            start++;
            end--;
        }

        return new String(strArray);
    }
}
