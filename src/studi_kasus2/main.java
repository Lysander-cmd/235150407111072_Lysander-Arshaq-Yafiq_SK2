/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studi_kasus2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Mahasiswa> mhs = new ArrayList<>();
        Scanner input = new Scanner (System.in);
        boolean next = true;
        
        while(next){
            Mahasiswa mahasiswa = new Mahasiswa();
            
            System.out.println("Masukan NIM : ");
            mahasiswa.setNim(input.nextLine());
            System.out.println("Masukan Nama : ");
            mahasiswa.setNama(input.nextLine());
            System.out.println("Masukan Alamat : ");
            mahasiswa.setAlamat(input.nextLine());
            
            mhs.add(mahasiswa);
            System.out.println("Apakah anda ingin menambah data lagi? (y/t) : ");
            if(input.nextLine().equalsIgnoreCase("t")){
                next = false;
            }
        }
        
        System.out.println("=================================");
        for(Mahasiswa m : mhs){
            System.out.println(m.getNim()+" | "+m.getNama()+" | " +m.getAlamat());
        }
        
    }
    
}
