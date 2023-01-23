public class Student extends CollegePerson implements LearningPerson {
    public int academicYear;

    public void studyAtHome() {
        System.out.println("The student " + this.name + " " + this.surname + " is studying at home and is attending the academic year number " + this.academicYear);
    }

    public Student(String name, String surname, int id, int year) {
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.academicYear = year;
    }
}
