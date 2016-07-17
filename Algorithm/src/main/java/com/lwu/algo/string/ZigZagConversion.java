package com.lwu.algo.string;

/**
 * Created by liangwu on 7/16/16.
 */
public class ZigZagConversion {

    public static String convert(String text, int nRows) {
        if(text == null || text.length() <= 1 || nRows <= 1)
            return text;

        StringBuilder result = new StringBuilder();
        char[] textArray = text.toCharArray();

        for(int i=0;i<nRows;i++) {
            for(int j=0, index=i; index<textArray.length; j++, index=(2*nRows-2)*j+i) {
                //Add red element
                result.append(textArray[index]);

                //Add green element
                if(i==0 || i== nRows -1) {
                    continue;
                }

                if((index+(nRows-i-1)*2) < textArray.length) {
                    result.append(textArray[index+(nRows-i-1)*2]);
                }
            }
        }

        return result.toString();
    }
}
