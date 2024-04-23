/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enkapsulasi;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class MainKinetik {



    private double massa;
    private double kecepatan;

    // Constructor untuk inisialisasi massa dan kecepatan
    public MainKinetik(double massa, double kecepatan) {
        this.massa = massa;
        this.kecepatan = kecepatan;
    }

    // Setter dan Getter untuk Massa
    public void setMassa(double massa) {
        if (massa > 0) {
            this.massa = massa;
        } else {
            System.out.println("Error: Massa harus lebih besar dari 0.");
        }
    }

    public double getMassa() {
        return massa;
    }

    // Setter dan Getter untuk Kecepatan
    public void setKecepatan(double kecepatan) {
        if (kecepatan >= 0) {
            this.kecepatan = kecepatan;
        } else {
            System.out.println("Error: Kecepatan harus tidak negatif.");
        }
    }

    public double getKecepatan() {
        return kecepatan;
    }

    // Method untuk menghitung energi kinetik
    public double hitungEnergiKinetik() {
        return 0.5 * massa * Math.pow(kecepatan, 2);
    }

    // Method utama
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Menampilkan judul
        System.out.println("Menghitung Energi Kinetik");
        System.out.println("-------------------------");
        System.out.println("");

        // Input untuk massa
        System.out.print("Masukkan massa (kg): ");
        double massa = scanner.nextDouble();

        // Input untuk kecepatan
        System.out.print("Masukkan kecepatan (m/s): ");
        double kecepatan = scanner.nextDouble();

        // Membuat instance dari MainKinetik
        MainKinetik mainKinetik = new MainKinetik(massa, kecepatan);

        // Menghitung energi kinetik
        double energiKinetik = mainKinetik.hitungEnergiKinetik();

        // Output
        System.out.println("Energi kinetiknya adalah: " + energiKinetik + " Joule");

        // Menutup scanner
        scanner.close();
    }
}


