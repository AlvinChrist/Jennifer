package kelas;
import kelas.Properti;

public class RumahUsaha extends Properti {
  private int jumlah_kamar;
  private int jumlah_lantai;

  public RumahUsaha() {
    super();
    this.jumlah_kamar = 0;
    this.jumlah_lantai = 0;
  }

  public void setJumlahKamar(int jumlah_kamar) {
    this.jumlah_kamar = jumlah_kamar;
  }

  public void setJumlahLantai(int jumlah_lantai) {
    this.jumlah_lantai = jumlah_lantai;
  }

  public int getJumlahKamar() {
    return this.jumlah_kamar;
  }

  public int getJumlahLantai() {
    return this.jumlah_lantai;
  }
}