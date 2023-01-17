package it.develhope.entities;

public class CollegePerson {
    private String name;
    private String surname;
    private int collegeId;

    //costruttore di CollegePerson
    public CollegePerson(String name, String surname,int collegeId){
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
    }
    //method that prints all the content of CollegePerson class attributes
    public void goToCollege(){
        System.out.println("-Name: " +name + " -Surname: " + surname +" -ID: " +collegeId);
    }

}
