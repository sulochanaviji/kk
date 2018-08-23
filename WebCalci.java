/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webcalci;

import java.util.Scanner;

/**
 *
 * @author data
 */
public class WebCalci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,b,c,choice;
        System.out.println("Enter the 1st number");
        b=sc.nextInt();
        System.out.println("Enter the 2nd number");
        c=sc.nextInt();
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter your choice");
        choice=sc.nextInt();
        switch(choice){
            case 1:a=add(b,c);
            System.out.println("The addition of "+b+" and "+c+" is "+a);
            break;
            case 2:a=sub(b,c);
            System.out.println("The subtraction of "+b+" and "+c+" is "+a);
            break;
            case 3:a=mul(b,c);
            System.out.println("The multiplication of "+b+" and "+c+" is "+a);
            break;
            case 4:a=div(b,c);
            System.out.println("The division of "+b+" and "+c+" is "+a);
            break;
            default:System.out.println("Please enter the correct operation");
        }
    }

    private static int sub(int i, int j) {
        arun.CalculatorService_Service service = new arun.CalculatorService_Service();
        arun.CalculatorService port = service.getCalculatorServicePort();
        return port.sub(i, j);
    }

    private static int add(int i, int j) {
        arun.CalculatorService_Service service = new arun.CalculatorService_Service();
        arun.CalculatorService port = service.getCalculatorServicePort();
        return port.add(i, j);
    }

    private static int mul(int i, int j) {
        arun.CalculatorService_Service service = new arun.CalculatorService_Service();
        arun.CalculatorService port = service.getCalculatorServicePort();
        return port.mul(i, j);
    }

    private static int div(int i, int j) {
        arun.CalculatorService_Service service = new arun.CalculatorService_Service();
        arun.CalculatorService port = service.getCalculatorServicePort();
        return port.div(i, j);
    }
}
