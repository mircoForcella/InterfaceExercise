package it.develhope.entities;

public class Professor extends CollegePerson implements ITeachingPerson {
    private String teachingSubject;

    @Override
    public void teachToOtherPeople() {
        System.out.println("The teacher is lecturing");
    }

    //constructor of Professor with super class CollegePerson
    public Professor(String name, String surname, int collegeId,String teachingSubject) {
        super(name, surname, collegeId);
        this.teachingSubject = teachingSubject;
    }
}
