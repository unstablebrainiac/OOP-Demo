class Dog extends Animal {

    public Dog(int age, String color, Point position) {
        super(age, color, position);
    }

    @Override
    public void moveTo(Point a) {
        walk();
        super.moveTo(a);
    }

    private void walk() {
        // Add walking animation here
        System.out.println("Walking...");
    }
}
