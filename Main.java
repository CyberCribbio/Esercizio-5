public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Student student = new Student("Marco", "Rossi", 140398, 4);
        Professor professor = new Professor("Aldo", "Baglio", 120587, "Videogames");
        Assistant assistant = new Assistant("Guido", "La Vespa", 16895, false);
        student.goToCollege();
        professor.goToCollege();
        assistant.goToCollege();
        student.studyAtHome();
        professor.teachToOtherPeople();
        assistant.studyAtHome();
        assistant.teachToOtherPeople();
    }
}