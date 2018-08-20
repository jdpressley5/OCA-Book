package Introduction;
import java.util.*;
public class AssesmentTest10 {
public AssesmentTest10(String n) {
name = n;
}
public static void main(String[] args) {
AssesmentTest10 one = new AssesmentTest10("g1");
AssesmentTest10 two = new AssesmentTest10("g2");
one = two;
two = null;
one = null;
}
private String name; }

//TESTS GARABAGE COLLECTION