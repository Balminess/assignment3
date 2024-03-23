package org.example;
import org.junit.Test;
import org.mockito.stubbing.Answer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class MyStringTest {
    @Test
    public void testIndexOfString() {
        MyString myString = new MyString();
        int result = myString.indexOfString("abcdabad", "a", 0);
        assertEquals(0, result);
        result = myString.indexOfString("abcdabad", "a", 1);
        assertEquals(4, result);
        //check for null or empty input
        result = myString.indexOfString(null, "e", 1);
        assertEquals(-1, result);
        result = myString.indexOfString("abcdabad", null, 1);
        assertEquals(-1, result);
        result = myString.indexOfString("abcdabad", "", 1);
        assertEquals(-1, result);
        result = myString.indexOfString("", "e", 1);
        assertEquals(-1, result);
        //check when length of s2 larger than s1
        result = myString.indexOfString("ab", "abcde", 1);
        assertEquals(-1, result);
    }

    @Test
    public void testReplace() {
        MyString myString = new MyString();

        String result = myString.replace("abcdad", "bc", "e");
        assertEquals("aedad", result);
        result = myString.replace("abcdabcd", "bc", "e");
        assertEquals("aedaed", result);

        result = myString.replace(null, "bcd", "cde");
        assertNull(result);
        result = myString.replace("abc", null, "cde");
        assertNull(result);
        result = myString.replace("abc", "bcd", null);
        assertNull(result);
    }
}