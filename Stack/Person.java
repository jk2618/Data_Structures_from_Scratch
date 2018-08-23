public class Person {
    private String name;
    private String rollno;
    public Person(String name, String rollno){ // constructor
        this.name = name;
        this.rollno = rollno;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){ // override the toString() method
        return "Name: " + this.name + " Rollno: " + this.rollno;
    }
}
