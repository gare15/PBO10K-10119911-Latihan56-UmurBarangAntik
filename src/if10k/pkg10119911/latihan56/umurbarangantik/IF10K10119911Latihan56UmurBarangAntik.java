/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119911.latihan56.umurbarangantik;

/**
 *
 * @author tegar
 */ 
public class IF10K10119911Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Radio radio = new Radio(234);
        radio.setName("Radio AM");
        System.out.println("Nama Barang Antik : "+radio.getName());
        radio.tampilUmur();
    }
    
}
