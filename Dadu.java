package com.soal1;

import java.util.Random;

public class Dadu {
	// Atribut untuk nilai dadu
    private int nilai;

    // Method untuk menghasilkan nilai acak antara 1 hingga 6
    public void acakNilai() {
        Random rand = new Random();
        this.nilai = rand.nextInt(6) + 1;  // Angka acak antara 1 hingga 6
    }

    // Getter untuk mendapatkan nilai dadu
    public int getNilai() {
        return this.nilai;
    }
}