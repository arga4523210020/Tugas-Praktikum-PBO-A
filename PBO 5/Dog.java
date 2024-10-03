class Dog extends Animal implements Pet {
    private String name;

    public Dog() {
        super(4);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Dog sedang bermain");
    }

    @Override
    public void eat() {
        System.out.println("Dog sedang makan");
    }
}