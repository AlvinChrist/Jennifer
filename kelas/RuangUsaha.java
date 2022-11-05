package kelas;
import kelas.Properti;

public class RuangUsaha extends Properti {
  private String nomor_lantai;
  private String nomor_toko;

  public RuangUsaha() {
    super();
    this.nomor_lantai = "";
    this.nomor_toko = "";
  }

  public void setNomorLantai(String nomor_lantai) {
    this.nomor_lantai = nomor_lantai;
  }

  public void setNomorToko(String nomor_toko) {
    this.nomor_toko = nomor_toko;
  }

  public String getNomorLantai() {
    return this.nomor_lantai;
  }

  public String getNomorToko() {
    return this.nomor_toko;
  }
}
