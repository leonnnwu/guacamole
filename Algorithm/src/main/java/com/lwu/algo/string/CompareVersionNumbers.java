package com.lwu.algo.string;

/**
 * Compare two version numbers version1 and version2.
 If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

 You may assume that the version strings are non-empty and contain only digits and the . character.
 The . character does not represent a decimal point and is used to separate number sequences.
 For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

 Here is an example of version numbers ordering:
 0.1 < 1.1 < 1.2 < 13.37
 */
public class CompareVersionNumbers {

    public int compareVersion(String version1, String version2) {
        long[] numsOfVersion1 = convertVersionToNumbers(version1);
        long[] numsOfVersion2 = convertVersionToNumbers(version2);
        int minLength = Math.min(numsOfVersion1.length, numsOfVersion2.length);
        int maxLength = Math.max(numsOfVersion1.length, numsOfVersion2.length);

        for(int i=0; i<minLength; i++) {
            if(numsOfVersion1[i] != numsOfVersion2[i]) {
                return numsOfVersion1[i] > numsOfVersion2[i] ? 1 : -1;
            }
        }

        if(minLength == maxLength) {
            return 0;
        }

        if(maxLength == numsOfVersion1.length) {
            for(int i=minLength; i<maxLength; i++) {
                if(numsOfVersion1[i] > 0) {
                    return 1;
                }
            }
        }else {
            for(int i=minLength; i<maxLength; i++) {
                if(numsOfVersion2[i] > 0) {
                    return -1;
                }
            }
        }



        return 0;
    }

    private long[] convertVersionToNumbers(String version) {
        String[] numsOfVersion = version.split("\\.");
        long[] nums = new long[numsOfVersion.length];
        for(int i=0; i<numsOfVersion.length; i++) {
            nums[i] = Long.parseLong(numsOfVersion[i]);
        }
        return nums;
    }

    public int compareVersion2(String version1, String version2) {
        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");

        int i=0;
        while(i<arr1.length || i<arr2.length) {
            if(i<arr1.length && i<arr2.length) {
                if(Integer.parseInt(arr1[i]) > Integer.parseInt(arr2[i])) {
                    return 1;
                } else if(Integer.parseInt(arr1[i]) < Integer.parseInt(arr2[i])) {
                    return -1;
                }
            } else if(i<arr1.length) {
                if(Integer.parseInt(arr1[i]) > 0) {
                    return 1;
                }
            } else {
                if(Integer.parseInt(arr2[i]) > 0) {
                    return -1;
                }
            }
            i++;
        }

        return 0;
    }

}
