/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studi_kasus2;

/**
 *
 * @author USER
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String alamat;

    public String getNim() {
        return String.format("%10s",nim);
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return String.format("%-20s", nama);
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return String.format("%-30s", alamat);
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    
}
