class Game {
    public static void main(String args[]) {
        // Animal anonymousAnimal = new Animal(10, "Blue", new Point(0,0));
        // System.out.println(anonymousAnimal.getPosition());
        // anonymousAnimal.moveTo(new Point(10,20));
        // System.out.println(anonymousAnimal.getPosition());
        //
        // Dog tommy = new Dog(10, "Black", new Point(0,0));
        // System.out.println(tommy.getPosition());
        // tommy.moveTo(new Point(10,20));
        // System.out.println(tommy.getPosition());
        //
        // Snake slithero = new Snake(5, "Green", new Point(5,10));
        // System.out.println(slithero.getPosition());
        // slithero.moveTo(new Point(5,10));
        // System.out.println(slithero.getPosition());

        Dog tommy = new Dog(0, "Black", new Point(0,0));
        Snake slithero = new Snake(0, "Green", new Point(0,0));

        boolean turn = true;

        while (true) {
            if (turn) {
                tommy.moveTo(Point.getRandomPoint(10,10));
                if (tommy.getPosition().distanceFromOrigin() > 10) {
                    break;
                }
            } else {
                slithero.moveTo(Point.getRandomPoint(5,5));
                if (slithero.getPosition().distanceFromOrigin() > 10) {
                    break;
                }
            }
            System.out.println();
            turn = !turn;
        }
        System.out.println();
        if (turn) {
            System.out.println("Slithero wins!");
        } else {
            System.out.println("Tommy wins!");
        }
    }
}
