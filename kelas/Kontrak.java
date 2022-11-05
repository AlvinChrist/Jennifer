package kelas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Kontrak {
  private double harga_sewa;
  private LocalDate tanggal_efektif;
  private DateTImeFormatter format = DateTimeFormatter.ofPatter('dd/MM/yyyy');

  public Kontrak() {
    this.tanggal_efektif = LocalDate.now();
  }

  public void setHargaSewa(double harga_sewa) {
    this.harga_sewa = harga_sewa
  }

  public void setTanggalEfektif(String tanggal_efektif) thorws ParseException {
    this.tanggal_efektif = LocalDate.parse(tanggal_efektif, format);
  }
  
  public double getHargaSewa() {
    return this.harga_sewa;
  }

  public String getTanggalEfektif() {
    return this.tanggal_efektif.format(format);
  }
}
