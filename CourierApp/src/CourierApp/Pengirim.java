package CourierApp;

import java.util.Calendar;
import java.util.Date;

public class Pengirim {
    private String nama;
    private String alamat;
    private String kota;
    private String provinsi;
    private String kodePos;
    private String noTelpon;

    public Pengirim() {
    }

    public Pengirim(String nama, String alamat, String kota, String provinsi, String kodePos, String noTelpon) {
        this.nama = nama;
        this.alamat = alamat;
        this.kota = kota;
        this.provinsi = provinsi;
        this.kodePos = kodePos;
        this.noTelpon = noTelpon;
    }
    
    

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the kota
     */
    public String getKota() {
        return kota;
    }

    /**
     * @param kota the kota to set
     */
    public void setKota(String kota) {
        this.kota = kota;
    }

    /**
     * @return the provinsi
     */
    public String getProvinsi() {
        return provinsi;
    }

    /**
     * @param provinsi the provinsi to set
     */
    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    /**
     * @return the kodePos
     */
    public String getKodePos() {
        return kodePos;
    }

    /**
     * @param kodePos the kodePos to set
     */
    public void setKodePos(String kodePos) {
        this.kodePos = kodePos;
    }

    /**
     * @return the noTelpon
     */
    public String getNoTelpon() {
        return noTelpon;
    }

    /**
     * @param noTelpon the noTelpon to set
     */
    public void setNoTelpon(String noTelpon) {
        this.noTelpon = noTelpon;
    }
    

}
