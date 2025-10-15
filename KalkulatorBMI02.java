import java.util.Scanner;
public class KalkulatorBMI02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan berat dan tinggi badan
        System.out.print("Masukkan berat badan (kg): ");
        double berat = input.nextDouble();
        System.out.print("Masukkan tinggi badan (m): ");
        double tinggi = input.nextDouble();

        // Menghitung BMI
        double bmi = berat / (tinggi * tinggi);
        System.out.printf("Indeks Massa Tubuh (BMI) Anda: %.2f\n    ", bmi);

        // Menentukan kategori BMI dan risiko kesehatan
        if (bmi < 18.5) {
            System.out.println("Kategori : Kekurangan Berat Badan(Underweight)");
            System.out.println("Risiko kesehatan :Kekurangan gizi, osteoporosis, penurunan sistem kekebalan tubuh.");
        } else if (bmi <= 18.5 && bmi < 25) {
            System.out.println("Kategori  : Berat Badan Normal (Normal weight)");
            System.out.println("Risiko kesehatan : Relatif Rendah.");
        } else if (bmi <= 25 && bmi < 30) {
            System.out.println("Kategori: Kelebihan Berat Badan(Overweight) -");
            System.out.println("Risiko kesehatan : Meningkatnya risiko penyakit jantung,diabetes,tekanan darah tinggi.");
        } else if (bmi >= 30) {
            System.out.println("Kategori : Obesitas(Obese) ");
            System.out.println("Risiko kesehatan : Risiko Tinggi penyakit jantung, diabetes, tekanan darah tinggi,masalah pernapasan dan beberapa jenis kanker.");
        }



        
    }
}
