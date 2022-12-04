package kelas;
import kelas.Properti;
import java.util.HashSet;

public class Penyewa {
  private String nama;
  private String nomor_telepon;
  private String alamat;
  private HashSet<Properti> list_properti;

  public Penyewa() {}

  public void setNama(String nama) {
    this.nama = nama;
  }

  public void setNomorTelepon(String nomor_telepon) {
    this.nomor_telepon = nomor_telepon;
  }

  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }

  public String getNama() {
    return this.nama;
  }

  public String getNomorTelepon() {
    return this.nomor_telepon;
  }

  public String getAlamat() {
    return this.alamat;
  }

  public void dataPenyewa(){
    System.out.println("Nama         : " + nama);
    System.out.println("Nomor Telepon: " +nomor_telepon);
    System.out.println("Alamat       : " + alamat);
  }

  public void addProperti(Properti properti) {
    this.list_properti.add(properti);
  }

  public void getProperti(){
    for (Properti properti: list_properti){
      properti.dataProperti();
    }
  }
}