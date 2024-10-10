public class Main {
  public static void main(String[] args) {
     Jagoan jakaSembung = new Jagoan("Jaka Sembung", 100.0);
     Jagoan pitung = new Jagoan("Si Pitung", 100.0);

     Senjata golok = new Senjata("Golok", 25.0);
     Senjata toya = new Senjata("Toya", 24.0);

     Jubah jubahPutih = new Jubah("Jubah Putih", 15.0);
     Jubah jubahHitam = new Jubah("Jubah Hitam", 10.0);

     // Set equip untuk Jaka Sembung dan Pitung
     jakaSembung.equipSenjata(golok);
     jakaSembung.equipJubah(jubahPutih);
     jakaSembung.display();

     pitung.equipSenjata(toya);
     pitung.equipJubah(jubahHitam);
     pitung.display();

     System.out.println("\nPERTEMPURAN");

     // Jaka menyerang Pitung 2 kali
     jakaSembung.attack(pitung);
     jakaSembung.attack(pitung);

     // Pitung menyerang Jaka 1 kali
     pitung.attack(jakaSembung);

     // Jaka menyerang Pitung lagi
     jakaSembung.attack(pitung);

     // Pitung menyerang Jaka lagi
     pitung.attack(jakaSembung);

     // Tampilkan status akhir
     jakaSembung.display();
     pitung.display();
  }
}
