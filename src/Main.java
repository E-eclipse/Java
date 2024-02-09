import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double Earth_R = 6371;

        System.out.println("Калькулятор расстояния между координатами");

        double Shir1, Dolg1, Shir2, Dolg2;

        System.out.println("Введите широту и долготу первой координаты: ");
        Shir1 = scan.nextDouble();
        Dolg1 = scan.nextDouble();
        System.out.println();

        System.out.println("Введите широту и долготу второй координаты: ");
        Shir2 = scan.nextDouble();
        Dolg2 = scan.nextDouble();
        System.out.println();

        double Earth_Radius = 6371;

        Shir1 = Math.toRadians(Shir1);
        Dolg1 = Math.toRadians(Dolg1);
        Shir2 = Math.toRadians(Shir2);
        Dolg2 = Math.toRadians(Dolg2);

        double a = Shir2 - Shir1;
        double b = Dolg2 - Dolg1;

        double SinA = Math.sin(a / 2);
        double SinB = Math.sin(b / 2);
        double CosA = Math.cos(Shir1);
        double CosB = Math.cos(Shir2);

        double q = SinA * SinA + CosA * CosA * SinB * SinB;

        double CentralAngle = 2 * Math.atan2(Math.sqrt(q), Math.sqrt(1 - q));

        double distance = Earth_Radius * CentralAngle;

        System.out.println(distance);
    }
}