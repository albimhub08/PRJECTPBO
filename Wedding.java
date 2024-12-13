class Wedding extends Event {
    private String temaPernikahan;

    // Constructor
    public Wedding(String namaAcara, String tanggal, String lokasi, int jumlahTamu, String temaPernikahan) {
        super(namaAcara, tanggal, lokasi, jumlahTamu);
        this.temaPernikahan = temaPernikahan;
    }

    // Implementasi metode hitungBiaya
    @Override
    public float hitungBiaya() {
        // Biaya per tamu, misalnya Rp500.000 per tamu
        float biayaPerTamu = 500000;
        // Biaya tambahan untuk tema, misalnya Rp5.000.000
        float biayaTema = 5000000;
        return (jumlahTamu * biayaPerTamu) + biayaTema;
    }

    // Implementasi metode tampilkanDetail
    @Override
    public void tampilkanDetail() {
        System.out.println("\nDetail Acara Pernikahan:");
        System.out.println("Nama Acara: " + namaAcara);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Lokasi: " + lokasi);
        System.out.println("Jumlah Tamu: " + jumlahTamu);
        System.out.println("Tema Pernikahan: " + temaPernikahan);
        System.out.println("Estimasi Biaya: Rp" + hitungBiaya());
    }
}