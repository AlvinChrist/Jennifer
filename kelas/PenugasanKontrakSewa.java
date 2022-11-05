package kelas;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import kelas.Kontrak;
import kelas.Transaksi;

public class PenugasanKontrakSewa {
    
      private LocalDate tanggal_awal;
      private LocalDate tanggal_akhir;
      private String tujuan;
      private String keputusan;
      private DateTimeFormatter format = DateTimeFormatter.ofPatter('dd/MM/yyyy');
      private Kontrak kontrak;
      private Transaksi transaksi;
    
      public void setTanggalAwal(String tanggal_awal) thorws ParseException {
        this.tanggal_awal = LocalDate.parse(tanggal_awal, format);
      }

      public void setTanggalAkhir(String tanggal_akhir) thorws ParseException {
        this.tanggal_akhir = LocalDate.parse(tanggal_akhir, format);
      }
      
      public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
      }

      public void setKeputusan(String keputusan) {
        this.keputusan = keputusan;
      }

      public void setKontrak(Kontrak kontrak) {
        this.kontrak = kontrak;
      }

      public void setTransaksi(Transaksi transaksi) {
        this.transaksi = transaksi;
      }
      
      public String getTanggalAwal() {
        return this.tanggal_awal.format(format);
      }
      
      public String getTanggalAkhir() {
        return this.tanggal_akhir.format(format);
      }

      public String getTujuan(String tujuan){
        return this.tujuan;
      }

      public String getKeputusan(String keputusan){
        return this.keputusan;
      }

      public Kontrak getKontrak() {
        return this.kontrak;
      }
      
      public Transaksi getTransaksi() {
        return this.transaksi;
      }
}