package kelas;

import java.util.*;
import kelas.Karyawan;
import kelas.AdminKontrak;

public class CabangPerusahaan {
    private String nama;
    private String alamat;
    private Set<Karyawan> karyawan;
    private Set<AdminKontrak> admin_kontrak;

    public void setNama(String nama) {
      this.nama = nama;
    }
  
    public void setAlamat(String alamat) {
      this.alamat = alamat;
    }

    public void setKaryawan(Set<Karyawan> karyawan) {
      this.karyawan = karyawan;
    }

    public void setAdminKontrak(Set<AdminKontrak> admin_kontrak) {
      this.admin_kontrak = admin_kontrak;
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

    public Set<AdminKontrak> getAdminKontrak() {
      return this.admin_kontrak;
    }
}