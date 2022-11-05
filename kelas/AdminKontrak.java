package kelas;

public class AdminKontrak {
  private String nama;
  private String nomor_telepon;
  private String cabang;
  private String alamat;

  public AdminKontrak() {
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public void setNomorTelepon(String nomor_telepon) {
    this.nomor_telepon = nomor_telepon;
  }

  public void setCabang(String cabang) {
    this.cabang = cabang;
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

  public String getCabang(){
    return this.cabang;
  }

  public String getAlamat(){
    return this.alamat;
  }
}
