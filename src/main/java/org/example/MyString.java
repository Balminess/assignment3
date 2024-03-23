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
        // Check if any of the strings is null
        if (s == null || s1 == null || s2 == null)
            return null;

        // Initialize the starting index
        int index = 0;
        StringBuilder result= new StringBuilder();
        // Find the index of the first occurrence of s1 starting from the current position
        int startIndex = indexOfString(s,s1, index);
        // Concatenate the substrings
        while (startIndex != -1) {
            result.append(s, index, startIndex).append(s2);
            // Move the index after the occurrence of s1
            index = startIndex + s1.length();
            // Find the next occurrence of s1
            startIndex = indexOfString(s,s1, index);
        }
        // Concatenate the remaining substring
        return result.append(s.substring(index)).toString();
        }
    }
