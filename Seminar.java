class Seminar extends Event {
    private String topik;

    // Constructor
    public Seminar(String namaAcara, String tanggal, String lokasi, int jumlahTamu, String topik) {
        super(namaAcara, tanggal, lokasi, jumlahTamu);
        this.topik = topik;
    }

    // Implementasi metode hitungBiaya
    @Override
    public float hitungBiaya() {
        float biayaPerTamu = 100000;
        float biayaTopik = 2000000;
        return (jumlahTamu * biayaPerTamu) + biayaTopik;
    }

    // Implementasi metode tampilkanDetail
    @Override
    public void tampilkanDetail() {
        System.out.println("\nDetail Seminar:");
        System.out.println("Nama Acara: " + namaAcara);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Lokasi: " + lokasi);
        System.out.println("Jumlah Tamu: " + jumlahTamu);
        System.out.println("Topik: " + topik);
        System.out.println("Estimasi Biaya: Rp" + hitungBiaya());
    }
}