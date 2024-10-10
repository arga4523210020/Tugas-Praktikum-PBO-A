class Jagoan {
  String name;
  double health;
  int level;
  Senjata senjata;
  Jubah jubah;

  Jagoan(String name, double health) {
     this.name = name;
     this.health = health;
  }

  void attack(Jagoan opponent) {
     double attackPower = this.senjata.attackPower;
     System.out.println(this.name + " menyerang " + opponent.name + " dengan kekuatan " + attackPower);
     opponent.defence(attackPower);
  }

  void defence(double attackPower) {
     double damage;
     if (this.jubah.defencePower < attackPower) {
        damage = attackPower - this.jubah.defencePower;
     } else {
        damage = 0.0;
     }

     this.health -= damage;
     System.out.println(this.name + " terkena damage " + damage);
  }

  void equipSenjata(Senjata senjata) {
     this.senjata = senjata;
  }

  void equipJubah(Jubah jubah) {
     this.jubah = jubah;
  }

  void display() {
     System.out.println("\nNama : " + this.name);
     System.out.println("Kesehatan : " + this.health + " hp");
     this.senjata.display();
     this.jubah.display();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getHealth() {
    return health;
  }

  public void setHealth(double health) {
    this.health = health;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public Senjata getSenjata() {
    return senjata;
  }

  public void setSenjata(Senjata senjata) {
    this.senjata = senjata;
  }

  public Jubah getJubah() {
    return jubah;
  }

  public void setJubah(Jubah jubah) {
    this.jubah = jubah;
  }
}
