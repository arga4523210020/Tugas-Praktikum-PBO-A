public class Main {
    public static void main(String[] args) {
        Persegi p = new Persegi(3);
        System.out.println("Luas Persegi: " + p.luas());
        System.out.println("Keliling Persegi: " + p.keliling());

        Segitiga s = new Segitiga(4, 4);
        System.out.println("Luas Segitiga: " + s.luas());

        Lingkaran el = new Lingkaran(7);
        System.out.println("Luas Lingkaran: " + el.luas());
        System.out.println("Keliling Lingkaran: " + el.keliling());
    }
}
