package com.soal3;

	import java.util.ArrayList;
	import java.util.Scanner;

	public class Soal3_Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
	        int pilihan;

	        do {
	            // Menu program
	            System.out.println("Menu:");
	            System.out.println("1. Tambah Mahasiswa");
	            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
	            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
	            System.out.println("4. Tampilkan Daftar Mahasiswa");
	            System.out.println("0. Keluar");
	            System.out.print("Pilihan: ");
	            pilihan = scanner.nextInt();
	            scanner.nextLine(); // Membersihkan buffer

	            switch (pilihan) {
	                case 1:
	                    // Tambah Mahasiswa
	                    System.out.print("Masukkan Nama Mahasiswa: ");
	                    String nama = scanner.nextLine();
	                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
	                    String nim = scanner.nextLine();

	                    // Validasi NIM unik
	                    boolean nimSudahAda = false;
	                    for (Mahasiswa m : daftarMahasiswa) {
	                        if (m.getNim().equals(nim)) {
	                            nimSudahAda = true;
	                            break;
	                        }
	                    }

	                    if (nimSudahAda) {
	                        System.out.println("NIM sudah ada, gagal menambahkan mahasiswa.");
	                    } else {
	                        daftarMahasiswa.add(new Mahasiswa(nama, nim));
	                        System.out.println("Mahasiswa " + nama + " ditambahkan.");
	                    }
	                    break;

	                case 2:
	                    // Hapus Mahasiswa
	                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
	                    String nimHapus = scanner.nextLine();
	                    boolean ditemukan = false;

	                    for (int i = 0; i < daftarMahasiswa.size(); i++) {
	                        if (daftarMahasiswa.get(i).getNim().equals(nimHapus)) {
	                            System.out.println("Mahasiswa " + daftarMahasiswa.get(i).getNama() + " dihapus.");
	                            daftarMahasiswa.remove(i);
	                            ditemukan = true;
	                            break;
	                        }
	                    }

	                    if (!ditemukan) {
	                        System.out.println("Mahasiswa dengan NIM " + nimHapus + " tidak ditemukan.");
	                    }
	                    break;

	                case 3:
	                    // Cari Mahasiswa
	                    System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
	                    String nimCari = scanner.nextLine();
	                    boolean ditemukanCari = false;

	                    for (Mahasiswa m : daftarMahasiswa) {
	                        if (m.getNim().equals(nimCari)) {
	                            System.out.println("Mahasiswa ditemukan:");
	                            System.out.println("Nama: " + m.getNama());
	                            System.out.println("NIM: " + m.getNim());
	                            ditemukanCari = true;
	                            break;
	                        }
	                    }

	                    if (!ditemukanCari) {
	                        System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
	                    }
	                    break;

	                case 4:
	                    // Tampilkan Daftar Mahasiswa
	                    if (daftarMahasiswa.isEmpty()) {
	                        System.out.println("Daftar mahasiswa kosong.");
	                    } else {
	                        System.out.println("Daftar Mahasiswa:");
	                        for (Mahasiswa m : daftarMahasiswa) {
	                            System.out.println("Nama: " + m.getNama() + ", NIM: " + m.getNim());
	                        }
	                    }
	                    break;

	                case 0:
	                    // Keluar
	                    System.out.println("Terima kasih!");
	                    break;

	                default:
	                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
	            }

	            System.out.println(); // Pindah baris untuk kejelasan output
	        } while (pilihan != 0);

	        scanner.close();
	    }
	}