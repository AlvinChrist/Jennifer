package kelas;

import java.util.*;
import kelas.Karyawan;
import kelas.Kontrak;

public class CabangPerusahaan {
    private String nama;
    private String alamat;
    private Set<Karyawan> karyawan;
    private Set<Kontrak> kontrak;

    public void setNama(String nama) {
      this.nama = nama;
    }
  
    public void setAlamat(String alamat) {
      this.alamat = alamat;
    }

    public void setKaryawan(Set<Karyawan> karyawan) {
      this.karyawan = karyawan;
    }

    public void setKontrak(Set<Kontrak> kontrak) {
      this.kontrak = kontrak;
    }
  
    public String getNama(){
      return this.nama;
    }
  
    public String getAlamat(){
      return this.alamat;
    }

    public Set<Karyawan> getKaryawan() {
      return this.karyawan;
    }

    public Set<Kontrak> getKontrak() {
      return this.kontrak;
    }
}