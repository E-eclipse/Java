import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите сторону a: ");
        int a = input.nextInt();
        System.out.print("Введите сторону b: ");
        int b = input.nextInt();
        System.out.print("Введите сторону c: ");
        int c = input.nextInt();

        if (a + b > c && b + c > a && c + a > b) {
            if (a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b) {
                System.out.println("a, b и c являются сторонами равностороннего треугольника");
            } else if (a == b || b == c || c == a) {
                System.out.println("a, b и c являются сторонами равнобедренного треугольника");
            } else if (a == b && b == c){
                System.out.println("a, b и c являются сторонами прямоугольного треугольника");
            } else {
                System.out.println("a, b и c являются сторонами обычного треугольника");
            }
        } else {
            System.out.println("a, b и c не являются сторонами треугольника");
        }
    }
}