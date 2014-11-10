package sortandsearch;

import java.util.Arrays;
public class BubbleSort {
    
    static int[] theArray;
    
    static void BubbleSort(int arraytosort[]){
        boolean swapped;
        int temp;
        do
        {
            // En variabel vi använder för att hålla koll på
            // om någon omflyttning har gjorts
            // Initialt sätt till "false".
            swapped = false;
            
            // Vi loopar igenom arrayen från första till näst
            // sista elementet och gör jämförelser
            for (int i=0; i < arraytosort.length-1; i++)
            {
                // Vi undersöker om elementet på position i
                // är på fel plats och byter plats om det
                // behövs.
                if(arraytosort[i]>arraytosort[i+1])
                {
                    // Temporär varabel behövs för att se till
                    // att vi inte tappar bort något av våra
                    // värden i arrayen.
                    temp = arraytosort[i];
                    arraytosort[i] = arraytosort[i+1];
                    arraytosort[i+1] = temp;
                    swapped=true;
                } 
            }
        }
        // Vi håller på så länge som några värden i vår attay
        // har bytt plats.
        while (swapped);
    }
    
    static void PrintTheArray(int[] ArraytoPrint)
    {
        for(int i=0;i<100;i++){
            if (i % 10 == 0) System.out.println();
            System.out.format("%4d ",ArraytoPrint[i]);
         }        
    }
    
    static int randomize(int maximum){ 
        return (int)(Math.random()*maximum) + 1;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        theArray = new int[100];
        for (int i=0;i<100;i++){
            theArray[i] = randomize(100);
        }
        
        PrintTheArray(theArray);
        
  //      Arrays.sort(theArray);
        BubbleSort(theArray);
        System.out.println();

        System.out.println();   
        PrintTheArray(theArray);
        
        // TODO code application logic here
    }
    
}
