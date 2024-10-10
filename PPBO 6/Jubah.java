class Jubah {
  double defencePower;
  String name;

  Jubah(String name, double defencePower) {
     this.name = name;
     this.defencePower = defencePower;
  }

  void display() {
     System.out.println("Jubah : " + this.name + " , defence : " + this.defencePower);
  }
}
