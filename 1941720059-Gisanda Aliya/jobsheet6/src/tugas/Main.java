package tugas;

public class Main {
    public static void main(String[] args) {
        Dosen d1 = new Dosen();
        d1.setNama("Gisanda");
        d1.setSKS(12);

        Pegawai p1 = new Pegawai();
        p1.setNama("Aliya");

        DaftarGaji daftar_gaji = new DaftarGaji(3);
        daftar_gaji.addPegawai(d1);
        daftar_gaji.addPegawai(p1);
        daftar_gaji.printSemuaGaji();
    }
}