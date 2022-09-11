
package sdl.laporan.pkg10;
public class Mahasiswa {
    private Object Nama;
    private Object NIM;
    private Object Prodi;
    private Object Alamat;
    Mahasiswa(Object Nama, Object NIM, Object Prodi, Object Alamat){
        this.Nama = Nama;
        this.NIM = NIM;
        this.Prodi = Prodi;
        this.Alamat = Alamat;
    }
    public Object getNama() {
        return Nama;
    }
    public void setNama(Object Nama) {
        this.Nama = Nama;
    }
    public Object getNIM() {
        return NIM;
    }
    public void setNIM(Object NIM) {
        this.NIM = NIM;
    }
    public Object getProdi() {
        return Prodi;
    }
    public void setProdi(Object Prodi) {
        this.Prodi = Prodi;
    }
    public Object getAlamat() {
        return Alamat;
    }
    public void setAlamat(Object Alamat) {
        this.Alamat = Alamat;
    }
    @Override
    public String toString() {
        return "Nama = " + Nama + ", NIM = " + NIM + ", Prodi = " + Prodi + ", Alamat = " + Alamat;
    }
}

