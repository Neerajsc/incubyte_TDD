package placement.javaTry;

import java.awt.List;



public class App 
{
    public static void main( String[] args )
    {
    }
    
    static public boolean isvalidUserName(String name) {
	try{
    		if(name.contentEquals("")) {
    			System.out.println("0");
    			return false;
    		}
		else {
    			String[] StringNumber = name.split(",|\n");
       		
    			int sum=0;
    			int alphaNumber;
    			for(int i=0;i< StringNumber.length; i++){
				try{
				
					char letter= StringNumber[i].charAt(0);
    					if(letter>='a' && letter<= 'z') {
    						alphaNumber= (int)letter - 'a'+1;
    						sum=sum+alphaNumber;
    					}
	
					else{
    						alphaNumber=Integer.parseInt(StringNumber[i]);
						
						if(alphaNumber >1000) {
    							alphaNumber=0;
    						}
						
						else if(alphaNumber<0) {
							System.out.println("Negative no is "+alphaNumber+" \n");
    							throw new Exception("Negatives not allowed");
    						}
	
						sum=sum+alphaNumber;  
    					}
				}
				catch(Exception e){
					System.out.print(e+"\n");
				}	
			}
			System.out.println(sum);
			return true;
		}
	}
	catch(Exception e){
		System.out.println(e);
    		return true;
	}
}
