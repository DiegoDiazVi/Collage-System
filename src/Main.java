import java.util.Set;

public class Main {
    public static void main(String[] args) {
        University ean = new University("Ean");

        ean.generateStudent(1, "Diego");
        ean.generateStudent(2, "Esteban");

        ean.generateCourse(1, "Basic Java");
        ean.generateCourse(2, "OOP with Java");

        ean.subscribeStudent(1,3);
        ean.subscribeStudent(1,2);
    }
}