public class MainStudentHashTable {
    public static void main(String[] args){
        StudentHashTable hashtable = new StudentHashTable();
        Student std1 = new Student("Jack", "15-123", 3.4);
        Student std2 = new Student("Priah", "15-453", 3.1);
        Student std3 = new Student("Theresa", "15-233", 3.9);

        // get HashCode for each roll number
        int std1key = hashtable.toHashCode(std1.getRollno());
        int std2key = hashtable.toHashCode(std2.getRollno());
        int std3key = hashtable.toHashCode(std3.getRollno());

        hashtable.insert(std1key, std1);
        hashtable.insert(std2key, std2);
        hashtable.insert(std3key, std3);

        hashtable.showData();
    }
}
