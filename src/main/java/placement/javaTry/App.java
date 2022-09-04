package placement.javaTry;

import java.awt.List;



public class App 
{
    public static void main( String[] args )
    {
    }
    
    static public boolean isvalidUserName(String name) {
    	if(name.contentEquals("")) {
    		System.out.println("0");
    		return false;
    	}
	else {
    		String[] StringNumber = name.split(",");
       		
    		int sum=0;
    		int alphaNumber;
    		for(int i=0;i< StringNumber.length; i++){
			alphaNumber=Integer.parseInt(StringNumber[i]);
			sum=sum+alphaNumber;
		}
	}
}
