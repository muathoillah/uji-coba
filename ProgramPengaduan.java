import java.util.ArrayList;
import java.util.Scanner;

class Pengaduan {
    private String namaPengirim;
    private String isiPengaduan;

    public Pengaduan(String namaPengirim, String isiPengaduan) {
        this.namaPengirim = namaPengirim;
        this.isiPengaduan = isiPengaduan;
    }

    public String getNamaPengirim() {
        return namaPengirim;
    }

    public String getIsiPengaduan() {
        return isiPengaduan;
    }
}

public class ProgramPengaduan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pengaduan> daftarPengaduan = new ArrayList<>();

        while (true) {
            System.out.println("Selamat datang di Program Pengaduan");
            System.out.println("1. Kirim Pengaduan");
            System.out.println("2. Lihat Pengaduan");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1/2/3): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membuang karakter newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama Anda: ");
                    String namaPengirim = scanner.nextLine();
                    System.out.print("Masukkan isi pengaduan Anda: ");
                    String isiPengaduan = scanner.nextLine();

                    Pengaduan pengaduanBaru = new Pengaduan(namaPengirim, isiPengaduan);
                    daftarPengaduan.add(pengaduanBaru);
                    System.out.println("Pengaduan Anda telah berhasil dikirim.");
                    break;
                case 2:
                    System.out.println("Daftar Pengaduan:");
                    for (Pengaduan pengaduanItem : daftarPengaduan) {
                        System.out.println("Pengirim: " + pengaduanItem.getNamaPengirim());
                        System.out.println("Pengaduan: " + pengaduanItem.getIsiPengaduan());
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan Program Pengaduan.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang sesuai.");
            }
        }
    }
}
