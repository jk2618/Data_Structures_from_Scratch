public class Employee {
    private String name;
    private int age;
    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String toString(){
        return "\n >> Name: " + this.name + ", Age: " + this.age;
    }
    
//    public Employee(String nm, int a){
//        name = nm;
//        age = a;
//    }
//    public String getName(){
//        return name;
//    }
//    public int getAge(){
//        return age;
//    }
//    public void setAge(int a){
//        age = a;
//    }
//    public String toString(){
//        return "\n >> Name: " + name + ", Age: " + age;
//    }
}
