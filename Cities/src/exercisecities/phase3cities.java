package exercisecities;

import java.util.Arrays;
import java.util.Scanner;

public class phase3cities {
	
    public static void main(String args[]) 
    { 
    	Scanner sc=new Scanner(System.in);
		String city= sc.nextLine();
		sc.close();
    	
        for (int i=0;i<city.length(); i++) {
        	char ch = city.charAt(i);
        
        	if(Character.toString(ch).matches("a")) {
            
        		int newChar= 4;
        		city= city.substring(0, (i))
        		+ newChar
        		+ city.substring((i)+1); 
            
        	}
        
        	else {
        	}
        	
        	System.out.print(city);{
        		
        	}
        	
        	String[] newCities = new String[]{"B4rcelon4", "M4drid", "V4lenci4", "M4l4g4", "C4dis", "S4nt4nd4r"};	
           
            Arrays.sort(newCities);
            	for(int j = 0; j < newCities.length; j++)
            		System.out.println(newCities[j]);
            
        }
        
      }
   }
