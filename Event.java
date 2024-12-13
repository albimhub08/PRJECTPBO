// Abstract class Event
abstract class Event {
    // Variables
    protected String namaAcara;
    protected String tanggal;
    protected String lokasi;
    protected int jumlahTamu;

    // Constructor
    public Event(String namaAcara, String tanggal, String lokasi, int jumlahTamu) {
        this.namaAcara = namaAcara;
        this.tanggal = tanggal;
        this.lokasi = lokasi;
        this.jumlahTamu = jumlahTamu;
    }

    // Abstract methods
    public abstract float hitungBiaya();

    public abstract void tampilkanDetail();
}