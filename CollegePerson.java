public class CollegePerson {
        public String name;
        public String surname;
        public int collegeId;

        public CollegePerson() {
        }

        public void goToCollege() {
            System.out.println("Lo studente con il collegeID= " + this.collegeId + ", name=" + this.name + " and surname=" + this.surname + " sta andando al college");
        }
    }

