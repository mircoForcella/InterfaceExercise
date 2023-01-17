package it.develhope.entities;

public class Student extends CollegePerson implements ILearningPerson {
    private int academicYear;

    @Override
    public void studyAtHome() {
        System.out.println("The student is studying from home");
    }

    //Constructor of Student with super class CollegePerson
    public Student(String name,String surname,int collegeId, int academicYear){
        super(name, surname, collegeId);
        this.academicYear = academicYear;
    }
}
