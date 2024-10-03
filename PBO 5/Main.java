public class Main {
    public static void main(String[] args) {
       // spiderman
        Spider spider = new Spider();
        spider.walk();
        spider.eat();
        
        System.out.println();

        // doggo
        Dog dog = new Dog();
        dog.setName("Whisky");
        System.out.println("Dog Name: " + dog.getName());
        dog.walk();
        dog.eat();
        dog.play();
        
       System.out.println();

        // cat
        Cat cat = new Cat("Garfiel");
        System.out.println("Cat Name: " + cat.getName());
        cat.walk();
        cat.eat();
        cat.play();
    }
}