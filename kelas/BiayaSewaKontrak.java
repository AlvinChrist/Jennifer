package kelas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BiayaSewaKontrak {
  private double biaya;
  private Date tanggal_efektif;

  public BiayaSewaKontrak(double biaya, String tanggal_efektif) throws ParseException {
    this.biaya = biaya;
    this.tanggal_efektif = new SimpleDateFormat("dd/MM/yyyy").parse(tanggal_efektif);
  }

  /**
   * Fungsi getter biaya
   */
  public double biaya() {
    return this.biaya;
  }

  public Date getTanggalEfektif() {
    return this.tanggal_efektif;
  }

  /**
   * Fungsi getter tanggal_efektif dlm string
   * @return dd/MM/YYYY
   */
  public String getStringTanggalEfektif() {
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
    return dateFormat.format(this.tanggal_efektif);
  }

  public void setTanggalEfektif(String tanggal_efektif) throws ParseException {
    this.tanggal_efektif = new SimpleDateFormat("dd/MM/yyyy").parse(tanggal_efektif);
  }
}
