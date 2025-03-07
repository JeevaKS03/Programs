import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double radius;
        double circumference;
        double area;
        double volume;
        System.out.print("Enter the Radius: ");
        radius = scanner.nextDouble();
        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius,2);
        volume = ((double) 4 /3) * Math.PI * Math.pow(radius,3);
        System.out.println("The Circumference is: " + circumference + "cm" );
        System.out.println("The Area is: " + area + "cm²");
        System.out.println("The Volume is: " + volume + "cm³");
        scanner.close();
    }
}

