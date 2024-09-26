public class Cemeng extends Kucing {

    public Cemeng(String name) {
        super(name);
    }

    @Override
    public void bersuara() {
        System.out.println(name + " bersuara: Meooong");
    }
}
