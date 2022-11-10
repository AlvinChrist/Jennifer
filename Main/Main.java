package Main;
import java.util.*;

import kelas.CabangPerusahaan;
import kelas.Karyawan;
import kelas.RumahTinggal;

public class Main {
  public static void main(String args[]) {
    CabangPerusahaan perusahaan_a = new CabangPerusahaan();
    perusahaan_a.setNama("Perusahaan Tali");
    perusahaan_a.setAlamat("Jalan Sutomo");

    Set<Karyawan> list_karyawan = new HashSet<>();
    Karyawan adryan = new Karyawan("Adryan", "085212321421");
    Karyawan ken = new Karyawan("Ken", "12345623423");

    list_karyawan.add(adryan);
    list_karyawan.add(ken);

    perusahaan_a.setKaryawan(list_karyawan);
    System.out.println(perusahaan_a.getKaryawan());

    RumahTinggal rumah = new RumahTinggal();
    rumah.setAlamat("Jalan Rela");
    rumah.setPanjang(11.5);
    rumah.setLebar(5.6);
    rumah.setJumlahKamar(3);
    rumah.setJumlahKamarMandi(2);
    rumah.setJumlahLantai(1);

    System.out.println(rumah.getLuas());
   
}}