import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis acara:");
        System.out.println("1. Wedding");
        System.out.println("2. Seminar");
        System.out.println("3. Concert");
        System.out.print("Masukkan pilihan (1-3): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Variabel umum
        System.out.print("Masukkan nama acara: ");
        String namaAcara = scanner.nextLine();

        System.out.print("Masukkan tanggal acara: ");
        String tanggal = scanner.nextLine();

        System.out.print("Masukkan lokasi acara: ");
        String lokasi = scanner.nextLine();

        System.out.print("Masukkan jumlah tamu: ");
        int jumlahTamu = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Event event;

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan tema pernikahan: ");
                String temaPernikahan = scanner.nextLine();
                event = new Wedding(namaAcara, tanggal, lokasi, jumlahTamu, temaPernikahan);
                break;
                case 2:
                System.out.print("Masukkan topik seminar: ");
                String topik = scanner.nextLine();
                event = new Seminar(namaAcara, tanggal, lokasi, jumlahTamu, topik);
                break;
            case 3:
                System.out.print("Masukkan nama artis: ");
                String artis = scanner.nextLine();
                event = new Concert(namaAcara, tanggal, lokasi, jumlahTamu, artis);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                scanner.close();
                return;
        }

        // Menampilkan detail acara
        event.tampilkanDetail();
        scanner.close();
    }
}