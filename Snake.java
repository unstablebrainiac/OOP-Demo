class Snake extends Animal {

    public Snake(int age, String color, Point position) {
        super(age, color, position);
    }

    @Override
    public void moveTo(Point a) {
        slither();
        super.moveTo(a);
        System.out.println(a);
    }

    private void slither() {
        // Add slithering animation here
        System.out.print(color + " snake is slithering to ");
    }
}
