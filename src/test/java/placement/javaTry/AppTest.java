package placement.javaTry;

import static placement.javaTry.App.isvalidUserName;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;



public class AppTest 
    extends TestCase
{ 

    public void testApp()
    {
    	String number ="";    	
        assertFalse( isvalidUserName(number));     
    }

    public void testAppComma()
    {
    	String number ="1,2";    	
        assertTrue( isvalidUserName(number));     
    }
	
    public void testManyNumberAdd()
    {
    	String number ="1,2,3,4,5";    	
        assertTrue( isvalidUserName(number));     
    }

    public void testAlphabets()
    {
    	String number ="1,2,a,c";    	
        assertTrue( isvalidUserName(number));     
    }
}
