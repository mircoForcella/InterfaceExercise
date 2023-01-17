package it.develhope.entities;

public class Assistant extends CollegePerson implements ILearningPerson, ITeachingPerson {
    private boolean isGoingToBeAPhD;


    //Constructor Assistant with super class of CollegePerson
    public Assistant(String name, String surname, int collegeId, boolean willBeAPhD) {
        super(name, surname, collegeId);
        this.isGoingToBeAPhD = willBeAPhD;
    }

    @Override
    public void studyAtHome() {
        System.out.println("The assistant is studying from home");
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("The assistant is teaching to other students");

    }
}
