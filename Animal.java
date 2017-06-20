class Animal {
    int age;
    String color;
    Point position;

    public Animal(int age, String color, Point position) {
        this.age = age;
        this.color = color;
        this.position = position;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Point getPosition() {
        return position;
    }
    public void setPosition() {
        this.position = position;
    }

    public void moveTo(Point a) {
        this.position = a;
    }

    public void celerateBirthday() {
        age++;
    }
}
