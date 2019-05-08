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
public class Pelayan extends Pegawai{
    private String nama;
    private String shift;

    public Pelayan(String Nama, String tempatKerja) {
        super(Nama, tempatKerja);
    }

    

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    
    
}
