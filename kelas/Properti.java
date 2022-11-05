package kelas;

public class Properti {
  private String alamat;
  private double panjang;
  private double lebar;

  public Properti() {}

  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }

  public void setPanjang(double panjang) {
    this.panjang = panjang;
  }

  public void setLebar(double lebar) {
    this.lebar = lebar;
  }

  public String getAlamat() {
    return this.alamat;
  }

  public double getPanjang() {
    return this.panjang;
  }

  public double getLebar() {
    return this.lebar;
  }

  public double getLuas() {
    return this.panjang * this.lebar;
  }
}