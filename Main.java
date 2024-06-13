import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Students students = new Students();

        Student s = new Student("John", "Doe", "doe@wp.pl", "Warsaw, Zlota 12", "333-322-222", new Date(1980, 1, 1));
        students.addStudent(s);

        StudyProgramme it = new StudyProgramme("IT", "AAA", 7, 5);

        System.out.println(s.index);

        s.enrollStudent(it);

        s.addGrade(5, "PGO");
        s.addGrade(2, "APBD");

        Students.promoteAllStudents();

        Students.displayInfoAboutStudent();
    }

}

