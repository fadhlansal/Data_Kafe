/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kafe;

import java.util.Scanner;

/**
 *
 * @author Fadhlan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        Kafe kf = new Kafe("Kafe", "Lokasi");
        Manajer mn = new Manajer("Nama", "Tempat kerja");
        Pelayan pl = new Pelayan("Nama", "Tempat kerja");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("=====Input Data Kafe=====");
        System.out.print("Masukkan nama kafe: ");
        kf.setNamaKafe(sc.nextLine());
        System.out.print("Masukkan alamat kafe: ");
        kf.setAlamat(sc.nextLine());
        System.out.println("");

        
        System.out.println("=====Input Data Manajer=====");
        System.out.print("Masukkan nama manajer: ");
        mn.setNama(sc.nextLine());
        System.out.println("Set kafe untuk manajer dari kafe yang sudah ada");
        System.out.println("=Data Manajer");
        System.out.println("Nama: " + mn.getNama());
        
        System.out.println("Kafe: " + kf.toString());
        System.out.println("");
        
        System.out.println("=====Input Data Pelayan=====");
        System.out.print("Masukkan nama pelayan: ");
        pl.setNama(sc.nextLine());
        System.out.print("Masukkan shift kerja pelayan: ");
        pl.setShift(sc.nextLine());
        System.out.println("Set kafe untuk pelayan dari Kafe yang sudah ada");
        System.out.println("=Data Pelayan");
        System.out.println("Nama: " + pl.getNama());
        System.out.println("Shift: " + pl.getShift());
        System.out.println("Kafe: " + kf.toString());
    }
    
}
