package bura.com;

//Burait farhan
//22116030

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;


public class bura {
    public static void main(String[] args) {

        ArrayList<String> nama = new ArrayList<>();
        ArrayList<String> Nim = new ArrayList<>();
        ArrayList<String> Alamat = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("\nProgram Data Mahasiswa");
            System.out.println("=========================");
            System.out.println("1. Masukan data : ");
            System.out.println("2. Tampilkan data :");
            System.out.println("3. Mencari data :");
            System.out.println("4. Menghapus data :");
            System.out.println("5. Keluar dari menu :1" );
            System.out.println("\nMenu : ");
            pilihan = input.nextInt();

            if (pilihan == 1){
                System.out.println("Masukan nama : ");
                String nm = input.next();
                nama.add(nm);

                System.out.println("Masukan Nim : ");
                String nim = input.next();
                Nim.add(nim);

                System.out.println("Masukan Alamat : ");
                String alm = input.next();
                Alamat.add(alm);

            } else if (pilihan == 2) {
                System.out.println("data mahasiswa");
                System.out.println("===============");

                for (int i = 0; i < Nim.size(); i++) {
                    System.out.println(i + 1 + "." + Nim.get(i));
                }
                System.out.println("Untuk melihat data lengkap, Silahkan cari di data 3");

            } else if (pilihan == 3) {
                System.out.println("Masukan Data Nomor Yang Akan Di cari  : ");
                int cari = input.nextInt();
                if (cari == 1){
                    System.out.println("Nama : "+nama.get(0));
                    System.out.println("Nim : "+Nim.get(0));
                    System.out.println("Alamat :"+Alamat.get(0));
                }
                System.out.println("============");

                if (cari == 2) {
                    System.out.println("Nama : "+nama.get(1));
                    System.out.println("NIM : "+Nim.get(1));
                    System.out.println("Almat : "+Alamat.get(1));
                }
            } else if (pilihan == 4) {
                System.out.println("Data mahasiwa");
                System.out.println("===============");

                for (int i = 0; i <Nim.size() ; i++){
                    System.out.println(i + i + "." + Nim.get(i));
                }
                System.out.println("Masukan Nim Yang Akan Di Hapus : ");
                Nim.remove(Nim);
            } else if (pilihan == 5){
                System.out.println("Program selesai");
            }else {
                System.err.println("Menu tidak cocok");
            }
        }while (pilihan!=5);
    }
}
