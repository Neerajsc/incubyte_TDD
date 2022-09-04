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
}
