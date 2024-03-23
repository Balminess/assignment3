package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyStringTest  {
    @Test
    public void testIndexOfString() {
        MyString myString = new MyString();
        int result = myString.indexOfString("abcdabad","a",0);
        assertEquals(0,result);
        result = myString.indexOfString("abcdabad","a",1);
        assertEquals(4,result);
        //check for null or empty input
        result =myString.indexOfString(null,"e",1);
        assertEquals(-1,result);
        result = myString.indexOfString("abcdabad",null,1);
        assertEquals(-1,result);
        result =myString.indexOfString("abcdabad","",1);
        assertEquals(-1,result);
        result = myString.indexOfString("","e",1);
        assertEquals(-1,result);
        //check when length of s2 larger than s1
        result = myString.indexOfString("ab","abcde",1);
        assertEquals(-1,result);
    }
    @Test
    public void testReplace() {
        MyString myString = new MyString();

        String result = myString.replace("abcdad", "bc", "e");
        assertEquals("aedad", result);
        result = myString.replace("abcdabcd", "bc", "e");
        assertEquals("aedaed", result);


    }


}