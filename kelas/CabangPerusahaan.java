package kelas;

import java.util.*;
import kelas.Karyawan;
import kelas.PenugasanKontrakSewa;
import kelas.Properti;
import java.util.HashSet;

public class CabangPerusahaan {
    private String nama;
    private String alamat;
    private String domisili;
    private Set<Karyawan> karyawan;
    private Set<PenugasanKontrakSewa> penugasan_kontrak_sewa;
    private HashSet<Properti> list_properti;

    public void setNama(String nama) {
      this.nama = nama;
    }
  
    public void setAlamat(String alamat) {
      this.alamat = alamat;
    }

    public void setKaryawan(Set<Karyawan> karyawan) {
      this.karyawan = karyawan;
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

    public void setPenugasanKontrakSewa(Set<PenugasanKontrakSewa> penugasan_kontrak_sewa) {
      this.penugasan_kontrak_sewa = penugasan_kontrak_sewa;
    }

    public Set<PenugasanKontrakSewa> getPenugasanKontrakSewa() {
      return this.penugasan_kontrak_sewa;
    }

    public void setDomisili(String domisili){
      this.domisili = domisili;
    }

    public String getDomisili(){
      return this.domisili;
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