public class Shape {
    protected int sides;
    
    public Shape(int sides) {
        this.sides = sides;
    }

    public String toString() {
        return("This shape has " + this.sides + " sides.");
    }
    
}
