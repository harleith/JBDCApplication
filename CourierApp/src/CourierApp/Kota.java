package CourierApp;

public class Kota {
    private String namaKota;
    private String provinsi;

    public Kota() {
    }

    public Kota(String namaKota, String provinsi) {
        this.namaKota = namaKota;
        this.provinsi = provinsi;
    }

    public String getNamaKota() {
        return namaKota;
    }

    public void setNamaKota(String namaKota) {
        this.namaKota = namaKota;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }
    
    public String getKota(){
        
        return namaKota;
    }

    @Override
    public String toString() {
        return this.namaKota; // ini yg akan tampil di combo box
    }
}
