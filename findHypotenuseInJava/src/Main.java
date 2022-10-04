import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("A kenarının uzunluğu giriniz: ");
        double a = input.nextDouble();
        System.out.print("B kenarının uzunluğunu giriniz: ");
        double b = input.nextDouble();


        double c = Math.sqrt((a*a) + (b*b)) ;

        System.out.println("Hipotenüs = " + c);








    }
}
