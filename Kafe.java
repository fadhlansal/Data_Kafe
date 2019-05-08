/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kafe;

/**
 *
 * @author acer
 */
public class Kafe {
    private String namaKafe;
    private String alamat;

    public Kafe(String namaKafe, String alamat) {
        this.namaKafe = namaKafe;
        this.alamat = alamat;
    }
    
    
    @Override
    public String toString (){
        return namaKafe + " (" + alamat + ")";
    }
    
    public String getNamaKafe() {
        return namaKafe;
    }

    public void setNamaKafe(String namaKafe) {
        this.namaKafe = namaKafe;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
}
