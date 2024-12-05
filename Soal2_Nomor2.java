import java.util.Scanner;

public class Soal2_Nomor2 {

    public static double hitungLuasPermukaan(double r) {
        double pi = 3.14159;  
        return 4 * pi * r * r; 
    }

    public static double hitungLuasLingkaran(double r) {
        double pi = 3.14159;
        return pi * r * r;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        boolean valid = false;  

        while (!valid) {
            System.out.print("Masukkan jari-jari bola: ");
            radius = input.nextDouble();

            if (radius <= 0) {
                System.out.println("Jari-jari harus lebih besar dari nol.");
                System.out.print("Apakah Anda ingin mencoba lagi? (y/g): ");
                char pilihan = input.next().charAt(0);

                if (pilihan == 'g' || pilihan == 'G') {
                    System.out.println("Program selesai. Terima kasih!");
                    valid = true;
                }
            } else {
                System.out.println("\n--- Perhitungan Luas Permukaan Bola ---");
                double luasPermukaan = hitungLuasPermukaan(radius);
                System.out.println("Luas permukaan bola dengan jari-jari " + radius + " adalah: " + luasPermukaan);

                System.out.println("\n--- Perhitungan Luas Lingkaran ---");
                double luasLingkaran = hitungLuasLingkaran(radius);
                System.out.println("Luas lingkaran dengan jari-jari " + radius + " adalah: " + luasLingkaran);

                valid = true;
            }
        }

        input.close();
    }
}



