/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.test;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;

/**
 *
 * @author William
 */
public class ApplicationTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String entrada = "";
        System.out.println("Hello World");
        entrada = reader.readLine();
        System.out.println(entrada);
    }
    
}
