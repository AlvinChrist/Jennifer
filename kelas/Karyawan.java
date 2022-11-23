package kelas;

public class Karyawan {
  private String nama;
  private String nomor_telepon;
  private String alamat;
  private String jabatan;

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

  public void setJabatan(String jabatan) {
    this.jabatan = jabatan;
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

  public String getJabatan(){
    return this.jabatan;
  }

  public int gaji(){
    int gaji_karyawan;
    if (jabatan == "Admin"){
      gaji_karyawan = 5000000;
    } else {
      gaji_karyawan = 4000000;
    }
    return gaji_karyawan;
  }

  public void dataKaryawan(){
    System.out.println("Nama          : " + nama);
    System.out.println("Alamat        : " + alamat);
    System.out.println("Nomor Telepon :" + nomor_telepon);
    System.out.println("Jabatan       :" + jabatan);
    System.out.println("Gaji          :" +gaji());
  }
}
