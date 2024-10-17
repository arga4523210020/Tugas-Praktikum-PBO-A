public class luar {
    String namaLuar = "Luar";
    
    public class Dalam {
        String namaDalam = "Dalam";
        String namaLuar = "Luar";

        public void tampilkanInfo() {
            System.out.println(luar.this.namaLuar);
            System.out.println(namaDalam);
        }
    }

    public static void main(String[] args) {
        luar luar = new luar();
        luar.Dalam dalam = luar.new Dalam();

        dalam.tampilkanInfo();
    }
}