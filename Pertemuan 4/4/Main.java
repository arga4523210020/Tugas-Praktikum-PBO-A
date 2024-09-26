public class Main {
    public static void main(String[] args) {
        MobilSport jaguar = new MobilSport("Jaguar");

        jaguar.gigi(1);
        jaguar.gigi(2);
        jaguar.gigi(3);
        jaguar.gigi(4);
        jaguar.gigi(5);

        for (int i = 1; i <= 5; i++) {
            jaguar.gigi(5, i);
        }
    }
}
