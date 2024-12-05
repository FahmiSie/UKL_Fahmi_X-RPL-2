public class Soal3_Nomor2 {
    
    public static void main(String[] args) {
       
        int[] array = {28, 2, -10, -5, 0, -4, 12, -1, 26, -3, -1, -2, -3, 123456789, -5, -8};
        
        
        mendeteksiElemenNegatif(array);
    }
    
    public static void mendeteksiElemenNegatif(int[] array) {
     
        boolean adaNegatif = false;
        String elemenNegatif = "";

        
        System.out.println("Menggunakan for loop:");
        for (int i = 0; i < array.length; i++) {
            
            if (array[i] < 0) {
                if (adaNegatif) {
                    elemenNegatif += ", " + array[i];
                } else {
                    elemenNegatif = String.valueOf(array[i]);
                    adaNegatif = true;
                }
            }
        }

        
        if (adaNegatif) {
            System.out.println("Array mengandung elemen negatif: " + elemenNegatif);
        } else {
            System.out.println("Array tidak mengandung elemen negatif.");
        }

        
        adaNegatif = false;
        elemenNegatif = "";

        
        System.out.println("\nMenggunakan while loop:");
        int i = 0;
        while (i < array.length) {
            if (array[i] < 0) {
                if (adaNegatif) {
                    elemenNegatif += ", " + array[i];
                } else {
                    elemenNegatif = String.valueOf(array[i]);
                    adaNegatif = true;
                }
            }
            i++;
        }

        
        if (adaNegatif) {
            System.out.println("Array mengandung elemen negatif: " + elemenNegatif);
        } else {
            System.out.println("Array tidak mengandung elemen negatif.");
        }

        
        adaNegatif = false;
        elemenNegatif = "";

        
        System.out.println("\nMenggunakan do-while loop:");
        int j = 0;
        do {
            if (array[j] < 0) {
                if (adaNegatif) {
                    elemenNegatif += ", " + array[j];
                } else {
                    elemenNegatif = String.valueOf(array[j]);
                    adaNegatif = true;
                }
            }
            j++;
        } while (j < array.length);

        
        if (adaNegatif) {
            System.out.println("Array mengandung elemen negatif: " + elemenNegatif);
        } else {
            System.out.println("Array tidak mengandung elemen negatif.");
        }
    }
}


    