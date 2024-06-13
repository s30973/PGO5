import java.util.ArrayList;

public class Students {
    private static ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public static void promoteAllStudents() {
        for(int i = 0; i < students.size(); i++) {
            Student currentStudent = students.get(i);

            boolean canBePromoted = currentStudent.getNumberOfITNs() < currentStudent.studyProgramme.allowedITN && currentStudent.status != "Graduate";

            if (canBePromoted) {
                currentStudent.currentSemester++;
            } else {
                System.out.println("Can't be promoted.");
                return;
            }
        }
    }
    public static void displayInfoAboutStudent() {
        for(int i = 0; i < students.size(); i++) {
            Student currentStudent = students.get(i);
            System.out.println(currentStudent.firstName + " " + currentStudent.lastName + " - " + currentStudent.currentSemester);
        }
    }
}
