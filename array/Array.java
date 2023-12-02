package array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
       String[] kode = new String[20];
        int[] jmlh = new int[15];
        Scanner input = new Scanner(System.in);
        int i;
        int total = 0;
        
        System.out.println("PROGRAM TOKOH SERBA ADA");
        System.out.println("***********************");
        System.out.println("No\tKode Barang\tNama Barang\tHarga");
        System.out.println("==========================================================");
        System.out.println("1.\t a001\t\t Buku\t\t 3000");
        System.out.println("2.\t a002\t\t Pensil\t\t 4000");
        System.out.println("3.\t a003\t\t Pulpen\t\t 5000");
        System.out.println("==========================================================");
        
        String[] barang = {"Buku", "Pensil", "Pulpen"};
        int[] harga = {3000, 4000, 5000};
        System.out.print("Masukkan Item Barng: ");
        int item = input.nextInt();
        for (i=0; i<item; i++){
            System.out.println("Data ke"+(i+1));
            System.out.print("Masukkan Kode Barang: ");
            kode[i] = input.next();
            System.out.print("Masukkan Jumlah Beli: ");
            jmlh[i] = input.nextInt();
        }
       
        System.out.println();
        System.out.println("PROGRAM TOKOH SERBA ADA");
        System.out.println("***********************");
        System.out.println("No\tKode Barang\tNama Barang\tHarga\tJumlah Beli\tJumlah Bayar");
        System.out.println("==============================================================================");
        
        for (i = 0; i < item; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(kode[i] + "\t\t");

            int index = -1;
            for (int j = 0; j < barang.length; j++) {
                if (kode[i].equals("a00" + (j + 1))) {
                    index = j;
                    break;
                }
            }

            if (index != -1) {
                System.out.print(barang[index] + "\t\t");
                System.out.print(harga[index] + "\t");
            } else {
                System.out.println("MAAF STOK BARANG TIDAK ADA");
                continue;
            }
            
            System.out.print("   " + jmlh[i] + "\t\t");
            int jmlhBayar = jmlh[i] * harga[index];
            System.out.println(jmlhBayar);

            total += jmlhBayar;
        }
            System.out.println("==============================================================================");
            System.out.println("Total Bayar \t\t\t\t\t\t" + total);
            System.out.println("==============================================================================");
        
    
    }
}