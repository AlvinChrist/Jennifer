package kelas;

public class Karyawan {
  private String nama;
  private String nomor_telepon;
  private String alamat;

  public Karyawan(String nama, String nomor_telepon) {
    this.nama = nama;
    this.nomor_telepon = nomor_telepon;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public void setNomorTelepon(String nomor_telepon) {
    this.nomor_telepon = nomor_telepon;
  }

  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }

  public String getNama(){
    return this.nama;
  }

  public String getNomorTelepon(){
    return this.nomor_telepon;
  }

  public String getAlamat(){
    return this.alamat;
  }
}
