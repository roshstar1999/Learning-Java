import java.util.Random;

class Main{
    public static void main(String[] args){
        Random random=new Random();
        
        int num1=random.nextInt(1,7);
        int num2=random.nextInt(1,7);
        int num3=random.nextInt(1,7);
        System.out.println(num1 +" " + num2 + " "+ num3 );
        double n3=random.nextDouble();
        System.out.println("random.nextDouble() :" + n3);
        boolean n4=random.nextBoolean();
        System.out.println("random.nextBoolean() :" + n4);
    }      
    
}
