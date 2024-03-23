package org.example;

public class MyString {
    public int indexOfString(String s1, String s2, int pos) {
        // Check for null or empty strings
        if (s1 == null || s2 == null || s1.isEmpty() || s2.isEmpty()) {
            return -1;
        }
        // Looking for the starting index larger than pos
        for (int i = pos; i <= s1.length() - s2.length(); i++) {
            boolean match = true;
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i + j) != s2.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return i;
            }
        }
        // No occurrence of s2 found
        return -1;
    };

    public String replace(String s, String s1, String s2) {

        int index = 0;

        // Find the index of the first occurrence of s1 in s
        int startIndex = indexOfString(s,s1,index);


        String prefix= s.substring(index, startIndex);
        String suffix= s.substring(startIndex + s1.length());
        // concatenating the substrings of s with s2
        return prefix + s2 + suffix;
    }

}
