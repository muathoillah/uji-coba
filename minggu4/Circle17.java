import java.util.Scanner;


public class Circle17 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int r;
        double circumference, area;

        System.out.println("input radius :");
        r = input.nextInt();
        circumference = 2*3.14*r;
        area = 3.14*r*r;
        System.out.println("this area :" + area);
        System.out.println("this circumference :" +circumference);
    }
}
