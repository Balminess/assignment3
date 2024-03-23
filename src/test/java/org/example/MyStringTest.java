package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyStringTest  {
//    @Spy
    @Test
    public void testIndexOfString() {
        MyString myString = new MyString();
        int result = myString.indexOfString("abcdabad","a",0);
        assertEquals(0,result);
        result = myString.indexOfString("abcdabad","a",1);
        assertEquals(4,result);
    }
}