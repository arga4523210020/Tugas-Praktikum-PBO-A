public class Staff extends Karyawan {

    public Staff(String nama) {
        super(nama);
    }

    @Override
    public void kerja() {
        System.out.println(nama + " bantu dosen");
    }
}
