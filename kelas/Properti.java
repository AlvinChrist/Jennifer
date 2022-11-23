package kelas;

public abstract class Properti {
  protected String alamat;
  protected double panjang;
  protected double lebar;

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