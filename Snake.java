class Snake extends Animal {

    public Snake(int age, String color, Point position) {
        super(age, color, position);
    }

    @Override
    public void moveTo(Point a) {
        slither();
        super.moveTo(a);
    }

    private void slither() {
        // Add slithering animation here
        System.out.println("Slithering...");
    }
}
