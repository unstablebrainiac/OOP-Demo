class Dog extends Animal {

    public Dog(int age, String color, Point position) {
        super(age, color, position);
    }

    @Override
    public void moveTo(Point a) {
        walk();
        super.moveTo(a);
        System.out.println(a);
    }

    private void walk() {
        // Add walking animation here
        System.out.print(color + " dog is walking to ");
    }
}
