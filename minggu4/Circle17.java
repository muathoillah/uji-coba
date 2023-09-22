import java.util.Scanner;


public class Circle17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r;
        double circumference, area;

        System.out.println("input radius :");
        r = sc.nextInt();
        circumference = 2*3.14*r;
        area = 2*r*r;
        System.out.println("this area :" + area);
        System.out.println("this circumference :" +circumference);
    }
}
