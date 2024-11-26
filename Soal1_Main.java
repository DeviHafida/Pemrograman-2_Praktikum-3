package com.soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Soal1_Main {
	private static Scanner scanner;

	public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int jumlahDadu = scanner.nextInt();

        // LinkedList untuk menyimpan objek dadu
        LinkedList<Dadu> daftarDadu = new LinkedList<>();

        // Menginisialisasi dan menambahkan objek Dadu ke LinkedList
        for (int i = 0; i < jumlahDadu; i++) {
            Dadu dadu = new Dadu();
            dadu.acakNilai();  // Mengacak nilai dadu
            daftarDadu.add(dadu);  // Menambahkan objek Dadu ke LinkedList
        }

        // Output nilai tiap objek dadu
        int totalNilai = 0;
        for (int i = 0; i < daftarDadu.size(); i++) {
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + daftarDadu.get(i).getNilai());
            totalNilai += daftarDadu.get(i).getNilai();
        }

        // Output total nilai semua objek dadu
        System.out.println("Total nilai dadu keseluruhan " + totalNilai);
    }
}