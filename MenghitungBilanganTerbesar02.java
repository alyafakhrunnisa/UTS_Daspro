import java.util.Scanner;
public class MenghitungBilanganTerbesar02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = 0;
        
        //memasukkan bilangan   
        System.out.print("Masukkan angka pertama : ");
        int angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua   : ");
        int angka2 = input.nextInt();
        System.out.print("Masukkan angka ketiga  : ");
        int angka3 = input.nextInt();

        //menghitung bilangan terbesar
        if (angka1 >= angka2 && angka1 >= angka3) {
            angka = angka1;
        } else if (angka2 >= angka1 && angka2 >= angka3) {
            angka = angka2;
        } else {
            angka = angka3;
        }
        System.out.println("Bilangan terbesar adalah " + angka);
        input.close();

        // Memeriksa kasus di mana ada dua atau lebih angka yang sama dengan nilai terbesar
        if ((angka1 == angka2 && angka1 > angka3) || (angka1 == angka3 && angka1 > angka2) || (angka2 == angka3 && angka2 > angka1)) {
            System.out.println("Terdapat dua atau lebih bilangan yang sama sebagai bilangan terbesar, Yaitu " + angka);
        } else if (angka1 == angka2 && angka1 == angka3) {
            System.out.println("Ketiga bilangan sama.");   
        
        
}
}
}

