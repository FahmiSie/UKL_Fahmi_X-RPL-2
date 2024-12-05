import java.util.Scanner;

public class Soal1_Nomor_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Masukkan total belanja Anda: Rp");
        double totalBelanja = scanner.nextDouble();

        
        System.out.print("Apakah Anda member? (y/g): ");
        String member = scanner.next().toLowerCase();

       
        double diskon = (member.equals("y") && totalBelanja >= 100000 && totalBelanja <= 200000) ? 0.1
                : (member.equals("y") && totalBelanja > 200000) ? 0.2
                        : 0;

      
        double totalBayar = totalBelanja - (totalBelanja * diskon);

       
        System.out.println("\n--- Rincian Belanja ---");
        System.out.println("Total Belanja : Rp" + totalBelanja);
        System.out.println("Status Member : " + (member.equals("y") ? "Member" : "Bukan Member"));
        System.out.println("Diskon        : " + (diskon * 100) + "%");
        System.out.println("Total Bayar   : Rp" + totalBayar);

        scanner.close();
    }
}

