import java.io.Console;
import java.util.Scanner;





public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı:");
        double sayi=input.nextInt();

        for(int i=1;i<=sayi;i++)
        {
            double sayi1 = Math.pow(4,i);
            double sayi2= Math.pow(5,i);
            System.out.println((int)sayi1+"\n"+(int)sayi2);


        }





    }
}
