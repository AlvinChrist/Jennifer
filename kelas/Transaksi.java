package kelas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transaksi {
    private String jenis_transaksi;
    private LocalDate tanggal_transaksi;
    private DateTImeFormatter format = DateTimeFormatter.ofPatter('dd/MM/yyyy');
    
    public void setJenisTransaksi(String jenis_transaksi){
        this.jenis_transaksi = jenis_transaksi;
    }

    public void setTanggalTransaksi(String tanggal_transaksi) thorws ParseException {
      this.tanggal_transaksi = LocalDate.parse(tanggal_transaksi, format);
    }

    public String getJenisTransaksi(){
        return this.jenis_transaksi;
    }
    public String getTanggalTransaksi(){
        return this.tanggal_transaksi.format(format);
    }

}
