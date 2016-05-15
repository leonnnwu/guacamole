package com.lwu.algo.string;

/**
 * Write a method to replace all spaces in a string with %20.
 * The string is given in a characters array, you can assume it has enough space for replacement and
 * you are given the true length of the string.
 * You code should also return the new length of the string after replacement.
 */
public class SpaceReplacement {

    /**
     *
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public int replaceBlank(char[] string, int length) {
        if(length == 0) {
            return 0;
        }

        int numOfBlank = 0;

        for(int i=0; i<length; i++) {
            if(string[i] == ' ') {
                numOfBlank++;
            }
        }

        int newLen = length + numOfBlank*2;
        int indexFromEnd = 1;
        for(int i=length-1; i>=0; i--) {
            if(string[i] != ' ') {
                string[newLen - indexFromEnd] = string[i];
                indexFromEnd++;
            }else {
                string[newLen - indexFromEnd] = '0';
                indexFromEnd++;

                string[newLen - indexFromEnd] = '2';
                indexFromEnd++;

                string[newLen - indexFromEnd] = '%';
                indexFromEnd++;
            }
        }

        return newLen;
    }
}
