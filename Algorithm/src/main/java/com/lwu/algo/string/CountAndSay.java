package com.lwu.algo.string;

/**
 * Created by lwu on 7/19/16.
 */
public class CountAndSay {

    public String countAndSay(int n) {
        String oldString = "1";

        while(--n >0) {
            StringBuilder sb = new StringBuilder();

            for(int i=0; i<oldString.length(); i++) {
                int count = 1;

                while((i+1) < oldString.length() && oldString.charAt(i) == oldString.charAt(i+1)) {
                    count++;
                    i++;
                }

                sb.append(count).append(oldString.charAt(i));
            }

            oldString = sb.toString();
        }

        return oldString;
    }
}
