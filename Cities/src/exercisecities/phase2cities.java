package exercisecities;
import java.util.Arrays;
import java.util.Scanner;

public class phase2cities {

    public static void main(String[] args) 
    {
        String temp;
         
        String arrayCities[] = new String[5];
        Scanner scan2 = new Scanner(System.in);
         
        System.out.println("Enter the cities one by one:");
        for(int i = 0; i < 5; i++)
        {
            arrayCities[i] = scan2.nextLine();
        }
        scan2.close();
        
         
        for (int i = 0; i <5; i++) 
        {
            for (int j = i + 1; j <5; j++) 
            { 
                if (arrayCities[i].compareTo(arrayCities[j]) > 0) 
                {
                    temp = arrayCities[i];
                    arrayCities[i] = arrayCities[j];
                    arrayCities[j] = temp;
                }
            }
        }
         
        System.out.print("Cities in Sorted Order: " + Arrays.toString(arrayCities));
    }
}
