class Concert extends Event {
    private String artis;

    // Constructor
    public Concert(String namaAcara, String tanggal, String lokasi, int jumlahTamu, String artis) {
        super(namaAcara, tanggal, lokasi, jumlahTamu);
        this.artis = artis;
    }

    // Implementasi metode hitungBiaya
    @Override
    public float hitungBiaya() {
        float biayaPerTamu = 300000;
        float biayaArtis = 10000000;
        return (jumlahTamu * biayaPerTamu) + biayaArtis;
    }

    // Implementasi metode tampilkanDetail
    @Override
    public void tampilkanDetail() {
        System.out.println("\nDetail Konser:");
        System.out.println("Nama Acara: " + namaAcara);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Lokasi: " + lokasi);
        System.out.println("Jumlah Tamu: " + jumlahTamu);
        System.out.println("Artis: " + artis);
        System.out.println("Estimasi Biaya: Rp" + hitungBiaya());
    }
}