package kelas;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import kelas.Kontrak;
import kelas.Transaksi;
import kelas.Penyewa;
import kelas.PemilikProperti;
import kelas.Properti;
import java.util.*;

public class PenugasanKontrakSewa {
    
      private LocalDate tanggal_awal;
      private LocalDate tanggal_akhir;
      private String tujuan;
      private String keputusan;
      private DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      private Kontrak kontrak;
      private Transaksi transaksi;
      private HashSet<Penyewa> penyewa = new HashSet<Penyewa>();
      private HashSet<PemilikProperti> pemilik_properti = new HashSet<PemilikProperti>();
      private CabangPerusahaan cabang;
      private HashSet<Properti> list_properti;

      public void setTanggalAwal(String tanggal_awal) throws ParseException {
        this.tanggal_awal = LocalDate.parse(tanggal_awal, format);
      }

      public void setTanggalAkhir(String tanggal_akhir) throws ParseException {
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

      public void addPenyewa(Penyewa penyewa_) {
        penyewa.add(penyewa_);
      }

      public void getPenyewa(){
        for (Penyewa penyewa: penyewa){
          penyewa.dataPenyewa();
        }
      }

      public void addPemilikProperti(PemilikProperti pemilik_properti_) {
        pemilik_properti.add(pemilik_properti_);
      }

      public void getPemilikProperti(){
        for (PemilikProperti pemilik_properti: pemilik_properti){
          pemilik_properti.dataPemilikProperti();
        }
      }

      public void setCabangPerusahaan(CabangPerusahaan cabang){
        this.cabang = cabang;
      }

      public void getCabangPerusahaan(){
        System.out.println("Nama     : " + cabang.getNama());
        System.out.println("Alamat   : " + cabang.getAlamat());
        System.out.println("Domisili : " + cabang.getDomisili());
      }

      public void addProperti(Properti properti) {
        this.list_properti.add(properti);
      }

      public void getProperti(){
        for (Properti properti: list_properti){
          properti.dataProperti();
        }
      }
}