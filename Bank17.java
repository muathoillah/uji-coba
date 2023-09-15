import java.util.Scanner;

public class Bank17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int init_sav_mount, sav_priod;
        double final_save, interst, interst_persen = 0.02;
        
        System.out.println("save mount:");
        init_sav_mount=sc.nextInt();
        System.out.println("save priode:");
        sav_priod=sc.nextInt();
        interst = init_sav_mount*interst_persen*sav_priod;
        final_save= interst+ init_sav_mount;
        System.out.println("INTEREST"+ interst);
        System.out.println("final save"+ final_save);
    }
}