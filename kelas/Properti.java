package kelas;

public class Properti {
  private String jenis_properti;
  private int jumlah_lantai;
  private String lokasi;
  private BiayaSewaKontrak biaya_sewa_kontrak;
  private PemilikProperti pemilik_properti;

  public Properti(String jenis_properti, int jumlah_lantai, String lokasi) {
    this.jenis_properti = jenis_properti;
    this.jumlah_lantai = jumlah_lantai;
    this.lokasi = lokasi;
  }

  public String getJenisProperti() { return this.jenis_properti; }
  public int getJumlahLantai() { return this.jumlah_lantai; }
  public String getLokasi() { return this.lokasi; }

  public void setBiayaSewaKontrak(BiayaSewaKontrak biaya) {
    this.biaya_sewa_kontrak = biaya;
  }

  public BiayaSewaKontrak getBiayaSewaKontrak() {
    return this.biaya_sewa_kontrak;
  }
  
  public void setPemilikProperti(PemilikProperti pemilik) {
    this.pemilik_properti = pemilik;
  }

  public PemilikProperti getPemilikProperti() {
    return this.pemilik_properti;
  }
}