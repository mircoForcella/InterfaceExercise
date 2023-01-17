import it.develhope.entities.Assistant;
import it.develhope.entities.Professor;
import it.develhope.entities.Student;

public class Start {

    public static void main(String[] args) {


        //creation of objects to use for the testing of the methods
        Student student1 = new Student("Marco","Rossi",1,2);
        Professor prof1 = new Professor("Lorenzo","Gustavi",2,"Java");
        Assistant assistant1 = new Assistant("Salvatore","Casato",3,true);

        student1.goToCollege();
        prof1.goToCollege();
        assistant1.goToCollege();

        student1.studyAtHome();
        prof1.teachToOtherPeople();
        assistant1.studyAtHome();
        assistant1.teachToOtherPeople();
    }
}
