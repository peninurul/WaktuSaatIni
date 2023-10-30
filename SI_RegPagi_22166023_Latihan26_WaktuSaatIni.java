/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166023_latihan26_waktu.saat.ini;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author user
 * NAMA : Peni Nurul Fauzah
 * KELAS : PBO26
 * NIM : 22166023
 * DESKRIPSI PROGRAM : Waktu Saat Ini
 */
public class SI_RegPagi_22166023_Latihan26_WaktuSaatIni {

    public static void main(String[] args) {
        Date tanggalWaktuSaatIni = new Date();
        SimpleDateFormat formatTanggalWaktu = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        String tanggalWaktuSaatIniString = formatTanggalWaktu.format(tanggalWaktuSaatIni);

        System.out.println("Tanggal dan waktu saat ini: " + tanggalWaktuSaatIniString);

    }
    
}
