package kelas;

public class PemilikProperti {
  private String nama;
  private String domisili;

  public PemilikProperti(String nama, String domisili) {
    this.nama = nama;
    this.domisili = domisili;
  }

  public void setNama(String nama_baru) {
    this.nama = nama_baru;
  }

  public String nama() {
    return this.nama;
  }

  public void setDomisili(String domisili) {
    this.domisili = domisili;
  }

  public String domisili() {
    return this.domisili;
  }
}
