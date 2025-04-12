// Online Java Compiler
// Use this editor to write, compile and run your Java code online

    
    
import java.util.Scanner;

class Main{
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter prod name:");
        String prodname=scanner.nextLine();
        
         System.out.println("enter prod qty:");
        int qty=scanner.nextInt();
        
         System.out.println("enter prod price:");
        double price=scanner.nextDouble();
        
        double total_price= price * qty;
            System.out.println("Total price for "+ prodname +" is " + total_price);
        if (total_price>20000){
            System.out.println("you are eligible for voucher!!:");
            
        }
        else{
            System.out.println("thank you for shopping!!:");
        }
            scanner.close();
        
    }
}
