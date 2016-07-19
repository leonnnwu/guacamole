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

        long[] longerVersion = maxLength == numsOfVersion1.length ? numsOfVersion1 : numsOfVersion2;

        for(int i=minLength; i<maxLength; i++) {
            if(longerVersion[i] > 0) {
                return 1;
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

}
