package Tugas.Modul4;
import java.util.Scanner;

public class Kel33 {
    static String swit(int pilihan_menu) {
        String[][] array = {{"air mineral Aqua", "soda Fanta", "Kopiko latte"}};
        String hasil_akhir = null;
        switch (pilihan_menu) {
            case (1):
                hasil_akhir = array[0][0];
                break;
            case (2):
                hasil_akhir = array[0][1];
                break;
            case (3):
                hasil_akhir = array[0][2];
                break;
        }return "Anda membeli " + hasil_akhir + " terima kasih telah membeli";
    }
        public static void main (String[] args){
            int batasBeli = 3;
        while(batasBeli>0) {
            menu awalan = new menu();
            awalan.Selamat_datang();
            Scanner input = new Scanner(System.in);
            int pilihan = input.nextInt();
            System.out.println(swit(pilihan));
        batasBeli--;
        }
        System.out.println("Transaksi pembelian telah berakhir");
        }
    }
