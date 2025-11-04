public class VolumeTabung {

    // Fungsi untuk menghitung volume tabung
    public static double hitungVolume(double jariJari, double tinggi) {
        return Math.PI * jariJari * jariJari * tinggi;
    }

    public static void main(String[] args) {
        double r = 7;      // jari-jari alas tabung
        double t = 10;     // tinggi tabung

        double volume = hitungVolume(r, t);
        System.out.println("Volume tabung adalah: " + volume);
    }
}
