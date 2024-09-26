public class Kucing extends Binatang {

    public Kucing(String name) {
        super(name);
    }

    @Override
    public void bersuara() {
        System.out.println(name + " bersuara: Ngeooong");
    }
}
