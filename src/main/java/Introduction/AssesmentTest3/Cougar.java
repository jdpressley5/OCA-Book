package Introduction.AssesmentTest3;
public class Cougar extends Puma {
    public static void main(String[] args) {
        Puma puma = new Puma();
        System.out.println(puma.getTailLength());
    }
    public int getTailLength(int length) {return 2;}
}//end class Cougar
