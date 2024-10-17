import java.util.HashSet;
import java.util.Set;

public class University {
    private String name;
    private Set<Course> courseSet;
    private  Set<Student> studentSet;

    public University(String name) {
        this.name = name;
        this.courseSet = new HashSet<>();
        this.studentSet = new HashSet<>();
    }

    public void generateStudent(Integer idStudent, String nameStudent) {
        Student studentToAdd = new Student(idStudent, nameStudent);
        this.studentSet.add(studentToAdd);
    }

    public void generateCourse(Integer idCourse, String nameSubject) {
        Course courseToAdd = new Course(idCourse, nameSubject);
        this.courseSet.add(courseToAdd);
    }

    public void subscribeStudent(Integer idCourse, Integer idStudent){
        try {
            Course course = findCourse(idCourse);
            Student student = findStudent(idStudent);
            course.addStudent(student);
        } catch (UniversityException e) {
            e.printStackTrace();
        }
    }

    public Course findCourse(Integer idCourse) throws UniversityException{
        for (Course course : this.courseSet) {
            if (course.getId().equals(idCourse)){
                return course;
            }
        }
        throw new UniversityException("No se encontro el ID del Curso " + idCourse);
    }

    public Student findStudent(Integer idStudent) throws UniversityException{
        for (Student student : this.studentSet) {
            if (student.getId().equals(idStudent)){
                return student;
            }
        }
        throw new UniversityException("No se encontro el ID del estudiante " + idStudent);
    }
}
