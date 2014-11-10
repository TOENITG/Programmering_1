/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortandsearch;

/**
 *
 * @author tobias
 */

import java.util.Arrays;
public class BubbleSort {
    
    static int[] theArray;
    
    static void BubbleSort(int[] arraytosort[]){    
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
        
        for(int i=0;i<100;i++){
            if (i % 10 == 0) System.out.println();
            System.out.format("%4d ",theArray[i]);
         }
        
        Arrays.sort(theArray);
        
        System.out.println();

        System.out.println();        
        for(int i=0;i<100;i++){
            if (i % 10 == 0) System.out.println();
            System.out.format("%4d ",theArray[i]);
         }
        
        
        // TODO code application logic here
    }
    
}
