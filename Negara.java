package com.soal2;

import java.util.HashMap;

public class Negara {
    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggalKemerdekaan;
    private int bulanKemerdekaan;
    private int tahunKemerdekaan;

    // Constructor
    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin,
                  int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggalKemerdekaan;
        this.bulanKemerdekaan = bulanKemerdekaan;
        this.tahunKemerdekaan = tahunKemerdekaan;
    }

    // Constructor untuk monarki tanpa tanggal kemerdekaan
    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
    }

    // Output format
    public String toString(HashMap<Integer, String> bulanMap) {
        if (jenisKepemimpinan.equalsIgnoreCase("monarki")) {
            return "Negara " + nama + " mempunyai Raja bernama " + namaPemimpin + "\n";
        } else {
            return "Negara " + nama + " mempunyai " + jenisKepemimpinan + " bernama " + namaPemimpin + "\n" +
                   "Deklarasi Kemerdekaan pada Tanggal " + tanggalKemerdekaan + " " +
                   bulanMap.get(bulanKemerdekaan) + " " + tahunKemerdekaan + "\n";
        }
    }
}