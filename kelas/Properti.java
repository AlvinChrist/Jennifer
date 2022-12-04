package kelas;

public abstract class Properti {
  protected String alamat;
  protected double panjang;
  protected double lebar;
  protected String tipe;

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

  public void dataProperti(){
    System.out.println("Tipe properti   : " +tipe);
    System.out.println("Alamat properti : " +alamat);
    System.out.println("Panjang         : " +panjang);
    System.out.println("Lebar           : " +lebar);
    System.out.println("Luas            : " +getLuas());
  }
}