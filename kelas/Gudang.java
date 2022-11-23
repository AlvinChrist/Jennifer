package kelas;
import kelas.Properti;

class Gudang extends Properti {
  private int ketinggian;

  public Gudang() {
    super();
    this.ketinggian = 0;
  }

  public void setJumlahLantai(int ketinggian) {
    this.ketinggian = ketinggian;
  }

  public int getJumlahLantai() {
    return this.ketinggian;
  }
}