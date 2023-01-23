
public class Assistant extends CollegePerson implements TeachingPerson, LearningPerson {
    public boolean isGoingToBeAPhD;

    public void studyAtHome() {
        System.out.println("L'assistente " + this.surname + " sta studiando a casa");
        System.out.println("Is the Assistant " + this.surname + " going to be a PhD? " + this.isGoingToBeAPhD);
    }
    public void teachToOtherPeople() {
        System.out.println("L'assistente" + this.surname + " sta aiutando gli alunni a capire meglio la lezione");
    }

    public Assistant(String name, String surname, int id, boolean willBeAPhD) {
        this.name = name;
        this.surname = surname;
        this.collegeId = id;
        this.isGoingToBeAPhD = willBeAPhD;
    }
}
