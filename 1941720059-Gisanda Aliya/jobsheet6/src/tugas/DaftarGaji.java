package tugas;

public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int PegawaiSekarang = 0;

    public DaftarGaji(int jumlah_pegawai){
        listPegawai = new Pegawai[jumlah_pegawai];
    }

    public void addPegawai(Pegawai p){
        listPegawai[PegawaiSekarang] = p;
        PegawaiSekarang++;
    }

    public void printSemuaGaji(){
        for (int i=0;i<PegawaiSekarang;i++){
            System.out.print("Gaji yang didapatkan oleh "+ listPegawai[i].getNama()+" adalah ");
            System.out.println(listPegawai[i].getGaji());
        }
    }
}