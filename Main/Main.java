package Main;
import java.util.ArrayList;
import java.util.List;

import kelas.BiayaSewaKontrak;
import kelas.PemilikProperti;
import kelas.Properti;
public class Main {
  private static List<BiayaSewaKontrak> list_biaya_sewa_kontrak = new ArrayList<BiayaSewaKontrak>();
  private static List<PemilikProperti> list_pemilik_properti = new ArrayList<PemilikProperti>();

  public static boolean cekBiayaSewaDuplikat(double biaya, String tanggal_efektif) {
    for(int i = 0; i < list_biaya_sewa_kontrak.size(); i++) {
      if(list_biaya_sewa_kontrak.get(i).biaya() == biaya && list_biaya_sewa_kontrak.get(i).getStringTanggalEfektif() == tanggal_efektif) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean cekDuplikatPemilikProperti(String nama, String domisili) {
    for(int i = 0; i < list_pemilik_properti.size(); i++) {
      if(list_pemilik_properti.get(i).nama() == nama && list_pemilik_properti.get(i).domisili() == domisili) {
        return true;
      }
    }
    return false;
  }

  public static BiayaSewaKontrak getBiayaSewaTerbaru() {
    return list_biaya_sewa_kontrak.get(list_biaya_sewa_kontrak.size() - 1);
  }
  
  public static void addBiayaSewaKontrak(double biaya, String tanggal_efektif) {
    try {
      BiayaSewaKontrak biaya_sewa = new BiayaSewaKontrak(biaya, tanggal_efektif);

      // validasi pada tanggal yang sama, harga harus berbeda
      if(cekBiayaSewaDuplikat(biaya, tanggal_efektif) == true) {
        System.out.println("Biaya sewa sudah ada");
        return;
      }
      
      list_biaya_sewa_kontrak.add(biaya_sewa);
    } catch (Exception e) {
      System.out.println("Format tanggal salah");
    }
  }

  public static void addPemilikProperti(String nama, String domisili)  {
    if(cekDuplikatPemilikProperti(nama, domisili) == true) {
      System.out.println("Pemilik properti sudah ada");
      return;
    }
    PemilikProperti pemilik = new PemilikProperti(nama, domisili);
    list_pemilik_properti.add(pemilik);
  }

  public static void main(String[] args) {
    addBiayaSewaKontrak(5000000, "30/10/2020");
    PemilikProperti jeni = new PemilikProperti("Jennifer", "Pematangsiantar");
    
    Properti podomoro = new Properti("Apartment", 50, "Medan");
    podomoro.setBiayaSewaKontrak(getBiayaSewaTerbaru());
    podomoro.setPemilikProperti(jeni);

    System.out.println(podomoro.getPemilikProperti().nama());
  }
  

}