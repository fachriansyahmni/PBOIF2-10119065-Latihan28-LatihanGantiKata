package pboif2.pkg10119065.latihan28.latihangantikata;

import java.util.Scanner;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program ganti kata
 */
public class PBOIF210119065Latihan28LatihanGantiKata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("==== Program Mengganti Kata ====");
        System.out.print("Masukkan Kalimat : ");
        String kalimat = sc.nextLine();
        System.out.print("Ganti Kata : ");
        String dariKata = sc.nextLine();
        System.out.print("Menjadi Kata : ");
        String keKata = sc.nextLine();
        
        String ubahKata = kalimat.replaceAll(dariKata,keKata);  
        System.out.println("\n==== Hasil Formatting ====");   
        System.out.println("Kalimat Lama : "+kalimat);  
        System.out.println("Kalimat Baru : "+ubahKata); 
        System.out.println("\n(Developed by : Fachriansyah Muhammad Nur Ihsan)");  
    }
    
}
