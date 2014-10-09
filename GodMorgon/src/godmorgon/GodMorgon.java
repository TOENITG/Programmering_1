/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package godmorgon;

import java.util.Scanner;

/**
 *
 * @author tobias
 */
public class GodMorgon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("God morgon!");
        int klockan = 10;
        float flyttal = 3/2;
        boolean sant = true;
        String namn = "Tobias";
        
        System.out.println("namn = "+ namn);
        
        Scanner user_input = new Scanner( System.in );        
        System.out.print("Skriv nå't! :");
        String first_name;
        first_name = user_input.next( );
        System.out.println("Du skrev: " + first_name);
    }
}
