package Introduction;
public class AssesmentTest12 {
    private String color;
    public AssesmentTest12() {
    this("white");
    }
    public AssesmentTest12(String color) {
    color = color;
    }
    public static void main(String[] args) {
    AssesmentTest12 e = new AssesmentTest12();
    System.out.println("Color:" + e.color);
    }
}