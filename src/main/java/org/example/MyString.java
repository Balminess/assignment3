package org.example;

public class MyString {
    public int indexOfString(String s1, String s2, int pos) {
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
}
