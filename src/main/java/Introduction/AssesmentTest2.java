package Introduction;

public class AssesmentTest2 {
    public static void method() {
        String s1 = "java";
        String s2 = "java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));
    }

    public static void main(String[] args) {
        method();
    }//end main
}//end class AssesmentTest2
