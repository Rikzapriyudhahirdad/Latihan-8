package Latihan8;

import java.util.Scanner;

public class mainNilaiApaIni {

    public static void main(String[] args) {
        Scanner intdobel = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        String angka = intdobel.nextLine();
        NilaiApa na = new NilaiApa();
        na.setAngka(angka);
        na.testAngkaApa();
    }

}
