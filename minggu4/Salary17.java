import java.util.Scanner;

public class Salary17 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        int numAttendence, numAbsense, totalSalary;
        int Salary=4000, SalaryDeduction=2500;
        System.out.println("input number attendence:");
        numAttendence= input.nextInt();
        System.out.println("input absence number :");
        numAbsense = input.nextInt();

        totalSalary=(numAttendence*Salary)-(numAbsense*SalaryDeduction);
        System.out.println("total salary"+ totalSalary);

    }
}
