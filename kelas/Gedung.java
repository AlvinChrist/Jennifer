package kelas;

import java.util.*;
import kelas.Properti;
import kelas.RuangUsaha;

class Gedung extends Properti {
  private int jumlah_lantai;
  private Set<RuangUsaha> ruang_usaha;

  public Gedung() {
    super();
    this.jumlah_lantai = 0;
    this.ruang_usaha = new HashSet<>();
  }

  public void setJumlahLantai(int jumlah_lantai) {
    this.jumlah_lantai = jumlah_lantai;
  }

  public int getJumlahLantai() {
    return this.jumlah_lantai;
  }

  public void setRuangUsaha(Set<RuangUsaha> ruang_usaha) {
    this.ruang_usaha = ruang_usaha;
  }

  public Set<RuangUsaha> getRuangUsaha() {
    return this.ruang_usaha;
  }
}