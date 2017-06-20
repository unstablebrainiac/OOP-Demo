class Game {
    public static void main(String args[]) {
        Animal anonymousAnimal = new Animal(10, "Blue", new Point(0,0));
        System.out.println(anonymousAnimal.getPosition());
        anonymousAnimal.moveTo(new Point(10,20));
        System.out.println(anonymousAnimal.getPosition());

        Dog tommy = new Dog(10, "Blue", new Point(0,0));
        System.out.println(tommy.getPosition());
        tommy.moveTo(new Point(10,20));
        System.out.println(tommy.getPosition());

        Snake slithero = new Snake(5, "Green", new Point(5,10));
        System.out.println(slithero.getPosition());
        slithero.moveTo(new Point(5,10));
        System.out.println(slithero.getPosition());
    }
}
