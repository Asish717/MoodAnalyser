package com.java;

import org.junit.Assert;
import org.junit.Test;

public class JunitDemoAssertions {
    @Test
    public void testAssert(){
        //variables
        String string1="dash";
        String string2="dash";
        int num1=7;
        int num2=77;
        String string3=null;
        int[] arr1={1,2,3};
        int[] arr2={1,2,3};
        Object obj1=new Object();
        Object obj2=new Object();

        //assert statements
        Assert.assertEquals(string1,string2);
       // Assert.assertSame(obj1,obj2);
        Assert.assertSame(string1,string2);
        Assert.assertTrue(num1<num2);
        Assert.assertArrayEquals(arr2,arr1);
    }
}
