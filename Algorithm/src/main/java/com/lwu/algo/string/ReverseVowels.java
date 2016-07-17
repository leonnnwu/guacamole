package com.lwu.algo.string;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by liangwu on 7/16/16.
 */
public class ReverseVowels {

    private static final Set<Character> vowels = new HashSet();

    static {
        vowels.add('a');
        vowels.add('A');
        vowels.add('e');
        vowels.add('E');
        vowels.add('i');
        vowels.add('I');
        vowels.add('o');
        vowels.add('O');
        vowels.add('u');
        vowels.add('U');
    }

    /**
     *
     * @param str
     * @return
     */
    public static String reverseVowels1(String str) {
        if(str == null || str.length() <= 1)
            return str;

        char[] strArray = str.toCharArray();

        int start = 0;
        int end = strArray.length-1;

        while(start < end) {
            if (!vowels.contains(strArray[start])){
                start++;
                continue;
            }

            if(!vowels.contains(strArray[end])) {
                end--;
                continue;
            }

                char temp = strArray[end];
                strArray[end] = strArray[start];
                strArray[start] = temp;

                start++;
                end--;
        }

        return new String(strArray);
    }
}
