import java.util.Scanner;
public class BonusKaryawan02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan nilai kinerja karyawan dan lama bekerja
        System.out.print("Masukkan nilai kinerja karyawan (0-100): ");
        int nilaiKinerja = input.nextInt();
        System.out.print("Masukkan lama bekerja (dalam tahun): ");
        int lamaBekerja = input.nextInt(); 
        double bonus = 0;

        //status sertifikasi
        System.out.print("Apakah karyawan memiliki sertifikasi? (ya/tidak): ");
        String sertifikasi = input.next();
        
        //gaji pokok
        System.out.print("Masukkan gaji pokok karyawan: ");
        double gajiPokok = input.nextDouble();

        // Menentukan bonus berdasarkan nilai kinerja
          if (nilaiKinerja < 70) {
            bonus = 0;
        } else if (nilaiKinerja >= 70 && nilaiKinerja < 90) {
            if (lamaBekerja < 2) {
                bonus = 0.01 * gajiPokok;
            } else if (lamaBekerja < 5) {
                bonus = 0.03 * gajiPokok;
            } else {
                bonus = 0.05 * gajiPokok;
            }
        } else if (nilaiKinerja >= 90) {
            if (lamaBekerja < 2) {
                bonus = 0.02 * gajiPokok;
            } else if (lamaBekerja < 5) {
                bonus = 0.04 * gajiPokok;
            } else {
                bonus = 0.07 * gajiPokok;
            }
        }

            // Menambahkan bonus tambahan jika karyawan memiliki sertifikasi profesional
            if (sertifikasi.equalsIgnoreCase("ya")) {
                bonus += 500.000;
            }

        // Menampilkan hasil
        System.out.println("\n--- Rincian Bonus Karyawan ---");
        System.out.println("Nilai Kinerja Karyawan\t: " + nilaiKinerja);
        System.out.println("Lama Bekerja\t\t: " + lamaBekerja + " tahun");
        System.out.println("Gaji Pokok\t\t: Rp." + (int)gajiPokok);
        System.out.println("Serttifikasi\t\t: " + sertifikasi);
        System.out.println("Total Bonus\t\t: Rp." + (int)bonus);
}
}