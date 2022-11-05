package kelas;
import kelas.Properti;

class Gudang extends Properti {
  private int jumlah_lantai;

  public Gudang() {
    super();
    this.jumlah_lantai = 0;
  }

  public void setJumlahLantai(int jumlah_lantai) {
    this.jumlah_lantai = jumlah_lantai;
  }

  public int getJumlahLantai() {
    return this.jumlah_lantai;
  }
}