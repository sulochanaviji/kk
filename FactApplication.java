/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factapplication;

import java.util.Scanner;

/**
 *
 * @author data
 */
public class FactApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value to find its factorial");
        int a=sc.nextInt();
        int b=fact(a);
        System.out.println("The factorial of "+a+" is "+b);
    }

    private static int fact(int fact) {
        arun1.FactWebService_Service service = new arun1.FactWebService_Service();
        arun1.FactWebService port = service.getFactWebServicePort();
        return port.fact(fact);
    }
    
}

