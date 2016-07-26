package com.lwu.algo.string;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

 If the last word does not exist, return 0.

 Note: A word is defined as a character sequence consists of non-space characters only.

 For example,
 Given s = "Hello World",
 return 5.
 */
public class LengthOfLastWord {

    private static final String WHITE_SPACE = " ";

    /**
     * Use java String.split to get the array of words
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }

        if(s.indexOf(WHITE_SPACE) == -1) {
            return s.length();
        }

        String[] strArr = s.split(WHITE_SPACE);
        return strArr.length == 0? 0 :strArr[strArr.length-1].length();
    }

    /**
     * Use for loop to get the last word
     * @param s
     * @return
     */
    public int lengthOfLastWord2(String s) {

        if(s == null || s.length() == 0) {
            return 0;
        }

        int len = s.length();
        int result = 0;

        boolean flag = false;
        for(int i=len-1; i>=0; i--) {
            char c = s.charAt(i);

            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                flag = true;
                result++;
            }else if(flag) {
                return result;
            }
        }

        return result;
    }
}
