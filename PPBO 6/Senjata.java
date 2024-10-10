class Senjata {
  double attackPower;  // Kekuatan serangan senjata
  String name;  // Nama senjata

  // Konstruktor untuk menginisialisasi senjata
  Senjata(String name, double attackPower) {
     this.name = name;
     this.attackPower = attackPower;
  }

  // Metode untuk menampilkan informasi senjata
  void display() {
     System.out.println("Senjata : " + this.name + " , attack : " + this.attackPower);
  }
}
