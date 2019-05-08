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
public class Pegawai {
    private String Nama;
    private String tempatKerja;

    public Pegawai(String Nama, String tempatKerja) {
        this.Nama = Nama;
        this.tempatKerja = tempatKerja;
    }
    
    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getTempatKerja() {
        return tempatKerja;
    }

    public void setTempatKerja(String tempatKerja) {
        this.tempatKerja = tempatKerja;
    }
    
    
    
}
