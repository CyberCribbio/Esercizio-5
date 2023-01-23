public class Professor extends CollegePerson implements TeachingPerson {
    public String teachingSubject;

    public void teachToOtherPeople() {
        System.out.println("Professor " + this.surname + " is teaching " + this.teachingSubject + " + in front of the class");
    }

    public Professor(String name, String surname, int id, String subject) {
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.teachingSubject = subject;
    }
}
